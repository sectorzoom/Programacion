package Actividades_String;

import java.util.Scanner;

public class CaesarCipher {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Porfavor, introduce tu mensaje");
        String originalMessage = scanner.nextLine().toUpperCase();

        String encryptedMessage = encrypt(originalMessage);
        System.out.println("Encrypted Message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }


    public static String encrypt(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (Character.isUpperCase(currentChar)) {
                charArray[i] = (char) ((currentChar - 'A' + 1) % 26 + 'A');
            } else if (Character.isDigit(currentChar)) {
                charArray[i] = (char) ((currentChar - '0' + 1) % 10 + '0');
            }
        }
        return new String(charArray);
    }

    public static String decrypt(String encryptedMessage) {
        char[] charArray = encryptedMessage.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (Character.isUpperCase(currentChar)) {
                charArray[i] = (char) ((currentChar - 'A' - 1 + 26) % 26 + 'A');
            } else if (Character.isDigit(currentChar)) {
                charArray[i] = (char) ((currentChar - '0' - 1 + 10) % 10 + '0');
            }
        }
        return new String(charArray);
    }
}


