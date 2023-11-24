package ps.Day20231124;

public class getGCD {
    // 최대 공약수를 얻는 method

    public int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGcd(b, a % b);
    }

    // a와 b가 주어졌을 때, a에서 b로 나누어지는 만큼을 제외하고 나머지가 b를 나눌 수 있다면
    // 가장 큰 공약수는 그 나머지가 된다.

    // 해당 원리를 지속적으로 이용하여 재귀로서 최대공약수를 구한다.
    // 즉, b == 0이 되는 순간의 a가 바로 최대공약수가 된다.
}
