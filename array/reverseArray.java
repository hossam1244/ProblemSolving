package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseArray {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World"};
        System.out.println("arrayLength: " + arr.length);
        List<Integer> list = Arrays.asList(1,2,3,4);
         reverseArray(list);
        }
    



  static List<Integer> reverseArray(List<Integer> a) {
        System.out.println(a.size());
        int listSize = a.size() - 1;
        List<Integer> newList = new ArrayList<Integer>();
      
        for (int i = listSize; i >= 0; i--) {
                    // 3   3
                    // 3   2
                    // 3    1
                    // 3     0
                    newList.add(listSize - i, a.get(i));
            
        }
        System.out.println(newList);
       
        // second solution with built-in function
        /**
         * we convert the array into a list first by using java.util.Arrays.asList(array) and then reverse the list. 
         */
        // Collections.reverse(Arrays.asList(a));

       return newList;
    }
}


