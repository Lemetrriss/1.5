package lab_1_5_6;

import java.util.Scanner;

public class SummSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new SummSquares().calc(sc.nextInt()));

    }
    private double calc(int a){
        double summ = 0;
        while(a>9){
            summ += Math.pow((a%10),2);
            a /= 10;
        }
        return summ + Math.pow(a,2);
    }
}