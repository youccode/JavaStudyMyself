package PS.ps2024.Day0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2346 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        Deque deque = new Deque();
        for (int i =0; i <N; i++) {
            deque.pushStart(Integer.parseInt(num[i]));
        }

        deque.burstBalloon(sb);
        System.out.println(sb.toString());
    }
}

class DLNode {
    int number;
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
    DLNode pointer;

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
        this.start.number = getCnt();
    }

    public void moveLeft() {
        // 왼쪽으로 한 칸 이동
        // end에 걸리는 경우,
        if (this.pointer.prev == this.end) {
            this.pointer = this.start;
        } else {
            this.pointer = this.pointer.prev;
        }
    }

    public void moveRight() {
        if (this.pointer.next == null) {
            this.pointer = this.end.next;
        } else {
            this.pointer = this.pointer.next;
        }
    }

    public int deleteNode(int a) {
        DLNode out;
        if (getCnt() == 1) {
            this.cnt--;
            return this.pointer.number;
        }

        if (a == 1) { // moveRight
            if (this.pointer.prev == this.end) {
                out = this.start;
                this.start = out.prev;
                this.start.next = null;
                this.cnt--;
            } else {
                out = this.pointer.prev;
                this.pointer.prev = out.prev;
                out.prev.next = this.pointer;
                this.cnt--;
            }
        } else { // moveLeft
            if (this.pointer.next == null) {
                out = this.end.next;
                this.end.next = out.next;
                out.next.prev = this.end;
                this.cnt--;
            } else {
                out = this.pointer.next;
                this.pointer.next = out.next;
                if (out.next != null) {
                    out.next.prev = this.pointer;
                } else {
                    this.start = this.pointer;
                }
                this.cnt--;
            }
        }

        return out.number;
    }


    public void burstBalloon(StringBuilder sb) {
        int move = 0;

        if (this.pointer == null) {
            this.pointer = this.end.next;
        }
        move = pointer.value;

        while(getCnt() != 0) {
            if (getCnt() == 1) {
                sb.append(deleteNode(1));
                break;
            }
            if (pointer.value > 0) {
                for (int i = 0; i < move; i++) {
                    if (i == 0) {
                        moveRight();
                        sb.append(deleteNode(1));
                        sb.append(" ");
                    } else {
                        moveRight();
                    }
                }
            } else {
                for (int i =0; i > move; i--) {
                    if (i == 0) {
                        moveLeft();
                        sb.append(deleteNode(0));
                        sb.append(" ");
                    } else {
                        moveLeft();
                    }
                }

            }

            move = this.pointer.value;
        }
    }
}