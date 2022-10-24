package Java.HomeWork.JavaHW_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Stream;

public class one {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        ArrayList<Integer> IntegerList = new ArrayList<Integer>(11);
    
        Random randomHelper = new Random();
    
        for (int x = 0; x < 11; x++)
        {
            IntegerList.add(randomHelper.nextInt(256));
        }
        System.out.print("Исходный массив: ");
        System.out.println(IntegerList);
        System.out.print("Массив после удаления четных чисел: ");
        System.out.println(one.removeNegativeValue(IntegerList)); 
        System.out.print("Минимамальное значение исходного массива: ");
        System.out.println(one.getMin(IntegerList));
        System.out.print("Максимальное значение исходного массива: ");
        System.out.println(one.getMax(IntegerList));
        System.out.print("Среднее значение исходного массива: ");
        System.out.println(one.getAverage(IntegerList));
    }
    // Нужно удалить из него четные числа
    public static ArrayList<Integer> removeNegativeValue(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (Integer number: list) {
            if(number % 2 != 0) 
                newList.add(number);
        }
        return new ArrayList<>(newList);
    }
    // public static ArrayList<Integer> removeNegativeValue(ArrayList<Integer> list){
    //     for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
    //         Integer number = iterator.next();
    //         if (number % 2 == 0) {
    //             iterator.remove();
    //         }
    //     }
    //     return new ArrayList<>(list);
    // }
    
    // Найти минимальное значение
    public static Integer getMin(ArrayList<Integer> list){
        int min = Collections.min(list);
        // Альтернатива
        // for (Integer i: list) {
        //     if(i < min) 
        //         min = i;
        // }
        return min;
    }
    
    // Найти максимальное значение
    public static Integer getMax(ArrayList<Integer> list){
        int max = Collections.max(list);
        // Альтернатива
        // for (Integer i: list) {
        //     if(i > max) 
        //         max = i;
        // }
        return max;
    }
    
    // Найти среднее значение
    public static double getAverage(ArrayList<Integer> list){
        OptionalDouble average = list.stream().mapToInt(e -> e).average();
        if (average.isPresent())
        {
            return average.getAsDouble();
        }
        else
            return 0;
    }
}
