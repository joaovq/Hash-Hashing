import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMainMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "admin";

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");

        byte[] bytes = password.getBytes();

        byte[] digest = messageDigest.digest(bytes);

        String builder = new HexBuilder().builder(digest);


    }
}