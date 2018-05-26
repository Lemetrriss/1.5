package lab_1_5_1;
import java.util.Scanner;

public class Zero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        int d = Math.min(a,b);
        while(a%d != 0 || b%d != 0){
            d--;
        }
        System.out.println(d);
    }
}

