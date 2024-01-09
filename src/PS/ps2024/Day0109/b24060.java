package PS.ps2024.Day0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b24060 { // String에 슛자가 들어간 경우, 절대 compareTo로 비교하지 말 것.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar1 = br.readLine().split(" ");
        String[] ar2 = br.readLine().split(" ");
        int arSize = Integer.parseInt(ar1[0]);
        int targetNum = Integer.parseInt(ar1[1]);
        int[] ar1ToInt = new int[arSize];
        for (int i = 0; i < ar2.length; i++) {
            ar1ToInt[i] = Integer.parseInt(ar2[i]);
        }

        Merge merge = new Merge(arSize, targetNum);
        merge.mergeSort(ar1ToInt, 0, ar2.length -1);
        if (!merge.stop) {
            System.out.println(-1);
        }

        br.close();

    }
}

class Merge {
    int cnt;
    int[] arr;
    int index;
    int target;
    boolean stop = false;

    public Merge(int size, int target) {
        this.cnt = 0;
        this.arr = new int[size];
        this.index =0;
        this.target = target;
    }

    public void mergeSort(int[] ar, int start, int end) {
        if (stop) {
            return;
        }
        int mid;

        if (start < end) {
            mid = (start + end) / 2;
            mergeSort(ar, start, mid);
            mergeSort(ar, mid + 1, end);
            merge(ar, start, mid, end);
        }

    }

    public void merge(int[] ar, int start, int mid, int end) {
        if (stop) {
            return;
        }
        int i = start;
        int j = mid + 1;
        this.index = start;
        while (i <= mid && j <= end) {
            if (ar[i] <= ar[j] ) {
                this.arr[this.index++] = ar[i++];

            } else {
                this.arr[this.index++] = ar[j++];
            }
        }

        while (i <= mid) {
            this.arr[this.index++] = ar[i++];

        }

        while (j <= end) {
            this.arr[this.index++] = ar[j++];
        }

        this.index = start;
        int a = start;
        while (a <= end) {
            this.cnt++;
            if (this.target == this.cnt) {
                System.out.println(this.arr[index]);
                this.stop = true;
                return;
            }
            ar[a++] = this.arr[this.index++];
        }
    }
}