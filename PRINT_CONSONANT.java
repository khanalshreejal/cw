import java.util.Scanner;
public class PRINT_CONSONANT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        String consonant = input.nextLine();

        for (int i = 0; i <= consonant.length(); i++) {
            char lol = consonant.charAt(i);
            if (consonant.charAt(i) == 'a' || consonant.charAt(i) == 'e' || consonant.charAt(i) == 'i' || consonant.charAt(i) == 'o' || consonant.charAt(i) == 'u') {
            } else {
                System.out.println(consonant.charAt(i));
            }
        }
    }
}