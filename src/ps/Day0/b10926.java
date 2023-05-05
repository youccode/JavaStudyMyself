package ps.Day0;

import java.util.Scanner;

public class b10926 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.printf(name + "??!");
    }
}
/* Scanner를 사용하는 과정에서 int를 연속적으로 받게 되는 경우, 중간에 개행문자를 없애주는 과정을 위해서 scanner.nextLine()이 한 번 들어가야 함.*/
