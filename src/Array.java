import sun.font.TrueTypeFont;

import java.util.ArrayList;

public class Array {
    public static ArrayList<Integer> ContainElement(ArrayList<Integer> newArr){
        if(newArr.contains(11)){
            System.out.println("ArrayList contain element 10");
        }else {
            System.out.println("ArrayList does not contain element 10");
        }
        return newArr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=1; i<=10; i++){
            newArr.add(i);
        }
        System.out.println(newArr);
        System.out.println(ContainElement(newArr));
        System.out.println("Size of ArrayList "+newArr.size());
        System.out.println("Is our ArrayList is Empty? "+newArr.isEmpty());
    }
}
