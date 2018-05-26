package lab_1_5_1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        while(y<x){
            int j = 0;
            while(j<=y) {
                System.out.print(j+++" ");
            }
            y++;
            System.out.println("");
        }
    }
}
