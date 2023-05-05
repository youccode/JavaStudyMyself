package ps.Day0;

import java.util.Scanner;

public class b2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.nextLine();
        int cookingTime = scanner.nextInt();
        minute = minute + cookingTime;

        if (minute / 60 >=1) {
            hour = hour + minute / 60;
            minute = minute - 60 * (minute / 60);
            if(hour >= 24){
                hour = hour - 24;
                System.out.println(hour + " " + minute);
            } else {
                System.out.println(hour + " " + minute);
            }

        } else {
            System.out.println(hour + " " + minute);
        }
    }
}
