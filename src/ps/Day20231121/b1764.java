package ps.Day20231121;

import java.io.*;
import java.util.*;

public class b1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nums = br.readLine().split(" ");
        int numListen = Integer.parseInt(nums[0]);
        int numSee = Integer.parseInt(nums[1]);
        int numMatch = 0;

        HashSet<String> noListen = new HashSet<String>(numListen);
        HashSet<String> noListenAndSee = new HashSet<String>();

        for (int i = 0; i < numListen; i++) {
            noListen.add(br.readLine());
        }
        for (int i = 0; i < numSee; i++) {
            String str = br.readLine();
            if (noListen.contains(str)) {
                noListenAndSee.add(str);
                numMatch++;
            }
        }

        bw.write(numMatch + "\n");
        List<String> li = new ArrayList<String>(noListenAndSee);
        Collections.sort(li);

        Iterator<String> iter = li.iterator();
        while(iter.hasNext()){
            bw.write(iter.next() + "\n");
        }
        bw.close(); // This is the main Point when using BufferedWriter
    }
}
