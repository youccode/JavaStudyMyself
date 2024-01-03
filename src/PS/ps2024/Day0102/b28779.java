package PS.ps2024.Day0102;

import java.io.*;

public class b28779 {
    public static void main(String[] args) throws IOException {
        // Double - Ended - Queue => Deque(덱)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str;
        int num;
        Deque deque = new Deque();

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            String[] arr = null;
            if (str.length() != 1) {
                arr = str.split(" ");
                num = Integer.parseInt(arr[0]);
            } else {
                num = Integer.parseInt(str);
            }
            switch (num) {
                case 1: deque.pushStart(Integer.parseInt(arr[1])); break;
                case 2: deque.pushEnd(Integer.parseInt(arr[1])); break;
                case 3: bw.write(deque.popStart() +"\n"); break;
                case 4: bw.write(deque.popEnd() + "\n"); break;
                case 5: bw.write(deque.getCnt() + "\n"); break;
                case 6: bw.write(deque.isEmpty() +"\n"); break;
                case 7: bw.write(deque.getStart() + "\n"); break;
                case 8: bw.write(deque.getEnd() +"\n"); break;
            }

        }

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
