package PS.ps2023.Day20231226.b12789;

import java.io.*;
import java.util.StringTokenizer;

public class b12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        StringTokenizer stn = new StringTokenizer(br.readLine(), " ");
        Stack stk2 = new Stack();

        int cnt = 1;
        boolean check = true;

        while(stn.hasMoreTokens()) {
            int cur = Integer.parseInt(stn.nextToken());

            if (cur == cnt) {
                cnt++;
            } else {
                if (stk2.getSize() == 0) {
                    stk2.push(cur);
                } else {
                    if (stk2.checkTopValue() == cnt) {
                        while(stk2.checkTopValue() == cnt) {
                            stk2.pop();
                            cnt++;
                        }
                        if (stk2.getSize() == 0) {
                            stk2.push(cur);
                        } else {
                            if (stk2.checkTopValue() > cur) {
                                stk2.push(cur);
                            } else {
                                check = false;
                                break;
                            }
                        }
                    } else if(stk2.checkTopValue() > cur) {
                        stk2.push(cur);
                    } else {
                        check = false;
                        break;
                    }
                }
                // topvalue가 cnt인 경우
                // topvalue cnt 아니고, cur도 cnt 아닌 경우
                // topvalue, cur 둘 다 cnt 아니고, cur이 더 작은 경우
            }
        }
        if (check) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

}

class Node {
    int value;
    Node next;
    Node(int a, Node nextNode) {
        value = a;
        next = nextNode;
    }
}

class Stack {

    private int size;
    private Node pointer;
    Stack() {
        size = 0;
        pointer = null;
    }

    public void push(int value) {
        this.size++;
        Node past = this.pointer;
        this.pointer = new Node(value, past);
    }

    public int pop() {
        if (this.size == 0) {
            return -1;
        } else {
            int value = this.pointer.value;
            this.pointer = this.pointer.next;
            this.size--;
            return value;
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int checkTopValue() {
        if (this.isEmpty()) {
            return -1;
        } else {
            return this.pointer.value;
        }
    }
}
