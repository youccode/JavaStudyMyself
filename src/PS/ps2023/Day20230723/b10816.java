package PS.ps2023.Day20230723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b10816 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        br.readLine();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        while(stk.hasMoreTokens()) {
            int a = Integer.parseInt(stk.nextToken());
            if (map.containsKey(a)) {
                map.replace(a, map.get(a) +1 );
            } else {
                map.put(a, 1);
            }
        }
        br.readLine();
        StringTokenizer stk2 = new StringTokenizer(br.readLine());
        while(stk2.hasMoreTokens()) {
            String str = stk2.nextToken();
            if (map.get(Integer.parseInt(str)) != null) {
                sb.append( map.get(Integer.parseInt(str)));
                sb.append(' ');
            } else {
                sb.append(0);
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());

    }
}
