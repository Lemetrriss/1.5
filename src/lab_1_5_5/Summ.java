package lab_1_5_5;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int summ = 0;
        for(int i = 0; i<=x; i++){
            summ += i;
        }
        System.out.println("The summ is: " + summ);
        System.out.println("The avarage is: " + summ/x);
    }
}