package PS.ps2023.Day20230606;

import java.io.*;
import java.util.*;

public class b1181_Comparator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> ar = new ArrayList<>(set);
        Collections.sort(ar, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        for (int i = 0; i < ar.size(); i++) {
            bw.write(ar.get(i) + "\n");
        }
        bw.close();
    }
}
