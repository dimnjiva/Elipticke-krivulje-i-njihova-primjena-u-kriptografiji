package eliptickekrivulje.algoritmi;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES {

    private static final String initVector = "encryptionIntVec";

    public static String encrypt(String value, String key) {
        try {
            //message digest (hash value) je povratna vrijednost neke hash funkcije
            //SHA-1 je je jedna od standardnih hash funkcija u kriptografiji (pretvara tekst u 20-bajtnu vrijednost)
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            
            //dekodiranje kljuca key
            byte[] key2 = Base64.getDecoder().decode(key);
            
            //finalno dopunjavanje
            key2 = sha.digest(key2);
            
            //izmjena polja key2 tako da je duljine tocno 16
            key2 = Arrays.copyOf(key2, 16);
            
            //parametri koji su potrebni za inicijalizaciju sifre
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key2, "AES");

            //cipher = sifra
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            //enkriptiranje
            byte[] encrypted = cipher.doFinal(value.getBytes());
            return Base64.getEncoder().encodeToString((encrypted));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String encrypted, String key) {
        try {
            //slicno kao u funkciji za enkripciju
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            byte[] key2 = Base64.getDecoder().decode(key);
            key2 = sha.digest(key2);
            key2 = Arrays.copyOf(key2, 16);

            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key2, "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            
            //prvi argument je DECRYPT_MODE jer se u ovom slucaju radi o dekriptiranju
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            
            //dekriptiranje
            byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
