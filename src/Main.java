import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Home work loop 2");
        System.out.println("Задача 1. ");
        int summa = 0;
        int[] spending = new int[] {127500,252200,115000,124500,232301};
        for (int element : spending){
            summa +=element;
        }
        System.out.println("Сумма затрат за месяц составила "+summa);
        System.out.println("Задача 2. ");
        int minValue = 1000000;
        int maxValue = -1;
        int[] spendingWeek = new int[5];
        spendingWeek[0] = 127500;
        spendingWeek[1] = 100200;
        spendingWeek[2] = 115000;
        spendingWeek[3] = 124500;
        spendingWeek[4] = 12300;
        for (int element : spendingWeek){
            if (element < minValue) {
                minValue = element;
            }
            if (element > maxValue) {
                maxValue = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+minValue);
        System.out.println("Максимальная сумма трат за неделю составила "+maxValue);


        System.out.println("Задача 3. ");
        double average = 0.00;
        summa = 0;
        for (int element : spending){
            summa +=element;
        }
        average = (double) summa/spending.length;
        System.out.println("Средняя затрат за месяц составила "+average);
        System.out.println("Задача 4. ");
        char currentElement;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length-1; i >=0; i--){
            if (i == 0) {
                System.out.println(reverseFullName[i]);
                break;
            }
            System.out.print(reverseFullName[i]+", ");
        }
        for (int i=0; i<reverseFullName.length/2; i++){
            currentElement = reverseFullName[i];
            reverseFullName[i]= reverseFullName[reverseFullName.length - i-1];
            reverseFullName[reverseFullName.length - i-1] = currentElement;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}