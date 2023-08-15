package ps.Day20230723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class b1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);
        String str = "";

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            map1.put(str, i+1);
            map2.put(i+1, str);
        }
        for (int i = 0; i < M; i++) {
            str = br.readLine();
            try {
                System.out.println(map2.get(Integer.valueOf(str)));
            } catch(NumberFormatException e) {
                System.out.println(map1.get(str));
            }
        }
    }
}
