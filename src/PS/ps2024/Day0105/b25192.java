package PS.ps2024.Day0105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b25192 {
    public static void main(String[] args) throws IOException {
        // HashSet을 만들어서 존재한다면 count X
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hashSet = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        String str;
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            if (str.equals("ENTER")) {
                hashSet.clear();
            } else {
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
