package src;

import java.util.Arrays;

public class TwoArraysEqual {
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A,B);
    }
}

class TwoArraysEqualStarter {
    public static void main(String[] args) {
        TwoArraysEqual twoArraysEqual=new TwoArraysEqual();
        System.out.println( twoArraysEqual.check(new long[]{1,2,5,4,0}, new long[] {2,4,5,0,1},5));
        System.out.println( twoArraysEqual.check(new long[]{1,2,5}, new long[] {2,4,15},3));
    }
}