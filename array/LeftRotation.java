package array;


import java.util.*;
 
 
public class LeftRotation {

    public static void main(String[] args) {
      List<Integer> list = Arrays.asList(1,2,3,4,5);
      // 3,4,5,1,2
       rotateLeft(2,list);
    }
    
    
     static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> newList = new ArrayList<>();
        newList.addAll(arr);
        

        for (int i=1; i<=d; i++) {
            System.out.println(i);
            
             newList.add(newList.get(0));
             newList.remove(newList.get(0));
           
        }

        System.out.println(newList);
        return newList;
         
    
        }
}
