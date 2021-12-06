package BonusHW.task2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if(p1.age < p2.age) return 1;
        else if(p1.age > p2.age) return -1;
        return 0;
    }
}
