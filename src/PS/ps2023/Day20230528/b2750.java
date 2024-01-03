package PS.ps2023.Day20230528;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2750 {

    static ArrayList<Integer> bubbleSorting( int num, ArrayList<Integer> ar) {
            if (ar.size() == 0) {
                ar.add(0, num);
            } else {
                ar.add(0, num);
                for (int i = 0; i < ar.size() -1 ; i++) {
                        if (ar.get(i) > ar.get(i + 1)) {
                            int tmp = ar.get(i);
                            ar.set(i, ar.get(i+1));
                            ar.set(i+1, tmp);
                    }
                }
            }

            return ar;
    }
    public static void main(String[] args) throws IOException {
        // 첫 줄에는 몇 개의 숫자들이 주어질 지에 대한 N이 주어짐.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N개의 숫자들이 크기에 상관없이 랜덤하게 주어질 때, 이를 오름차순으로 정렬하여 하나씩 출력해야 한다.
        // int array를 만들어서 하나씩 저장하여 마지막에 출력.
        // 정렬 방법은 bubble sorting을 활용.
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ar = bubbleSorting(Integer.parseInt(br.readLine()), ar);
        }

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}
