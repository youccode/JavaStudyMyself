package PS.ps2023.Day20230502;

import java.util.Scanner;

public class b11718 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.hasNext());
        while (scanner.hasNext()) {
            scanner.nextLine();
            System.out.println(scanner.hasNext());
        }
    }
}
