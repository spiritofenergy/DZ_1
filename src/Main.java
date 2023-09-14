import java.util.Scanner;

public class Main {
    // 6 . Вывести значение деления 100 на пи
    public static void main(String[] args) {
        System.out.println("1 Выведите ваше имя в консоль " + "Marat " + " Марат");
        System.out.println("2 Выведите любимое стихотворение в консоль " + "\n" +
                "   Пушкин Александр Сергеевич\n" +
                "       Осень (Отрывок)");
        System.out.println("\n" +
                "   Октябрь уж наступил -- уж роща отряхает\n" +
                "   Последние листы с нагих своих ветвей;\n" +
                "   Дохнул осенний хлад -- дорога промерзает.\n" +
                "   Журча еще бежит за мельницу ручей,\n" +
                "   Но пруд уже застыл; сосед мой поспешает\n" +
                "   В отъезжие поля с охотою своей,\n" +
                "   И страждут озими от бешеной забавы,\n" +
                "   И будит лай собак уснувшие дубравы. \n \n");

        System.out.println("4. Вывести значение 2+2*2 = " + (2 + 2 * 2));
        System.out.println("5. Вывести значение (2+2)*2 = " + (2 + 2) * 2);
        System.out.println("6. Вывести значение деления 100 на пи? = " + 100 / Math.PI);

        int x = 12345;
        System.out.println("7. Вывести значение 12345 в третьей степени =  " + x * x * x);

        int value1 = (int) Math.pow(2, 10);
        double result1 = Math.sqrt(value1);
        System.out.println("8. Вывести квадратный корень от двух в 10 степени = " + result1);

        double value2 = Math.sqrt(2);
        double result2 = Math.pow(value2, 10);
        System.out.println("9. Вывести корень из двух, возведенный в 10 степень = " + result2);
        System.out.println("10. Что будет, если в джаве поделить на ноль? Проверить. " + "Программа выдаст / dy zero");
        String uno = "Hello";
        String two = "World";
        System.out.println("11. Попробуйте сложить две строки в Java. Выведите результат. " + "Привет" + " Мир" + " или " + uno + " " + two);

        String uno2 = "Hello world";
        String two2 = "world";
        String result = "";
        result = uno2.replace(two2, "");

        String str_1 = "Hello world";
        String[]  words = str_1.split(" ");
        System.out.println("12. Попробуйте вычесть  из " + uno2 + "  " + two2 + ", разделить две строки " + str_1);
        System.out.println(result);
        for (String word: words){
            System.out.println(word);
        }
        String uno3 = "Hello world";
        String two3 = new String(String.valueOf(Math.PI));
        System.out.println("13. Попробуйте сложить строку с числом пи. Что получилось? " + uno3 + " " + two3);

        double a, b, c;
        a = 10;
        b = 4;
        c = 3;
        double discriminant = b * b - 4 * a * c;
        System.out.println("16. Полезное упражнение: напишите программу, которая считает дискриминант квадратного уравнения. Дискриминант равен " + discriminant);

    }
    }





