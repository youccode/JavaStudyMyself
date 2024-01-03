package PS.ps2023.Day0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class b1157 {
    public static void main(String[] args) {
        // 첫 줄에 나오는 String을 upperCase로 변경 => Set으로 받아서 필요한 알파벳들이 무엇인지 확인 => HashMap으로 변경
        // Set => ArrayList로 변경
        // 입력받은 String을 차례대로 돌아가며 존재하는 위치에 1씩 더해줌.
        // 가장 큰 값을 출력력        HashSet<String> set = new
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toUpperCase();
        HashSet<String> set = new HashSet<>();
        String most = "";
        String second = "";
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < string.length(); i++) {
            set.add(Character.toString(string.charAt(i)));
        }
        HashMap<String, Integer> map = new HashMap<>();

        String[] ar = new String[set.size()];
        ar = set.toArray(new String[0]);

        for (int i = 0; i < set.size(); i++) {
            map.put(ar[i], 0);
        }

        for (int i = 0; i < string.length(); i++) {
            int value = map.get(Character.toString(string.charAt(i)));
            map.replace(Character.toString(string.charAt(i)), ++value);
        }

        for (int i = 0; i < ar.length; i++) {

            if(num1 <= map.get(ar[i])) {
                if (num2 < map.get(ar[i])) {
                    num2 = num1;
                    second = most;
                }

                most = ar[i];
                num1 = map.get(ar[i]);
            }
        }
        if (num1 == num2) {
            System.out.println("?");
        } else {
            System.out.println(most);

        }

    }
}
