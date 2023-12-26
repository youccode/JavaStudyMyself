package ps.Day20231217;

import java.io.*;

public class b28278 {
    public static void main(String[] args) throws IOException {
        // stack을 구현하라
        // 1 x => x를 stack에 push
        // 2 stack의 pop
        // 3 stack의 size를 출력
        // 4 stack이 비어있는지 확인 isEmpty => empty == 1
        // 5 isEmpty 이후, 정수가 존재한다면 가장 위의 정수를 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        Stack stack = new Stack();

        for (int i = 0; i < cnt; i++) {
            String methodName = br.readLine();
            if (methodName.length() > 1) {
                String[] arr = methodName.split(" ");
                stack.push(Integer.parseInt(arr[1]));
            } else {
                int methodNum = Integer.parseInt(methodName);

                switch (methodNum) {
                    case 2: bw.write(stack.pop() + "\n"); break;
                    case 3: bw.write(stack.getSize() + "\n"); break;
                    case 4: bw.write(stack.isEmpty() + "\n"); break;
                    case 5: bw.write(stack.checkTopValue() + "\n"); break;
                }
            }

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