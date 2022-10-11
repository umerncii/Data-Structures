import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static ArrayList<Integer> ContainElement(ArrayList<Integer> newArr) {
        if (newArr.contains(11)) {
            System.out.println("ArrayList contain element 10");
        } else {
            System.out.println("ArrayList does not contain element 10");
        }
        return newArr;
    }

    public static int getMax(int[] newArr) {
        int maxValue = newArr[0];
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > maxValue) {
                maxValue = newArr[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] newArr) {
        int minValue = newArr[0];
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] < minValue) {
                minValue = newArr[i];
            }
        }
        return minValue;
    }
    public static ArrayList<Integer> DescendingOrder(ArrayList<Integer> newArr){
        Collections.sort(newArr, Collections.reverseOrder());
        return newArr;
    }
    public static ArrayList<Integer> AscendingOrder(ArrayList<Integer> newArr){
        Collections.sort(newArr);
        return newArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            newArr.add(i);
        }
        System.out.println(newArr);
        System.out.println(ContainElement(newArr));
        System.out.println("Size of ArrayList " + newArr.size());
        System.out.println("Is our ArrayList is Empty? " + newArr.isEmpty());
        newArr.remove(5);
        System.out.println("Removing index at 5 " + newArr);
        System.out.println("Adding new element in array " + newArr.add(12));
        int[] arr = newArr.stream().mapToInt(Integer::intValue).toArray();//convert an ArrayList containing Integers to primitive int array
        System.out.println("Max value in our ArrayList " + getMax(arr));
        System.out.println("Min value in our ArrayList " + getMin(arr));
        System.out.println("Total size of an ArrayList "+ newArr.size());
        System.out.println("Descending order ArrayList "+ DescendingOrder(newArr));
        System.out.println("Ascending order ArrayList "+AscendingOrder(newArr));

    }
}
