package lab_1_5_1;
import java.util.Scanner;

public class Zero_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        nod(a,b);
    }

    static void nod(int x, int y){
        int minVal = x<y ? x : y;
        int maxVal = x>y ? x : y;
        if(maxVal%minVal != 0)
            nod(minVal, maxVal-minVal);
        else System.out.println(minVal);
    }
}
