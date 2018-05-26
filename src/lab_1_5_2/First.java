package lab_1_5_2;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine()) {
            case "AAA":
                System.out.println("One");
                break;
            case "AAa":
                System.out.println("Two");
                break;
            case "AaA":
            case "aAA":
            case "Aaa":
            case "aaA":
            case "aaa":
                System.out.println("From three to seven");
                break;
            case "aAa":
                System.out.println("aAa");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
