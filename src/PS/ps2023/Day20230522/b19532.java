package PS.ps2023.Day20230522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b19532 {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);
        int c = Integer.parseInt(ar[2]);
        int d = Integer.parseInt(ar[3]);
        int e = Integer.parseInt(ar[4]);
        int f = Integer.parseInt(ar[5]);
        int y = (c*d - f*a) / (b*d - e*a);
        int x = 0;
        if (a == 0) {
            x = (f - e*y) / d;
        } else {
            x = (c - b*y) / a;
        }



        System.out.println(x + " " + y);

    }
}
