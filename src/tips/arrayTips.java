package tips;

import java.util.Arrays;

public class arrayTips {
    public static void main(String[] args) {
        int[] array1 = new int[3];

        int[] array2;
        array2 = new int[3];

        int[] array3 = new int[]{3,4,5};

        int[] array4;
        array4 = new int[]{3, 4, 5};

        int[] array5 = {3, 4, 5}; // 전부 array를 생성하는 방법들.

        //Primitive 자료형 및 참조형 자료들은 모두 Stack Memory에 위치하고 있음
        // Primitive => data / 참조형 자료 => 객체의 위치값을 가르키는데 초기화해주지 않으면 출력 불가능
        // Primitive는 자료형에 맞게 초기화 / 참조형 자료는 위치값을 가리키고 있지 않다 => null로 초기화
        //Stack이 아닌 Heap 영역에서 객체는 모두 강제로 값을 초기화하게 됨.

        boolean[] array6 = new boolean[3]; // 강제 초기화 진행, 출력값 모두 false;

        System.out.println(Arrays.toString(array3));
        // 다음과 같이 쓰면 [3,4,5]의 형태로 값이 출력됨.

        int[][] array2d1 = new int[3][4]; // 2d array의 생성.
        int[][] array2d2 = {{1,2,3}, {4,5,6}};
        // 다음과 같이 바로 선언을 하는 것도 가능함.

        //배열이 굳이 정방행렬이어야 하지는 않음
        int[][] array2d3 = {{1, 2}, {1, 2, 3}}; // 다음과 같은 생성도 가능함.

    }
}
