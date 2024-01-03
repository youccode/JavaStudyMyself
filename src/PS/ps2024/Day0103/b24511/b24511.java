package PS.ps2024.Day0103.b24511;

import java.io.*;
import java.util.StringTokenizer;

public class b24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque que = new Deque();
        Deque que2 = new Deque();
        String str = br.readLine();
        int index = 0;
        StringTokenizer stn = new StringTokenizer(br.readLine()," ");

        while (stn.hasMoreTokens()) {
            if (str.charAt(index) == '0') {
                que.pushStart(Integer.parseInt(stn.nextToken()));
            } else {
                stn.nextToken();
            }
            index +=2;
        }
        int M = Integer.parseInt(br.readLine());

        if (que.getCnt() >= M) {
            br.readLine();
            for (int i = 0; i < M; i++) {
                sb.append(que.popStart());
                sb.append(" ");
            }
        } else {
            int target = M - que.getCnt();
            int cnt = que.getCnt();
            StringTokenizer stn2 = new StringTokenizer(br.readLine()," ");
            for (int i = 0; i < cnt; i++) {
                sb.append(que.popStart());
                sb.append(" ");
            }
            for (int i = 0; i < target; i++) {
                sb.append(stn2.nextToken());
                sb.append(" ");
            }
            while(stn2.hasMoreTokens()) {
                stn2.nextToken();
            }
        }

        bw.write(sb.toString()+"\n");

        br.close();
        bw.flush();
        bw.close();



    }
}

class DLNode {
    int value;
    DLNode next;
    DLNode prev;

    DLNode(int value, DLNode next, DLNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    DLNode() {
        this.prev = null;
        this.next = null;
        this.value =0;
    }
}


class Deque {
    DLNode start;
    DLNode end;
    private int cnt;

    Deque() {
        this.cnt = 0;
        this.end = new DLNode();
        this.start = this.end;
    }

    public int getCnt() {
        return this.cnt;
    }

    public int isEmpty() {
        return getCnt() == 0 ? 1:0;
    }

    public void pushStart(int value) {
        this.start.next = new DLNode(value, null, this.start);
        this.start = start.next;
        this.cnt++;
    }

    public void pushEnd(int value) {
        if (isEmpty() == 1) {
            this.end.next = new DLNode(value, null, this.end);
            this.start = this.end.next;
        } else {
            DLNode newNode = new DLNode(value, this.end.next, this.end);
            this.end.next.prev = newNode;
            this.end.next = newNode;
        }
        this.cnt++;
    }

    public int popStart() {
        if (isEmpty() == 1) {
            return -1;
        } else {
            int value = this.start.value;
            this.start = this.start.prev;
            this.start.next = null;
            this.cnt--;
            return value;
        }
    }

    public int popEnd() {
        if (isEmpty() == 1) {
            return -1;
        } else {
            int value = this.end.next.value;
            if (getCnt() == 1) {
                this.end.next = null;
                start = end;
                this.cnt--;
            } else {
                DLNode swap = this.end.next;
                this.end.next = swap.next;
                swap.next.prev = this.end;
                this.cnt--;
            }

            return value;
        }
    }

    public int getStart() {
        if (isEmpty() == 1) {
            return -1;
        } else {
            return this.start.value;
        }
    }

    public int getEnd() {
        if (isEmpty() == 1) {
            return -1;
        } else {
            return this.end.next.value;
        }
    }
}
