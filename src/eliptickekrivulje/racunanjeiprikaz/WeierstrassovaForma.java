/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eliptickekrivulje.racunanjeiprikaz;


public class WeierstrassovaForma {
    private float a;
    private float b;
    
    public WeierstrassovaForma(){}
    
    WeierstrassovaForma(float A, float B){
        a = A; 
        b = B;
    }
    
    public float getA(){
        return a;
    }
    
    public float getB(){
        return b;
    }
    
    /* Da bi postojala Weierstrassova forma
       mora vrijediti: 4*c4^3 + 27*c6^2 != 0
    */
    public boolean postojiLiKratkaWF(float a1, float a3, float a2, float a4, float a6){
        float b2 = 4*a2 + a1*a1;
        float b4 =  2*a4 + a1*a3;
        float b6 = 4*a6 + a3*a3;
        
        float b8 = 1/4*(b2*b6 - b4*b4);

        float c4 = b2*b2 - 24*b4;
        float c6 = -b2*b2*b2 + 36*b2*b4 - 216*b6;
        
        if(4*c4*c4*c4 + 27*c6*c6 == 0) return false;
        return true;
    }

    /* Transformiram elipticku krivulju oblika
       y^2 + a1xy + a3y = x^3 + a2x^2 + a4x + a6
       u kratku Weierstrassovu formu oblika
       y^2 = x^3 + ax + b
    */
    public void kratkaWF(float a1, float a3, float a2, float a4, float a6){

        /* Koristim supstituciju y --> 1/2*(y - a1x - a3) i dobivam:
           y^2 = 4x^3 + (4a2 + a1^2)x^2 + 2(2a4 + a1a3)x + 4a6 + a3^2
           ekv. y^2 = 4x^3 + b2x^2 + 2*b4x + b6
        */
        float b2 = 4*a2 + a1*a1;
        float b4 =  2*a4 + a1*a3;
        float b6 = 4*a6 + a3*a3;
        
        float b8 = 1/4*(b2*b6 - b4*b4);
        
        /* Uvodim suspstituciju x -->(x - 3b2)/36 
           i y --> y/108 te dobivam jednadzbu u Weierstrassovoj 
           formi: y^2 = x^3 - 27c4x - 54c6 gdje je
           c4 = b2^2 - 24*b4, a c6 = -b2^3 + 36*b2*b4 - 216*b6
        */
        float c4 = b2*b2 - 24*b4;
        float c6 = -b2*b2*b2 + 36*b2*b4 - 216*b6;
        
        if(4*c4*c4*c4 + 27*c6*c6 == 0) return;
       
        a = -27*c4;
        b = -54*c6;
    }
    
    @Override public String toString(){
        return "y^2 = x^3 + " + a + "x + " + b;      
    }  
}