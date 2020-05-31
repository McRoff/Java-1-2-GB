package gb.lessons;

public class MainClass {
    public static void main(String[] args) { //    Задание № 1

        byte bt = 10;                 //
        short sh = 1078;              //
        int in = 2 + 2;               //
        long ln = 900092309;          //
                                      //           Задание № 2
        float fl = 1124.12f;          //
        double db = 25.00003;         //
                                      //
        char ch = 76;                 //
        boolean fall = false;         //

        /* Задание № 3 */
        System.out.println("Ответ уравнения заданных чисел: " + calc(10, 3,8,4));

        /* Задание № 4 */
        System.out.println("Число больше 10 и менее 20 - " + choice(3, 8));

        /* Задание № 5 */
        either(13);

        /* Задание № 6 */
        System.out.println("Заданное число отрицательное? " + trueNegative(-5));

        /* Задание № 7 */
        helloDude("Учитель");

        /* Задание № 8 */
        leapYear(2020);
    }

    /* Метод к заданию № 3 */
    public static int calc(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    /* Метод к заданию № 4 */
    public static boolean choice (int x, int y){
        int res = x + y;
        return res < 20 && res > 10;
    }

    /* Метод к заданию № 5 */
    public static void either (int i){
        if(i >= 0){
        System.out.println("Заданное число " + i + " - положительное");
        } else{
            System.out.println("Заданное число " + i + " - отрицательное");
        }
    }

    /* Метод к заданию № 6 */
    public static boolean trueNegative (int i) {
        return i < 0;
    }

    /* Метод к заданию № 7 */
    public static void helloDude (String name) {
        System.out.println("Привет, " + name + "!");
    }

    /* Метод к заданию № 8 */
    public static void leapYear (int year) {
        int leap = year % 4;
        if ( leap == 0){
            System.out.println("Год " + year + " - является високосным!");
        } else {
            System.out.println("Год " + year + " - не является високосным!");
        }
    }
}