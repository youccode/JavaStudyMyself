package PS.ps2023.Day20230606;

import java.io.*;
import java.util.ArrayList;

public class b1181 {
    public static void main(String[] args) throws IOException {

        // 첫째 줄에 몇 개의 단어가 들어오게 되는지 단어의 개수가 주어짐.
        // N개의 단어들을 다음의 기준에 맞게 정렬
        // 길이가 짤은 순서대로 - 길이가 같다면 사전순으로 배열

        // 아쉬운 점, 중복되는 단어를 없애는 것에서 Set이라는 자료구조를 생각해내지 못한 점.
        // 보완점, Arrays나 혹은 Collections class의 Comparator 부분을 개조해서 코딩을 할 수도 있음을 인지할 것.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> ar = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ar.add(0, br.readLine());
            for (int j = 0; j < ar.size() - 1; j++) {
                if (ar.get(j).length() > ar.get(j+1).length()) {
                    String tmp = ar.get(j);
                    ar.set(j, ar.get(j+1));
                    ar.set(j+1, tmp);
                } else if (ar.get(j).length() == ar.get(j + 1).length()) {
                    boolean check = true;
                    int index = 0;
                    while(check) {
                        if (ar.get(j).charAt(index) > ar.get(j+1).charAt(index)) {
                            String tmp = ar.get(j);
                            ar.set(j, ar.get(j+1));
                            ar.set(j+1, tmp);
                            check = false;
                        } else if (ar.get(j).charAt(index) < ar.get(j+1).charAt(index)) {
                            check = false;
                        } else if ( ar.get(j).length() == index +1 ) {
                            ar.remove(j);
                            break;
                        } else {
                            index++;
                        }
                    }
                } else {
                    j = ar.size();
                }
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            bw.write(ar.get(i) + "\n");
        }
        bw.close();

    }
}
