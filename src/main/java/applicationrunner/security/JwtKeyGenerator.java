package applicationrunner.security;

import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.util.Base64;

public class JwtKeyGenerator {
    public static void main(String[] args) {
        try {
            // Generate a strong secret key for HMAC
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            keyGen.init(256); // Key size
            SecretKey secretKey = keyGen.generateKey();

            // Convert the secret key to Base64 for easy storage
            String base64Key = Base64.getEncoder().encodeToString(secretKey.getEncoded());
            System.out.println("Generated Secret Key (Base64): " + base64Key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

