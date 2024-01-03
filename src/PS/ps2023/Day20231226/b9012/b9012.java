package PS.ps2023.Day20231226.b9012;

import java.io.*;

public class b9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] input;
        int ans = 0;

        for (int i = 0; i < cnt; i++) {
            Stack stack = new Stack();
            input = br.readLine().split("");
            if (input.length % 2 == 1) {
                bw.write("NO\n");
            } else {
                for (int j = input.length - 1; j >= 0; j--) {
                    if (stack.getSize() == 0) {
                        if (input[j].equals("(")) {
                            stack.push(input[j]);
                            bw.write("NO\n");
                            break;
                        } else {
                            stack.push(input[j]);
                        }
                    } else {
                        if (!stack.checkTopValue().equals(input[j])) {
                            stack.pop();
                        } else {
                            stack.push(input[j]);
                        }
                    }
                }

                if (stack.getSize() == 0) {
                    bw.write("YES\n");
                } else if (stack.checkTopValue().equals(")")) {
                    bw.write("NO\n");
                }
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }
}

class Node {
    String value;
    Node next;
    Node(String a, Node nextNode) {
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

    public void push(String value) {
        this.size++;
        Node past = this.pointer;
        this.pointer = new Node(value, past);

    }

    public String pop() {
        if (this.size == 0) {
            return null;
        } else {
            String value = this.pointer.value;
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

    public String checkTopValue() {
        if (this.isEmpty() > 0) {
            return null;
        } else {
            return this.pointer.value;
        }
    }
}
