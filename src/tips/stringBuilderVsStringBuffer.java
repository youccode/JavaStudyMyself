package tips;

public class stringBuilderVsStringBuffer {
    public static void main(String[] args) {
        /* StringBuilder와 StringBuffer를 사용하는 이유는 String이 원래 immutable한 DataType이기 때문

        StringBuilder와 StringBuffer는 mutable한 문자의 열이라는 것에서는 동일하다.
        하지만 다음의 아래 항목에서는 차이가 존재한다.

        1. Thread Safety
        StringBuilder는 thread-safe하지 않다. => 동기화가 되지 않는다.
        즉, StringBuilder에 threads가 동시에 접근한다면 외부에서 추가로 동기화 작업을 해주어야만 한다.

        StringBuffer의 경우, 그 자체로 thread-safe하다.
        이미 내부에 Sychronized되어 있으므로 걱정하지 않아도 됨.

        2.Performance

        Single-threaded 상황이라면
        StringBuffer가 thread-safe하고, sychronization을 이용하기 때문에 StringBuilder보다 속도가 느릴 수도 있다.

        Multi-threaded 상황이라면,
        StringBuffer의 경우, sychronization을 이용하므로 StringBuilder 보다 훨씬 safe하게 조작할 수 있다.

        3. Memory Usage

        Both StringBuilder and StringBuffer allocate a larger buffer than needed initially.
        When the buffer overflows, both classes automatically resize the buffer,
        but "StringBuilder" does so in a way that may be more memory-efficient.

        4. Appropriate Use Cases

        StringBuilder
        - Single-threaded environment
          or where multiple threads will not access the same StringBuilder instance concurrently.

        StringBuffer
        - multi-threaded environment and need thread safety.

        */

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello, ");
        stringBuilder.append("World!");

        // Converting StringBuilder to String
        String result = stringBuilder.toString();

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Hello, ");
        stringBuffer.append("World!");

        // Converting StringBuffer to String
        String result2 = stringBuffer.toString();

        // And they almost have every method that String has.
        // delete, insert, substring, replace, reverse - Both
        // charAt / setCharAt - Only for StringBuffer

    }
}
