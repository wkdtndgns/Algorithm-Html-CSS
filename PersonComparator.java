package algo;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    
    public enum Compare { BY_NAME_ASC, BY_NAME_DESC, BY_AGE_ASC, BY_AGE_DESC };
    private Compare compare;
    
    public PersonComparator(Compare compare) {
        this.compare = compare;
    }

    @Override
    public int compare(Person p1, Person p2) {
        if (p1 == p2) return 0;
        if (p1 == null) return -1;
        if (p2 == null) return 1;
        
        switch (compare) {
        case BY_NAME_ASC: return p1.getName().compareTo(p2.getName());
        case BY_NAME_DESC: return p2.getName().compareTo(p1.getName());
        case BY_AGE_ASC: return p1.getAge() - p2.getAge();
        case BY_AGE_DESC: return p2.getAge() - p1.getAge();
        }
        return 0;
    }

}


