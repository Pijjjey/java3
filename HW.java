import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class HW {
    public static void main(String[] args) {
        //1.Реализовать алгоритм сортировки списков компаратором.
        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(6);
        list.add(0);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        list.forEach(n -> System.out.print(n+","));*/

        //2.Пусть дан произвольный список целых чисел, удалить из него чётные числа.
        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(6);
        list.add(0);
        list.add(3);
        list.add(2);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        
        System.out.println(list);*/

        //3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(6);
        list.add(0);
        list.add(3);
        list.add(2);

        int max = list.get(0);
        int min = list.get(0); 
        int sumItems = 0;
        for (int item : list) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
            sumItems += item;
        }

        float mid = (float)sumItems/list.size();  
          

        System.out.println(max);
        System.out.println(min);
        System.out.println(mid);*/

        //4.Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        /*ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(6);
        list1.add(8);
        list1.add(1);
        list1.add(6);
        list1.add(0);
        list1.add(3);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(8);
        list2.add(23);
        list2.add(9);
        list2.add(0);
        list2.add(3);
        list2.add(1);
        
        int i = 0;
        while(i < list2.size()){
            if(list1.contains(list2.get(i)))
                {
                    i++;
                }
            else{
                    list1.add(list2.get(i));
                    i++;
                }
        }

        System.out.println(list1);*/

        //5-7
        long begin1 = System.currentTimeMillis();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10001; i++) {
            list1.add(0,0);
        }
        long end1 = System.currentTimeMillis();

        long begin2 = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 10001; i++) {
            list2.add(0,0);
        }
        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList: " + (end1 - begin1));
        System.out.println("LinkedList: " + (end2 - begin2));








}
}
