import static java.lang.Character.*;

public class ROT13  {
Integer offset;
String alphabet = "abcdefghijklmnopqrstuvwxyz";
String capsalphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    ROT13(Character cs, Character cf) {
        offset = alphabet.indexOf(cf) - alphabet.indexOf(cs);

//        ROT13 superSecure = new ROT13('a', 'm');
    }

    ROT13() {
    }

    public String crypt(String text) throws UnsupportedOperationException {
String result = decrypt(encrypt(text));
        return result;
    }

    public String encrypt(String text) {

        StringBuilder encryptedString = new StringBuilder();
        Integer encryptIndex;
        for ( int i = 0; i< text.length(); i ++) {
            if (!isLetter(text.charAt(i))){
                encryptedString.append(text.charAt(i));
            }
            else if (isUpperCase(text.charAt(i))) {
                encryptIndex = capsalphabet.indexOf(text.charAt(i));
                encryptedString.append((capsalphabet.charAt((encryptIndex + offset) % 26)));
            }

            else  {
//                else if (isLowerCase(text.charAt(i))) {
                encryptIndex = alphabet.indexOf(text.charAt(i));
                encryptedString.append(alphabet.charAt((encryptIndex + offset) % 26));
            }
        }
        return encryptedString.toString();

    }
    public String decrypt(String text){
            StringBuilder decryptedString = new StringBuilder();
            Integer decryptIndex;
            for (int i = 0; i < text.length(); i++) {
                if (!isLetter(text.charAt(i))){
                    decryptedString.append(text.charAt(i));
                }
                else if (isUpperCase(text.charAt(i))) {
                    decryptIndex = capsalphabet.indexOf(text.charAt(i));
                    decryptedString.append((capsalphabet.charAt((decryptIndex - offset) % 26)));
                }
                else  {
//                    else if (isLowerCase(text.charAt(i))) {
                    decryptIndex = alphabet.indexOf(text.charAt(i));
                    decryptedString.append(alphabet.charAt((decryptIndex - offset) % 26));
                }
            }
                return decryptedString.toString();
        }
    public static String rotate(String s, Character c) {

        return "";
    }
//
//
}