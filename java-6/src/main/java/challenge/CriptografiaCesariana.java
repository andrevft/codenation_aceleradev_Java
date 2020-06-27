package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String text) {
        if (text.equals(""))
            throw  new IllegalArgumentException();
        String textEncrypted = "";
        for (char c : text.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z')
                textEncrypted = textEncrypted + (char)(c+3);
            else
                textEncrypted = textEncrypted + c;
        }
        return textEncrypted;

    }

    @Override
    public String descriptografar(String text) {
        if (text.equals(""))
            throw  new IllegalArgumentException();
        String textFlat = "";
        for (char c : text.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z')
                textFlat = textFlat + (char)(c-3);
            else
                textFlat = textFlat + c;
        }
        return textFlat;

    }
}