package puzzles.hanckerRank.oneweek;
/**
 * Needed better
 */
public class CaesarCipher
{
   public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

   public static String encrypt(String plainText, int shiftKey)
   {
       plainText = plainText.toLowerCase();
       String cipherText = "";
       for (int i = 0; i < plainText.length(); i++)
       {
           int charPosition = ALPHABET.indexOf(plainText.charAt(i));
           int keyVal = (shiftKey + charPosition) % 26;
           System.out.println("charPosition :"+charPosition +" keyVal :"+keyVal);
           char replaceVal = ALPHABET.charAt(keyVal);
           cipherText += replaceVal;
       }
       return cipherText;
   }

   public static String decrypt(String cipherText, int shiftKey)
   {
       cipherText = cipherText.toLowerCase();
       String plainText = "";
       for (int i = 0; i < cipherText.length(); i++)
       {
           int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
           int keyVal = (charPosition - shiftKey) % 26;
           if (keyVal < 0)
           {
               keyVal = ALPHABET.length() + keyVal;
           }
           char replaceVal = ALPHABET.charAt(keyVal);
           plainText += replaceVal;
       }
       return plainText;
   }

   public static void main(String[] args)
   {
       String message = new String();
       message ="abcd";
       System.out.println(encrypt(message, 3));
       System.out.println(decrypt(encrypt(message, 3), 3));
   }
}
