package PS.ps2023.Day20231230.b2164;

import java.io.*;

public class b2164 {
    public static void main(String[] args) throws IOException {
        // 가장 앞에 있는 카드를 버리고, 다시 제일 위에 있는 수를 아래로 보낸다. => 새로 push
        // 위의 과정을 반복한 이후, 마지막에 남는 수를 제출

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int top;
        Queue<Integer> que = new Queue<Integer>();

        for (int i = 0; i < N; i++) {
            que.enqueue(i+1);
        }

        while(que.getItemNum() != 1) {
            que.dequeue();
            top = que.dequeue();
            que.enqueue(top);
        }

        bw.write(que.getFront() + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}

class Node<Integer> {
    Integer value;
    Node<Integer> next;

}

class Queue<Integer> {
    Node<Integer> tail;
    private int itemNum;

    public Queue() {
        tail = new Node<Integer>(); // dummy head를 만드는 과정
        tail.next = tail;
        this.itemNum = 0;
    }

    public void enqueue(Integer value ) {
        this.itemNum++;
        Node<Integer> newNode = new Node<Integer>();
        newNode.value = value;
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    public Integer dequeue() {
        if (this.getItemNum() == 0) {
            return null;
        } else if (this.getItemNum() == 1) {
            this.itemNum--;
            Integer item = tail.value;
            tail = new Node<Integer>(); // dummy head를 만드는 과정
            tail.next = tail;
            return item;
        } else {
            this.itemNum--;
            Node<Integer> dum = tail.next;
            Integer item = dum.next.value;
            dum.next = dum.next.next;
            return item;
        }

    }

    public int getItemNum() {
        return this.itemNum;
    }

    public int isEmpty() {
        return getItemNum() == 0 ? 1 : 0 ;
    }

    public int getFront() {
        if (isEmpty() == 1) {
            return -1;
        } else {
            Node<Integer> dum = tail.next;
            return (int) dum.next.value;
        }
    }

    public int getBack() {
        if (isEmpty() == 1) {
            return -1;
        } else {
            return (int) tail.value;
        }
    }


}