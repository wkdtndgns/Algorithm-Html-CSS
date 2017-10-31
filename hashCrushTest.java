package algo;

import java.util.Arrays;

import algo.hashCrush.HashTable;
import algo.PersonComparator;
import algo.PersonComparator.Compare;

import java.util.Comparator;

public class hashCrushTest {
    
    public static void main(String[] args) throws Exception {

    	
    	Comparator<Person> personComparator = new PersonComparator(Compare.BY_AGE_DESC);
    	
    	
    	
    	 Person father, mother,mam;
    	 father = new Person("아빠", 45);
         mother = new Person("엄마", 36);
         mam = new Person("엄마",36);
         
         Person[] children;
         children = new Person[3];
         children[0] = new Person("장", 2);
         children[1] = new Person("김", 9);
         children[2] = new Person("딸1", 7); 
   
         HashTable hashTable = new HashTable();
         
			hashTable.add(father) ;                        
			hashTable.add(mother) ;
			hashTable.add(mam);
		
			
			
         for(int i =0; i<children.length;i++)		
				hashTable.add(children[i]);
		
         
         
         
         if (hashTable.contains(father))
             System.out.println(father.toString());
        
         for (int i = 0;  i < children.length; ++i)
             if (hashTable.contains(children[i]))
             		System.out.println(children[i].toString());
         
         hashTable.remove(children[0]);
         
         for (int i = 0;  i < children.length; ++i)
             if (hashTable.contains(children[i]))
             		System.out.println(children[i].toString());
         
         hashTable.add(children[0]);
         
         System.out.println(mother.equals(father));
         System.out.println(mother.equals(mam));
         System.out.println(mother.equals(mother));
         
         Person p[]= {mother , father , mam, children[0],children[1],children[2]};
         
         Arrays.sort(p,personComparator);
         System.out.println();
         
         
        
     
        
         for(int i=0; i<p.length; i++){
        	 if (hashTable.contains(p[i]))
        		 System.out.println(p[i].toString());        	 
         }
         
         
    }
}

