import java.util.Scanner;

public class SquareEquation {
   // 15. Полезное упражнение: напишите программу, которая считает корни
   //уравнения (ax+b)*(cx+d)=0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: \n");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: \n");
        double b = scanner.nextDouble();
        System.out.print("Введите значение c: \n");
        double c = scanner.nextDouble();
        System.out.print("Введите значение d: \n");
        double d = scanner.nextDouble();

        double x1, x2;

        if(a * c == 0){
            if(b * d == 0){
                System.out.println("Решением является любое число");
            }else {
                if(a == 0){
                    x1 = -b / c;
                    System.out.println("Решение заключается в х = " + x1);
                }else {
                    double discriminant = b * b - 4 * a * c;
                    if (discriminant < 0){
                        System.out.println("Дискриминант меньше нуля. Нет решения.  Дискриминант = " + discriminant);
                    }else if ( discriminant == 0){
                        x1 = -b / (2 * a);
                        System.out.println("Решение заключается в ч = " + x1  + " Дискриминант = " + discriminant);
                    }else {
                        x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                        x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                        System.out.println("Решение заключается в следующем x1 = " + x1 + " и x2 = " + x2 + " Дискриминант = " + discriminant);
                    }
                }
            }
        }
    }

}
