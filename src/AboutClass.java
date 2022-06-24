
public class AboutClass {

    public static void main(String[] args) {
        // Java는 객체 지향형 프로그래밍 언어로서 class / abstract class / interface 등을 지원함.
        // Object(객체)는 사용이 가능한 실체 / class는 객체를 만들기 위한 설계도
        // Struct(Java에 존재하지는 않음)는 서로 다른 Data Type을 엮어놓을 수 있음 => 여기서 추가적인 method를 정의하면 class가 되는거임

        // class 명은 대문자로 시작하는 것이 Convention임.

        class A {
            int age = 21; // field => class의 특징을 알 수 있는 속성

            int aged(int age) {
                return age+1;
            } // method

            A() {

            } // constructer 생성자

            class B{} // inner class
        }

        A a = new A();
        A b = new A();

        System.out.println(a.age);
        b.age++;
        System.out.println(b.age);


    }
}
