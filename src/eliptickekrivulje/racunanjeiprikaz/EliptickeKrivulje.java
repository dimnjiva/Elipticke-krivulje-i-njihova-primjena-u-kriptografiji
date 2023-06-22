/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eliptickekrivulje.racunanjeiprikaz;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ivadi
 */
public class EliptickeKrivulje extends Tocka {
    private int a;
    private int b;
    static public int p;
    
    /* KONSTRUKTORI */
    
    public EliptickeKrivulje(){
        a = 0;
        b = 0;
        p = 0;
    }
    
    public EliptickeKrivulje(int A, int B, int P){
        a = A;
        b = B;
        p = P;
    }
    
    /* GETTERI */
    
    public int dohvatiA(){
        return a;
    }
    
    public int dohvatiB(){
        return b;
    }
    
    public int dohvatiP(){
        return p;
    }
    
    /* provjera nalazi li se točka na EK */
    
    public boolean TockaNaEK(Tocka t){
        if(t.beskTocka) return true;
        return (t.y * t.y) % p == (t.x * t.x * t.x + a * t.x + b) % p;
    }
    
    /* pomoćna funkcija modInverz */
    
    int modInverz(int x){
        for(int i = 0; i < p; i++){
            if((x * i) % p == 1){
                return i;
            }
        }
        return -1;
    }
    
    /* funkcija za zbroj, ali i dupliciranje */
    
    public Tocka zbroji(Tocka t1, Tocka t2){
        Tocka t = new Tocka();
        int lambda;
        
        if(t1 == null || t2 == null) return null;
        
        /* P + O == O + P == P za beskonacnu tocku O */
        if(t1.beskTocka){
            t.x = t2.x;
            t.y = t2.y;
            t.beskTocka = t2.beskTocka;
            return t;
        }
        
        if(t2.beskTocka){
            t.x = t1.x;
            t.y = t1.y;
            t.beskTocka = t1.beskTocka;
            return t;
        }
        
        /*
            P = (x1, y1), Q = P + P = 2P = (x2, y2)
            lambda = (3x1^2 + a)/(2y1)
            x2 = lambda^2 - 2x1
            y2 = lambda(x1 - x2) - y1
        */
        if((t1.x - t2.x) == 0){
            if((t1.y - t2.y) == 0){ // radi se o dupliciranju
                lambda = ((3 * t1.x * t1.x + a) * modInverz(2 * t1.y));
            }
            /* (x, y) * (x, -y) == O */
            else{
                return beskonacnaTocka();
            }
            int xx = (lambda * lambda - t1.x - t2.x) % p < 0 ? p + (lambda * lambda - t1.x - t2.x) % p : (lambda * lambda - t1.x - t2.x) % p;
            int yy = (lambda * (t1.x - xx) - t1.y) % p < 0 ? p + (lambda * (t1.x - xx) - t1.y) % p : (lambda * (t1.x - xx) - t1.y) % p;
            t.x = xx;
            t.y = yy;
            t.beskTocka = false;
            return t;
        }
        
        /* 
           P = (x1, y1), Q = (x2, y2), P != Q
           P + Q = (x3, y3) = R
           lambda = (y2 - y1)/(x2 - x1)
           x3 = lambda^2 - x1 - x2
           y3 = lambda(x1 - x3) - y1
        */
        else{
            lambda = ((t2.y - t1.y) * modInverz(t2.x - t1.x));
            int xx = (lambda * lambda - t1.x - t2.x) % p < 0 ? p + (lambda * lambda - t1.x - t2.x) % p : (lambda * lambda - t1.x - t2.x) % p;
            int yy = (lambda * (t1.x - xx) - t1.y) % p < 0 ? p + (lambda * (t1.x - xx) - t1.y) % p : (lambda * (t1.x - xx) - t1.y) % p;
            t.x = xx;
            t.y = yy;
            t.beskTocka = false;
        }
        return t;
    }
    
    /* funkcija za oduzimanje */
    
