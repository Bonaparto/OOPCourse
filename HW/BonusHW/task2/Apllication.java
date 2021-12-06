package BonusHW.task2;

import java.util.PriorityQueue;

public class Apllication {
    public static void main(String args[]) {
        PriorityQueue<Person> pq = new PriorityQueue<>(5, new AgeComparator());
        Person p1 = new Person("Raiym", 18);
        Person p2 = new Person("Erka", 17);
        Person p3 = new Person("Mansure", 20);
        Person p4 = new Person("Jax", 21);
        Person p5 = new Person("Adil", 19);

        pq.add(p1);
        pq.add(p2);
        pq.add(p3);
        pq.add(p4);
        pq.add(p5);

        while(!pq.isEmpty()) {
            Person p = pq.poll();
            System.out.println(p.name + " " + p.age);
        }
    }
}
