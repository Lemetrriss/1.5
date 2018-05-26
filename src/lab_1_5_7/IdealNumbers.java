package lab_1_5_7;

import java.util.Scanner;

public class IdealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long stop = sc.nextLong();
        for (long i = 2; i<stop; i++){
            long num = 1;
            for(long j = 2; j<=Math.sqrt(i); j++){
                if(i%j == 0) {
                    num += j;
                    num += i/j;
                    if (num>i) break;
                }
            }
            if (i == num)
                System.out.println("num = " + num);
        }
    }
}
