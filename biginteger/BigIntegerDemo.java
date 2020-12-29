package biginteger;

import java.math.BigInteger;

public class BigIntegerDemo {

    public static void main(String[] args) {
        BigInteger b1 = BigInteger.valueOf(1);

        int N=100000;
        for(int i=1; i<=N; i++){
            b1 = b1.multiply(BigInteger.valueOf(i));
        }
        System.out.println(b1);

    }
}
