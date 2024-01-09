package PS.ps2024.Day0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2447 {
    static String[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder[] sb = new StringBuilder[N];

        arr = new String[N];
        Arrays.fill(arr, "");
        starWriting(0, arr.length -1, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        br.close();
    }

    public static void starWriting(int widthStart, int widthEnd, int lengthStart, int lengthEnd) {
        if (widthEnd - widthStart == 2 && lengthEnd - lengthStart == 2) {
            arr[lengthStart] = arr[lengthStart].concat("***");
            arr[lengthStart+1] = arr[lengthStart + 1].concat("* *");
            arr[lengthStart+2] = arr[lengthStart + 2].concat("***");
            return;
        }

        int size = (widthEnd - widthStart) / 3 + 1;
        int count = 0;
        int a = lengthStart;
        for (int i = 0; i < 3; i++) {
            for (int j=widthStart; j< widthEnd; j+=size) {
                count++;
                if(count == 5) {
                    for (int k = 0; k < size; k++) {
                        for (int q = lengthStart + size; q < lengthStart + 2 * size; q++) {
                            arr[q] = arr[q].concat(" ");
                        }
                    }
                }
                else {
                    starWriting(j, j + size - 1, a, a + size - 1);
                }
            }
            a += size;
            }
        }
    }

