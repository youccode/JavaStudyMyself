package PS.ps2023.Day20231227;

import java.io.*;

public class b18258 {
    public static void main(String[] args) throws IOException {
        // make a code which only takes tail.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        Queue<Integer> q = new Queue<Integer>();
        String[] order;

        for (int i = 0; i < cnt; i++) {
            order = br.readLine().split(" ");

            switch (order[0]) {
                case "push": q.enqueue(Integer.parseInt(order[1])); break;
                case "pop": {
                    Integer num = q.dequeue();
                    if (num == null) {
                        bw.write("-1\n");
                    } else {
                        bw.write(num + "\n");
                    }
                    break;
                }
                case "size": bw.write(q.getItemNum() + "\n"); break;
                case "front": bw.write(q.getFront() + "\n"); break;
                case "back": bw.write(q.getBack() + "\n"); break;
                case "empty": bw.write(q.isEmpty() + "\n"); break;
            }
        }

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


