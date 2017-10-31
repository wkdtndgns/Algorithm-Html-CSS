package algo;

import algo.*;
import algo.hash.HashTable;
import algo.hashArray.MyArray;

 

public class hashTest {
    
    public static void main(String[] args) {

    	 Person father, mother;
    	 father = new Person("아빠", 45);
         mother = new Person("엄마", 36);
         
         
         int maxValue = 200, maxCount = 10;
         HashTable hashTable = new HashTable(maxValue);
         System.out.println(father.hashCode()%5);
         hashTable.add(father) ;
         hashTable.add(mother) ;
         
         if (hashTable.contains(father))
             System.out.println(father.toString());
         if (hashTable.contains(mother))
             System.out.println(mother.toString());
        
         Object[] a = new Object[1000];
         
         System.out.println(a.length);
         
         
        
    }
}

