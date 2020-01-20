package ru.geekbreans.lesson2;

import java.util.Arrays;

public class main {
    public static void main(String[] args){

        int[] num = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 }; ///задача 1
        System.out.println(Arrays.toString(change(num)));

        int[] numeral = new int[8]; //задача2
        System.out.println(Arrays.toString(fill(numeral)));

        int[] multOnTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; //задача3
        System.out.println(Arrays.toString(multiplication(multOnTwo)));

        int[] maxMin = {15, 45, 5, 22, 11, 44, -1, 53, 25, 47, 83, 91, 10 }; //задача4
        System.out.println(minMax(maxMin));

        diagonal(); //задача5

        int[] intArrcheckBalance = {1, 1, 1, 2, 1};  //задача6
        System.out.println(checkBalance(intArrcheckBalance));

        int[] arrBias = {1, 2, 3, 4, 5};  //задача7
        int intBias = -2;
        System.out.println(Arrays.toString(bias(arrBias, intBias)));

        System.out.println(Arrays.toString(biasArrOne(arrBias, intBias))); //задача8

    }

    /*
     * 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    private static int[] change(int[] a){  // метод задачи1
        for(int i=0; i<a.length;i++){
            a[i] = a[i]== 0 ? 1 : 0;
        }
        return a;
    }

    /*
     * 2 Задать пустой целочисленный массив размером 8.
     * Написать метод, который помощью цикла заполнит
     * его значениями 1 4 7 10 13 16 19 22;
     */
    private static int[] fill (int[] a){  // метод задачи2
        int n = 0;
        for(int i=0; i<a.length;i++){
            n += 1;
            a[i] = n;
            n += 2;
        }
        return a;
    }

    /*
     * 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
     * написать метод, принимающий на вход массив
     * и умножающий числа меньше 6 на 2;
     */
    private static int[] multiplication(int[] a){ // метод задачи3
        for(int i=0; i<a.length;i++){
            a[i] = a[i] < 6 ? a[i] * 2 : a[i] * 1;
        }
        return a;
    }

    /*
     *4 Задать одномерный массив. Написать методы поиска
     * в нём минимального и максимального элемента;
     */
    private static String minMax(int[] a){   // метод задачи4
        int min = a[0];
        Integer max = a[0];
        for(int i=0; i<a.length;i++){
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }
        return "Макс. число:" + max + ", Мин. число:" +  min;
    }
    /*
     * 5 * Создать квадратный целочисленный массив
     * (количество строк и столбцов одинаковое),
     * заполнить его диагональные элементы единицами, используя цикл(ы);
     */
    private static void diagonal(){  // метод задачи5
        int [][] square = new int[7][7];
        int k = 0;
        for(int i=0;i< square.length;i++){
            for(int j=0;j<square.length;j++){
                if(j==k || square.length-k-1 == j){
                    System.out.printf("%3d", 1);
                }
                else System.out.print("  ");
            }
            System.out.println();
            k++;
        }
    /*  вывод:
        1                     1
           1              1
               1       1
                   1
               1       1
           1              1
        1                     1
    */
    }

    /*
     * 6 ** Написать метод, в который передается не пустой одномерный
     * целочисленный массив, метод должен вернуть true если в массиве есть место,
     * в котором сумма левой и правой части массива равны.
     * Примеры:
     * checkBalance([1, 1, 1, || 2, 1]) → true,
     * checkBalance ([2, 1, 1, 2, 1])  → false,
     * checkBalance ([10, || 1, 2, 3, 4]) → true.
     * Абстрактная граница показана символами ||, эти символы в массив не входят.
     *
     *
     *
     * */
    private static boolean checkBalance(int[]a){  // метод задачи6
        int checkLeft = 0;
        int checkRight = 0;

        for (int i = 0; i < a.length; i++) {
            checkLeft += a[i];
            for (int j = i + 1; j < a.length; j++) {
                checkRight += a[j];
            }
            if (checkLeft == checkRight) return true;
            checkRight = 0;
        }
        return false;
    }

    /*
     * 7 *** Написать метод, которому на вход подаётся одномерный массив
     * и число n (может быть положительным, или отрицательным),
     * при этом метод должен циклически сместить
     * все элементы массива на n позиций.
     */


    /*
     * !!! Нижние задания предпологаю, что сделаны не правильно.
     * Прислушался к вашим рекомендациям  и не стал искать готовые решения.
     * Пусть ошибки будут только моими.
     * Так как не осталось времени разрабатывать новый алгоритм (необходимо еще разобраться с Пул реквестом)
     * сдаю как есть. Если оценка будет ниже, в конце концов пришел учится не для диплома, а для знаний.
     */
    private static int[] bias(int[] a, int b){ // метод задачи7
        int arrOutput[] = new int[a.length];
        int intBias = (b > 0) ? a.length-b : a.length + b - 1 ;
        int score = 0;
        for(int i=intBias; score<a.length;i++){
            if(i==a.length){
                i=0;
            }
            arrOutput[score] = a[i];
            score++;
        }
        return arrOutput;
    }

    /*
     *8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
     */
    private static int[] biasArrOne(int[] a, int b){ // метод задачи8

        String strOutput = "";
        for(int i=0;i<a.length;i++){
            strOutput += a[i] +",";
        }
        int indexStart = 0;
        int indexStop = 0;
        int intBias = (b > 0) ? a.length-b-1 : a.length + b - 1 ;
        int score = 0;
        for(int i=intBias; score<a.length;i++){
            if(i==a.length){
                i=0;
            }
            indexStop = strOutput.indexOf(',' , indexStart);
            a[i] = Integer.valueOf(strOutput.substring(indexStart, indexStop));
            indexStart = indexStop+1;
            score++;
        }
        return a;
    }
}
//Задание на проверку.
