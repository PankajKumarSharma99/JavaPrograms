import java.util.*;

class ArrayListEx{
    public static void main(String [] args){

        List<String> arr = new ArrayList<>();

        arr.add("Pankaj Kumar");
        arr.add("Dheeraj Kumar");
        arr.add("Sonu Kumar");
        
        System.out.println(arr);
        
        arr.forEach((name) -> { System.out.println(name); });
    }
    
}