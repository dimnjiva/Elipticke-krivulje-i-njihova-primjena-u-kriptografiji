package eliptickekrivulje.generatorkljuca;

import eliptickekrivulje.domene.ParKljuceva;
import eliptickekrivulje.fileRW.WriteFile;
import eliptickekrivulje.konstante.ParametriDomene;
import java.io.File;
import java.math.BigInteger;
import java.util.Base64;
import java.util.Random;

public class GeneratorKljuca {

    Random rnd = new Random();

    //datoteke u koje ce se zapisivati kljucevi
    File filePublic = new File("publicKey.txt");
    File filePrivate = new File("privateKey.txt");

    //varijable inicijalizirane za elipticku krivulju secp192k1
    BigInteger p = new BigInteger(ParametriDomene.secp192k1_p.replaceAll(" ", ""), 16);
    BigInteger g = new BigInteger(ParametriDomene.secp192k1_G.replaceAll(" ", ""), 16);
    BigInteger n = new BigInteger(ParametriDomene.secp192k1_n.replaceAll(" ", ""), 16);
    private static BigInteger a = new BigInteger(ParametriDomene.secp192k1_a.replaceAll(" ", ""), 16);
    private static BigInteger b = new BigInteger(ParametriDomene.secp192k1_b.replaceAll(" ", ""), 16);
    static String uG = ParametriDomene.secp192k1_uG.replaceAll(" ", "");
    
    private static int bits = 0;

    //konstruktor
    public GeneratorKljuca(String option) {

        switch (option) {
            case "secp192k1":
                p = new BigInteger(ParametriDomene.secp192k1_p.replaceAll(" ", ""), 16);
                g = new BigInteger(ParametriDomene.secp192k1_G.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp192k1_n.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp192k1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp192k1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp192k1_uG.replaceAll(" ", "");
                bits = 6;
                break;
            case "secp192r1":
                p = new BigInteger(ParametriDomene.secp192r1_p.replaceAll(" ", ""), 16);
                g = new BigInteger(ParametriDomene.secp192r1_G.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp192r1_n.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp192r1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp192r1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp192r1_uG.replaceAll(" ", "");
                bits = 6;
                break;
            case "secp224k1":
                p = new BigInteger(ParametriDomene.secp224k1_p.replaceAll(" ", ""), 16);
                g = new BigInteger(ParametriDomene.secp224k1_G.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp224k1_n.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp224k1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp224k1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp224k1_uG.replaceAll(" ", "");
                bits = 7;
                break;
            case "secp224r1":
                p = new BigInteger(ParametriDomene.secp224r1_p.replaceAll(" ", ""), 16);
                g = new BigInteger(ParametriDomene.secp224r1_G.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp224r1_n.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp224r1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp224r1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp224r1_uG.replaceAll(" ", "");
                bits = 7;
                break;
            case "secp256r1":
                p = new BigInteger(ParametriDomene.secp256r1_p.replaceAll(" ", ""), 16);
                g = new BigInteger(ParametriDomene.secp256r1_G.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp256r1_n.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp256r1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp256r1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp256r1_uG.replaceAll(" ", "");
                bits = 8;
                break;
            case "secp384r1":
                p = new BigInteger(ParametriDomene.secp384r1_p.replaceAll(" ", ""), 16);
                g = new BigInteger(ParametriDomene.secp384r1_G.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp384r1_n.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp384r1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp384r1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp384r1_uG.replaceAll(" ", "");
                bits = 12;
                break;
            default:
                p = new BigInteger(ParametriDomene.secp192k1_p.replaceAll(" ", ""), 16);
                g = new BigInteger(ParametriDomene.secp192k1_G.replaceAll(" ", ""), 16);
                n = new BigInteger(ParametriDomene.secp192k1_n.replaceAll(" ", ""), 16);
                a = new BigInteger(ParametriDomene.secp192k1_a.replaceAll(" ", ""), 16);
                b = new BigInteger(ParametriDomene.secp192k1_b.replaceAll(" ", ""), 16);
                uG = ParametriDomene.secp192k1_uG.replaceAll(" ", "");
                bits = 6;
        }

    }

    //funkcija generiranja kljuceva i zapisivanja u datoteke
    public ParKljuceva generateKeys() {

        ParKljuceva keyPair = new ParKljuceva();

        //stvaranje random BigInteger broja
        BigInteger d = new BigInteger(n.bitLength(), rnd);
        
        //postavljanje i zapisivanje i zapisivanje u datoteku private kljuca
        keyPair.setPrivateKey(Base64.getEncoder().encodeToString(d.toByteArray()));
        WriteFile.write(filePrivate, Base64.getEncoder().encodeToString(d.toByteArray()));

        // Q = d * g
        BigInteger Q = d.multiply(g);
        
        //postavljanje i zapisivanje u datoteku public kljuca
        keyPair.setPublicKey(Base64.getEncoder().encodeToString(Q.toByteArray()));
        WriteFile.write(filePublic, Base64.getEncoder().encodeToString(Q.toByteArray()));

        return keyPair;
    }
}