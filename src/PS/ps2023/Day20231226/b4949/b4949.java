package PS.ps2023.Day20231226.b4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String check;


        while (!input.equals(".")) {
            Stack stack = new Stack();
            StringTokenizer stn = new StringTokenizer(input, " ");
            a :while(stn.hasMoreTokens()) {
                check = stn.nextToken();
                if (isParen(check)) {
                    for (int i = 0; i < check.length(); i++) {
                        if (isParen(check.charAt(i))) {
                            if (!stack.push(check.charAt(i))) {
                                break a;
                            }
                        }
                    }
                }
            }
            if (stack.getSize() != 0) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
            input = br.readLine();
        }

        br.close();
    }

    public static boolean isParen(String a) {
        return a.contains("(") || a.contains(")") || a.contains("[") || a.contains("]");
    }

    public static boolean isParen(Character a) {
        return a == '(' || a == ')' || a == '[' || a == ']';
    }
}

class Node {
    Character value;
    Node next;
    Node(Character a, Node nextNode) {
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

    public boolean push(Character value) {
            if (pushParen(value)) {
                this.size++;
                Node past = this.pointer;
                this.pointer = new Node(value, past);
                return true;
            } else {
                if (getSize() == 0) {
                    this.size++;
                    return false;
                }
                if (matchParen(value, checkTopValue())) {
                    pop();
                    return true;
                } else {
                    return false;
                }
            }
        }



    public Character pop() {
        if (this.size == 0) {
            return null;
        } else {
            Character value = this.pointer.value;
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

    public Character checkTopValue() {
        if (this.isEmpty() > 0) {
            return null;
        } else {
            return this.pointer.value;
        }
    }

    public boolean pushParen(Character a) {
        return a == '(' || a == '[';
    }

    public boolean matchParen(Character push, Character cur) {
        if (cur == '(' && push == ')') return true;
        return cur == '[' && push == ']';
    }
}
