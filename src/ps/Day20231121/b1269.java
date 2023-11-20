package ps.Day20231121;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class b1269 {
    public static void main(String[] args ) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer stn = new StringTokenizer(str);

        int numA = Integer.parseInt(stn.nextToken());
        int numB = Integer.parseInt(stn.nextToken());
        int cnt = 0;

        HashSet<Integer> setA = new HashSet<Integer>();
        HashSet<Integer> setB = new HashSet<Integer>();

        String[] itemA = br.readLine().split(" ");
        for (int i = 0; i < numA; i++) {
            setA.add(Integer.parseInt(itemA[i]));
        }

        String[] itemB = br.readLine().split(" ");

        for (int i = 0; i < numB; i++) {
            int value = Integer.parseInt(itemB[i]);
            if (setA.contains(value)) {
                setA.remove(value);
            } else {
                cnt++;
            }
        }

        cnt = cnt + setA.size();
        System.out.println(cnt);

        sc.close();
        br.close();

    }
}
