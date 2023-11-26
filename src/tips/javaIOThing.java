package tips;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class javaIOThing {

    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter를 사용하기 위해서는 오류를 던져줘야 한다.

        // BufferedReader And BufferedWriter 사용법
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        bw.write(1); // 다음과 같은 경우에는 이걸 수로 인지할지 Character로 인지할 지 모름
        bw.write(1 + ""); // 다음과 같이 String 형으로 바꿔주면 그대로 나옴.

        br.readLine(); // 한 줄을 통으로 읽는 코드
        br.read(); // 하나의 Character를 읽는 코드

        bw.flush();
        bw.close(); // 다음의 코드를 쓰지 않으면 BufferedWriter는 작동하지 않는다. 주의
        br.close(); // 이것도 중요함

        // Scanenr를 이용하여 input을 다루는 방법

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sc.nextInt();
        sc.nextBigInteger(); // 엥간한 것들은 Scanner가 전부 처리해서 변환해준다.
        sc.close();

        // StringTokenizer를 이용하는 것
        // low Performance and Flexibility 단순히 tokenizing하는 작업만 있을 때 사용,

        String str = "This is a Setence for Testing";
        String delimiter = "This is a delimiter such as double qoutes or comma and everething ";
        StringTokenizer stn = new StringTokenizer(str, delimiter);

        stn.hasMoreTokens(); // Tell whether there are more tokens or not
        stn.nextToken(); // spit the token out
    }
}
