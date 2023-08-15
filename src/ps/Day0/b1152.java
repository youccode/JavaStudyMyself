package ps.Day0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class b1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        String string = scanner.nextLine();
        if (string.equals("") || string.equals(" ")) {
            System.out.println(0);
        } else if (string.charAt(0) == ' ' || string.charAt(string.length() - 1) == ' ') {
            string = string.trim();
            ArrayList<String> ar = new ArrayList<>(Arrays.asList(string.split(" ")));
            System.out.println(ar.size());
        } else {
            ArrayList<String> ar = new ArrayList<>(Arrays.asList(string.split(" ")));
            System.out.println(ar.size());
        }



    }
}
