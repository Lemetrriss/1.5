package lab_1_5_7;

import java.util.Scanner;

public class IdealNumbers_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long simple = sc.nextLong();
// Ищем простые числа
        for (int i=1; i<simple; i++){
            boolean b = true;
            for(int j=2; j <=Math.sqrt(i); j++){
                if(i%j == 0) b = false;
            }
            if(b){
// по формуле Евклида 2^(p-1)*(2^p - 1) где (2^p - 1) обязательно простое число
                double p = Math.log(i+1) / Math.log(2);  // зная простое число вычисляем степень "р" через логарифм
                if(p%1 == 0)  //сортируем только целые
                    System.out.println(Math.pow(2, Math.log(i+1) / Math.log(2)-1)*i);  //по формуле 2^(p-1)*(2^p - 1) находим идеальные числа
            }
        }
    }
}