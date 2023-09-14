import java.util.Scanner;

public class linearEquation {
    // 14. Полезное упражнение: напишите программу, которая считает корень
    //линейного уравнения ax+b=0
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = input.nextDouble();
        System.out.println("Введите число b");
        double b = input.nextDouble();
        double x = 0;

        if(a == 0 && b == 0){
            System.out.println("Если a = b = 0, то решением уравнения ax + b = 0 является любое число. " + x);
        }else if(a == 0 && b > 0 || b < 0){
            System.out.println("Если a = 0 и b ≠ 0, то уравнение корней не имеет.");
        }else if(a < 0 || a > 0){
            x = -b / a;
            System.out.println("Если a ≠ 0, то уравнение ax + b = 0 называется линейным и имеет ровно одно решение " + x);
        }
    }
}
