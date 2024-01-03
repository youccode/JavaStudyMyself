package PS.ps2023.Day20231121;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b11478 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < str.length() - i + 1; j++) {
                set.add(str.substring(i, i+j));
            }
        }
        System.out.println(set.size());
        br.close();
    }
}
