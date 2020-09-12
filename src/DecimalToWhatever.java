import java.util.Scanner;

public class DecimalToWhatever {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter decimal:");
        int decimal = scanner.nextInt();

        toBinary(decimal);
        toHex(decimal);
        toOctal(decimal);

        scanner.close();

    }

    private static void toBinary(int decimal) {
        int[] binary = new int[40];
        int index = 0;

        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    private static void toHex(int decimal){
        int rem = 0;
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (decimal > 0) {
            rem = decimal % 16;
            hex.insert(0, hexChars[rem]);
            decimal = decimal / 16;
        }

        System.out.println(hex.toString());

    }

    private static void toOctal(int decimal) {
        int rem = 0;
        StringBuilder octal = new StringBuilder();
        char[] octalchars = {'0','1','2','3','4','5','6','7'};

        while (decimal > 0) {
            rem = decimal % 8;
            octal.insert(0, octalchars[rem]);
            decimal = decimal / 8;
        }
        System.out.println(octal);
    }


}
