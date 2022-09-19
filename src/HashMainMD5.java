import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMainMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException,UnsupportedOperationException {
        String password = "admin";

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");

        byte[] bytes = password.getBytes(StandardCharsets.UTF_8);

        byte[] digest = messageDigest.digest(bytes);

        String builder = HexBuilder.builder(digest);


    }
}
