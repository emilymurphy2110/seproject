/***************************************************************************************
*    Title: How to Securely Store a Password in Java
*    Author: Andrew
*    Date: 06/12/18
*    Availability: https://dev.to/awwsmm/how-to-encrypt-a-password-in-java-42dh
*
***************************************************************************************/
package controller;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import static java.util.Arrays.fill;

public class Hasher {
	
	private static final int ITERATIONS = 65536;
    private static final int KEY_LENGTH = 512;
    private static final String ALGORITHM = "PBKDF2WithHmacSHA512";
    private static final String salt = "salty12345";

    public static String hashPassword(String password) {
        char[] chars = password.toCharArray();
        byte[] bytes = salt.getBytes();
        PBEKeySpec spec = new PBEKeySpec(chars, bytes, ITERATIONS, KEY_LENGTH);
        fill(chars, Character.MIN_VALUE);
        try {
            SecretKeyFactory fac = SecretKeyFactory.getInstance(ALGORITHM);
            byte[] securePassword = fac.generateSecret(spec).getEncoded();
            return Base64.getEncoder().encodeToString(securePassword);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            ex.printStackTrace();
            return "";
        } finally {
            spec.clearPassword();
        }
    }

}
