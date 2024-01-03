package PS.ps2023.Day20230723;


import java.util.*;

public class b7785 {
    public static void main(String[] args) {
        // 첫 째줄에는 출입 기록에 대한 log의 수가 주어짐 => n
        // 다음 줄부터는 "이름 enter/leave"의 형태로 출입 기록이 주어짐

        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(str);
            while (stk.hasMoreTokens()) {
                String name = stk.nextToken();
                String inOut = stk.nextToken();
                if (inOut.charAt(0) == 'e') {
                    set.add(name);
                } else {
                    set.remove(name);
                }
            }

        }
        Object[] ar = set.toArray();
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[ar.length - 1 - i]);
        }
    }
}
