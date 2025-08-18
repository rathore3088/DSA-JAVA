import java.util.ArrayList;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        // This is the sybtax for the arraylist 
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
// Add method 
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list2.add("null");
         System.out.println(list);
        System.out.println(list2);

// get method 

       int element = list.get(0);
       System.out.println(element);

//  Delete method 

       list.remove(2);
       System.out.println(list);

//  set element at index 

       list.set(2, 3);
       System.out.println(list);

// here checking the element is there or not     

       System.out.println(list.contains(3));
       System.out.println(list.contains(22));

// here we can have the size of the arraylist    

       System.out.println(list.size());
      
    }
    
}
