package stack;

public class testTheCode {
    public static void main(String[] args) {
        ch6_2<Integer> test = new ch6_2();
        test.push(100);
        System.out.println(test.top());
        test.push(200);
        System.out.println(test.top());
        test.push(300);
        System.out.println(test.top());
        test.push(400);
        System.out.println(test.top());
        test.pop();
        System.out.println(test.top());

        System.out.println(test.pop());
        System.out.println(test.top());
        test.popAll();
        System.out.println(test.top());
        System.out.println(test.isEmpty());
    }
}
