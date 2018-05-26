package lab_1_5_4;

public class Divide {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i<200; i++) {
            if(count<=10) {
                if (i % 3 == 0 || i % 4 == 0) {
                    System.out.println(count + ") " + i);
                    count++;
                }
            } else break;
        }
    }
}
