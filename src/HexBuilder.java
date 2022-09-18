public class HexBuilder {
    public String builder(byte[] hashDigest){
        StringBuilder hexStringBuilder = new StringBuilder();

        for (byte b: hashDigest) {
            hexStringBuilder.append(String.format("%02X", 0xFF & b));
        }
        String hexHashPassword = hexStringBuilder.toString();

        System.out.println(hexHashPassword);

        String confirm = "8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918";
        boolean equals = hexHashPassword.equals(confirm);

        System.out.println("É igual ao anterior formado:");
        System.out.println(equals);
        return hexHashPassword;
    }
}
