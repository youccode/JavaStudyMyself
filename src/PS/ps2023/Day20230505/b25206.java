package PS.ps2023.Day20230505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b25206 {

    public  static double calPoint(String point, String eval) {
        double ans = 0;
        switch (eval) {

            case "A+": ans = 4.5 * Double.valueOf(point); break;
            case "A0": ans = 4.0 * Double.valueOf(point); break;
            case "B+": ans = 3.5 * Double.valueOf(point); break;
            case "B0": ans = 3.0 * Double.valueOf(point); break;
            case "C+": ans = 2.5 * Double.valueOf(point); break;
            case "C0": ans = 2.0 * Double.valueOf(point); break;
            case "D+": ans = 1.5 * Double.valueOf(point); break;
            case "D0": ans = 1.0 * Double.valueOf(point); break;
            case "F": break;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalPoint = 0;
        double point = 0;

        // 20줄에 걸쳐서 학점이 나옴
        // 학점에 따라서 학점 x 과목평점의 합을 학점의 총합으로 나눈 후, 출력

        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            if (arr[2].equals("P") ) {
                continue;
            } else {
                totalPoint += calPoint(arr[1], arr[2]);
                point += Double.valueOf(arr[1]);
            }

        }

        // double의 형태로 출력

        System.out.println(totalPoint / point);
    }
}
