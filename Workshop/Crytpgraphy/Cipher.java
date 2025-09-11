
import java.util.Scanner;

public class Cipher {
    
    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                char shifted = (char) ((character - base + shift) % 26 + base);
                result.append(shifted);
            } else {

                result.append(character);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        String encrypted = caesarCipher(text, shift);
        String decrypted = caesarCipher(encrypted, 26 - (shift % 26));

        System.out.println("Plaintext : " + text);
        System.out.println("Encrypted : " + encrypted);
        System.out.println("Decrypted : " + decrypted);

        sc.close();
    }
}