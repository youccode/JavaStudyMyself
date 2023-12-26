package ps.Day20231226.b10773;

import java.io.*;

public class b10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int input;
        int ans = 0;

        Stack stack = new Stack();
        for (int i = 0; i < cnt; i++) {
            input = Integer.parseInt(br.readLine());
            if (input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }

        while (stack.getSize() != 0) {
            ans += stack.pop();
        }

        bw.write(ans + "\n");
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

    public int isEmpty() {
        if (this.size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int checkTopValue() {
        if (this.isEmpty() > 0) {
            return -1;
        } else {
            return this.pointer.value;
        }
    }
}