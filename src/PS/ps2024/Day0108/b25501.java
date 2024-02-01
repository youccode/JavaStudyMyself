package PS.ps2024.Day0108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Palindrome palindrome = new Palindrome();
        int ans;
        String str;

        for (int i = 0; i < T; i++) {
            str = br.readLine();
            ans = palindrome.isPalindrome(str);

            sb.append(ans);
            sb.append(" ");
            sb.append(palindrome.getCnt());
            sb.append("\n");

            palindrome.reset();
        }
        System.out.println(sb.toString());
    }

}

class Palindrome {

    private int cnt;

    Palindrome() {
        int cnt = 0;
    }
   int recursion(String s, int l, int r){
        this.cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    int getCnt() {
        return this.cnt;
    }

    void reset() {
        this.cnt = 0;
    }
}
