package ps;

import java.util.Scanner;

public class b2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iteration;
        String string;
        String outString = "";

        int loop = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < loop; i++) {
            iteration = scanner.nextInt();
            string = scanner.next();
            scanner.nextLine();
            for (int j = 0; j < string.length(); j++) {
                outString += Character.toString(string.charAt(j)).repeat(iteration); // java에서 String.repeat method를 이용하면 간단하게 반복할 수 있다.
            }
            System.out.println(outString);
            outString = "";

        }
    }
}
