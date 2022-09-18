import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMainSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {

//        O mais seguro é o SHA-256
        String password = "colab";

        MessageDigest messageDigest= MessageDigest.getInstance("SHA-256");

        byte[] digest = messageDigest.digest(password.getBytes());

        String criptHexPassword = new HexBuilder().builder(digest);
    }
}