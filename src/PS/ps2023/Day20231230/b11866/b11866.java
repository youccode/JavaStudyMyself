package PS.ps2023.Day20231230.b11866;


import java.util.Scanner;

public class b11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int K = sc.nextInt();
        int N = sc.nextInt();
        int target =0;


        Queue<Integer> que = new Queue<>();
        if (N == 1) {
            for (int i = 0; i < K; i++) {
                sb.append(++target);
                if (i == K - 1) {
                    continue;
                }
                sb.append(", ");
            }
        } else {
            for (int i = 0; i < K; i++) {
                if (++target % N != 0) {
                    que.enqueue(target);
                } else {
                    sb.append(Integer.toString(target));
                    sb.append(", ");
                }
            }

            while(que.getItemNum() > 1) {
                int num = 0;
                if (++target % N != 0) {
                    num = que.dequeue();
                    que.enqueue(num);
                } else {
                    sb.append(Integer.toString(que.dequeue()));
                    sb.append(", ");
                }
            }
            sb.append(que.dequeue());
        }

        sb.append(">");

        System.out.println(sb.toString());


    }

    static class Node<Integer> {
        Integer value;
        Node<Integer> next;

    }

    static class Queue<Integer> {
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
}
