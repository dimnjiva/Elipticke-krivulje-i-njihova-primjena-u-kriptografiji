package eliptickekrivulje.algoritmi;

import eliptickekrivulje.domene.ECIESPoruka;
import eliptickekrivulje.fileRW.WriteFile;
import eliptickekrivulje.konstante.ParametriDomene;
import java.io.File;
import java.math.BigInteger;
import java.util.Base64;
import java.util.Random;

public class ECIES {

    //stvaranje datoteke u koju ce se spremiti ecies poruka (nakon enkripcije)
    File file = new File("ecies.txt");

    //varijable koje se inicijaliziraju na vrijednosti za krivulju secp192k1, radix = 16 oznacava da se radi o hex. vrijednostima
    BigInteger p = new BigInteger(ParametriDomene.secp192k1_p.replaceAll(" ", ""), 16);
    BigInteger n = new BigInteger(ParametriDomene.secp192k1_n.replaceAll(" ", ""), 16);
    BigInteger G = new BigInteger(ParametriDomene.secp192k1_G.replaceAll(" ", ""), 16);
    private static BigInteger a = new BigInteger(ParametriDomene.secp192k1_a.replaceAll(" ", ""), 16);
    private static BigInteger b = new BigInteger(ParametriDomene.secp192k1_b.replaceAll(" ", ""), 16);
    static String uG = ParametriDomene.secp192k1_uG.replaceAll(" ", "");
    
    private static int bits = 0;
    Random rnd = new Random();

    
    //konstruktor
    public ECIES(String option) {

        switch (option) {
            case "secp192k1":
                p = new BigInteger(ParametriDomene.secp192k1_p.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp192k1_n.replaceAll(" ", ""), 16);
                G = new BigInteger(ParametriDomene.secp192k1_G.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp192k1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp192k1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp192k1_uG.replaceAll(" ", "");
                bits = 6;
                break;
            case "secp192r1":
                p = new BigInteger(ParametriDomene.secp192r1_p.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp192r1_n.replaceAll(" ", ""), 16);
                G = new BigInteger(ParametriDomene.secp192r1_G.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp192r1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp192r1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp192r1_uG.replaceAll(" ", "");
                bits = 6;
                break;
            case "secp224k1":
                p = new BigInteger(ParametriDomene.secp224k1_p.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp224k1_n.replaceAll(" ", ""), 16);
                G = new BigInteger(ParametriDomene.secp224k1_G.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp224k1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp224k1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp224k1_uG.replaceAll(" ", "");
                bits = 7;
                break;
            case "secp224r1":
                p = new BigInteger(ParametriDomene.secp224r1_p.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp224r1_n.replaceAll(" ", ""), 16);
                G = new BigInteger(ParametriDomene.secp224r1_G.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp224r1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp224r1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp224r1_uG.replaceAll(" ", "");
                bits = 7;
                break;
            case "secp256r1":
                p = new BigInteger(ParametriDomene.secp256r1_p.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp256r1_n.replaceAll(" ", ""), 16);
                G = new BigInteger(ParametriDomene.secp256r1_G.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp256r1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp256r1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp256r1_uG.replaceAll(" ", "");
                bits = 8;
                break;
            case "secp384r1":
                p = new BigInteger(ParametriDomene.secp384r1_p.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp384r1_n.replaceAll(" ", ""), 16);
                G = new BigInteger(ParametriDomene.secp384r1_G.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp384r1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp384r1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp384r1_uG.replaceAll(" ", "");
                bits = 12;
                break;
            default:
                p = new BigInteger(ParametriDomene.secp192k1_p.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp192k1_n.replaceAll(" ", ""), 16);
                G = new BigInteger(ParametriDomene.secp192k1_G.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp192k1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp192k1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp192k1_uG.replaceAll(" ", "");
                bits = 6;
        }

    }

    public ECIESPoruka encryptECIES(String plaintext, String publicKey) {
        
        //stvaranje nove ecies poruke
        ECIESPoruka eciesMessage = new ECIESPoruka();
        
        //dekripcija public kljuca publicKey
        BigInteger qa = new BigInteger(Base64.getDecoder().decode(publicKey));
        
        //generira random BigInteger broj
        BigInteger r = new BigInteger(n.bitLength(), rnd);
        
        // R = r * G
        BigInteger R = r.multiply(G);
        
        // S = r * qa
        BigInteger S = r.multiply(qa);
        
        //ekripcija pomocu AES-a
        String encrypted = AES.encrypt(plaintext, Base64.getEncoder().encodeToString(S.toByteArray()));
        eciesMessage.setMessage(encrypted);
        eciesMessage.setR(Base64.getEncoder().encodeToString(R.toByteArray()));
        
        //zapisivanje poruke u datoteku ecies.txt
        WriteFile.write(file, eciesMessage.getMessage(), eciesMessage.getR());

        return eciesMessage;
    }

    public String decrypt(ECIESPoruka eciesMessage, String privateKey) {

        //dekodiranje privatnog kljuca i varijable R iz poruke
        BigInteger dA = new BigInteger(Base64.getDecoder().decode(privateKey));
        BigInteger R = new BigInteger(Base64.getDecoder().decode(eciesMessage.getR()));
        
        //kljuc za dekodiranje je umnozak prethodnih varijabli
        BigInteger S = dA.multiply(R);
        
        //dekripcija poruke
        String decrypt = AES.decrypt(eciesMessage.getMessage(), Base64.getEncoder().encodeToString(S.toByteArray()));

        return decrypt;
    }
}