    public Tocka oduzmi(Tocka t1, Tocka t2){
        if(t1 == null || t2 == null) return null;
        
        Tocka t = new Tocka();
        t.x = t2.x;
        t.y = - t2.y;
        t.beskTocka = t2.beskTocka;
        return zbroji(t1, t);
    }
    
    /* funkcija za mnozenje skalarom tipa int */
    
    public Tocka skalarnoMnozenje(Tocka t, int n){
        Tocka T = new Tocka(t);
        
        if(t.beskTocka){
            T.beskTocka = true;
            return T;
        }
                 
        for(int i = 1; i < n; i++){
            T = zbroji(T, t);
        }
        return T;
    }
    
    /* Sve tocke iz intervala (0, 0) - (p, p) koje zadovoljavaju 
       jednadzbu y^2 = x^3 + ax + b spremljene u 
       ArrayList<Tocka>
       Cilj ih je nacrtati :)
    */
    public ArrayList<Tocka> tockeZaCrtanjeINT(){
        ArrayList<Tocka> L = new ArrayList();
        for(int i = 0; i < p; i++){
            for(int j = 0; j < p; j++){
                if((Math.abs(i*i*i + i*a + b - (j+1)*(j+1))) % p == 0){
                    Tocka t = new Tocka();
                    t.x = i;
                    t.y = j;
                    L.add(t);
                }
            }
        }
        return L;
    }
    
    static public class GraphPanel extends JPanel{
        private int width = 600;
        private int height = 600;
        private int padding = 25;
        int Y_HATCH_CNT = 10;
        int X_HATCH_CNT = 10;
        int GRAPH_POINT_WIDTH = 12;
        int mod_num = 0;
        
        private ArrayList<Tocka> lista_tocaka;
        
        public GraphPanel(ArrayList<Tocka> L, int p){
            this.lista_tocaka = L;
            this.mod_num = p;
        }
        
        @Override public Dimension getPreferredSize() {
            return new Dimension(width, height);
        }
        
        @Override protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            X_HATCH_CNT = mod_num - 1;
            Y_HATCH_CNT = mod_num - 1;
            
            g2.drawLine(padding, getHeight() - padding, padding, padding);
            g2.drawLine(padding, getHeight() - padding, getWidth() - padding, getHeight() - padding);

            for (int i = 0; i < Y_HATCH_CNT; i++) {
                int x0 = padding;
                int x1 = GRAPH_POINT_WIDTH + padding;
                int y0 = getHeight() - (((i + 1) * (getHeight() - padding * 2)) / Y_HATCH_CNT + padding);
                int y1 = y0;
                g2.drawLine(x0, y0, x1, y1);
            }
            for (int i = 0; i < X_HATCH_CNT; i++) {
                int x0 = (i + 1) * (getWidth() - padding * 2) / X_HATCH_CNT + padding;
                int x1 = x0;
                int y0 = getHeight() - padding;
                int y1 = y0 - GRAPH_POINT_WIDTH;
                g2.drawLine(x0, y0, x1, y1);
            }
            
            for (int i = 0; i < lista_tocaka.size(); i++) {
                
                int get_scale_x = getWidth() - padding - padding;
                int get_scale_y = getHeight() - padding - padding;
                int x_val = lista_tocaka.get(i).x;
                int y_val = lista_tocaka.get(i).y;
         
                double x_left_to_right = (double) x_val / (mod_num-1);
                double y_left_to_right = (double) y_val / (mod_num-1);
                
                int to_plot_x = (int)(padding + (get_scale_x * x_left_to_right)) - 6; 
                int to_plot_y = (int)(padding + (get_scale_y * y_left_to_right)) - 6;
                
                int ovalW = GRAPH_POINT_WIDTH;
                int ovalH = GRAPH_POINT_WIDTH;
                g2.fillOval(to_plot_x, to_plot_y, ovalW, ovalH);
            }
            
        }
    }
    
    static public void crtaj(ArrayList<Tocka> L, int p){
        
        GraphPanel panel = new GraphPanel(L, p);
        
        JFrame frame = new JFrame("Vizualizacija zadane eliptičke krivulje");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
