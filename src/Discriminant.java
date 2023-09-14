import java.util.Scanner;

public class Discriminant {
    // 16. Полезное упражнение: напишите программу, которая считает дискриминант
    //квадратного уравнения
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а:");
        double a = scanner.nextDouble();

        System.out.println("Введите число b:");
        double b = scanner.nextDouble();

        System.out.println("Введите число c:");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double x1;
        double x2;

        if (discriminant == 0){
            x1 = (-b) / (2 * a);
            System.out.println("x1 = %$, x2 = %$" + x1);
            System.out.println(" 6. Полезное упражнение: напишите программу, которая считает дискриминант квадратного уравнения. Дискриминант равен " + discriminant);

        }else if (discriminant > 0){
            x1 = (-b +Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Дискриминант = " + discriminant +" x1 = %s, x2 = %s", x1,  x2);
        }else if(discriminant < 0){
            x1 = (-b +Math.sqrt(discriminant)) / (2 * a);
            x2 = (b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Дискриминант " + discriminant + " При discriminant < 0 вещественных корней нет.\n " + "Существуют два комплексных корня" + x1 + "" + x2);
        }
    }
}

