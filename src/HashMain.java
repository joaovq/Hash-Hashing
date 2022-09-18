import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMain {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        String password = "admin";

        MessageDigest messageDigest= MessageDigest.getInstance("SHA-256");

        byte[] digest = messageDigest.digest(password.getBytes());

        String criptHexPassword = new HexBuilder().builder(digest);
    }
}