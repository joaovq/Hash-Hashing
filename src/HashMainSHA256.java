import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMainSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedOperationException {

//        O mais seguro é o SHA-256
        String password = "colab";

        MessageDigest messageDigest= MessageDigest.getInstance("SHA-256");

        byte[] digest = messageDigest.digest(password.getBytes(StandardCharsets.UTF_8));

        String criptHexPassword = HexBuilder.builder(digest);
    }
}