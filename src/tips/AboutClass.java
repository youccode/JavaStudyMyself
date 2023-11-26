package tips;

public class AboutClass {

    public static void main(String[] args) {
        // Java는 객체 지향형 프로그래밍 언어로서 class / abstract class / interface 등을 지원함.
        // Object(객체)는 사용이 가능한 실체 / class는 객체를 만들기 위한 설계도
        // Struct(Java에 존재하지는 않음)는 서로 다른 Data Type을 엮어놓을 수 있음 => 여기서 추가적인 method를 정의하면 class가 되는거임

        // class 명은 대문자로 시작하는 것이 Convention임.

        class A {
            int age = 21; // field => class의 특징을 알 수 있는 속성
            String feel;
            int difficulty;
            int a,b,c,d;
            static int weight = 90;

            static double gatWeight(int weight, int gain) {
                return weight + gain; // static method를 사용할 때는, static 변수만을 사용해야 한다.
                // static method는 객체의 생성없이도 실행이 되어야만 한다. 즉, static이 아닌 instance 변수를 사용하면 에러가 발생하게 됨.
                // static은 class 내부에 정의되지만, field의 변수들은 instance 변수 영역에 정의됨.
            }

            static double getWeight(int weight, int minus, String check) { // method overloading
                if(check == "-") {
                    return weight - minus;
                }
                return weight + minus;
            }

            static void method1(int... values) {
                for(int i=0; i<values.length; i++) {
                    System.out.println(values[i]);
                }
            } // 다음과 같이 parameter에 ...을 붙이게 되면 동일한 여러 개의 입력변수를 values에 배열의 형태로 받아들이게 됨.

            void printArray(int[] a){
                System.out.println(a);
            }

            int aged(int age) {
                return age+1;
            } // method

            A(String feel) {
                this.feel = feel;
            } // constructer 생성자 class 명과 꼭 동일해야만 함.
            A(int difficulty) {
                this.difficulty = difficulty;
            } // constructer도 동일하게 overloading의 기능을 수행함.

            //this는 대부분 안 적어줘도 자동으로 처리를 해주지만, field의 변수명과 parameter의 변수명이 동일한 경우, this를 붙여줘야만 field로 대입과정이 진행된다.

            //this() method는 생성자 내부에서만 사용할 수 있는 것으로, 그 class 자체를 한 번 더 호출하는 것이다.
            A(int a, int b){
                this.a= a;
                this.b = b;
            }
            A(int a, int b, int c) {
                this(a, b);
                this.c = c;
            }
            A(int a, int b, int c, int d) {
                this(a, b, c);
                this.d = d;
            } // 다음과 같이 중복된 상황을 예방하기 위해서 사용됨.
            class B{} // inner class
            A() {

            }
        }

        A a = new A();
        A b = new A();

        System.out.println(a.age);
        b.age++;
        System.out.println(b.age);

        a.printArray(new int[]{1, 2, 3}); // {1,2,3}과 같은 직접적인 대입은 객체의 선언과 동시에 진행되어야 하므로 다음과 같은 방법으로만 array를 parameter로 전달할 수 있다. or 그냥 array 자체를 넘겨주면 됨.


    }
}
