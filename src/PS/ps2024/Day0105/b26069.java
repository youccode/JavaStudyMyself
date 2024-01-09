package PS.ps2024.Day0105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[2];
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ChongChong");

        for (int i = 0; i < N; i++) {
            arr = br.readLine().split(" ");
            if (hashSet.contains(arr[0])) {
                hashSet.add(arr[1]);
            }

            if (hashSet.contains(arr[1])) {
                hashSet.add(arr[0]);
            }
        }

        System.out.println(hashSet.size());
    }
}
