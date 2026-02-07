import java.util.Scanner;

public class CharFrequency {

    public static void main(String[] args) {
        //to read string S and C
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        char C = sc.next().charAt(0);
        sc.close();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (C == S.charAt(i)) count++;
        }
        System.out.print(count);
    }
    //Read the character C
    // TODO: Iterate through the string and count occurrences of C
    // TODO: Print the count
}
