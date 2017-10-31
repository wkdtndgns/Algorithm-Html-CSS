package algo;

import algo.*;
import algo.hash.HashTable;
import algo.hashArray.MyArray;

 

public class hashArrayTest {
    
    public static void main(String[] args) {

    	 Person father, mother;
    	 father = new Person("아빠", 45);
         mother = new Person("엄마", 36);
         
         
         int maxValue = 200, maxCount = 10;
         MyArray myArray = new MyArray(maxCount);
         
         myArray.add(father) ;
         myArray.add(mother) ;
         
         if (myArray.contains(father))
             System.out.println(father.toString());
        
        
    }
}

