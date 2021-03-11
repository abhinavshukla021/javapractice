package com.collectionhandson;


import java.util.*;

class Person implements Comparable<Person>{

    private int id;
    private String name;

    public Person(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

}

public class App
{
    public static void main(String[] args)
    {
        List<Person> l = new ArrayList<Person>();
        Set<Person> s = new TreeSet<Person>();

        /*
        l.add(new Person(1,"Abhinav"));
        l.add(new Person(-100,"Shukla"));
        l.add(new Person(5,"Pranshu"));
        l.add(new Person(100,"Manya"));
        l.add(new Person(-12,"Anita"));

        Iterator<Person> itr = l.iterator();

        while(itr.hasNext())
        {
            Person p = itr.next();
            if(p.getName()=="Anita")
                itr.remove();
            System.out.println(p);
        }

        Collections.sort(l);


        for (Person p: l)
            System.out.println(p);

        */
        Person p = new Person(1,"Abhinav");
        s.add(p);
        s.add(new Person(2,"Manya"));
        s.add(new Person(3,"Anita"));
        s.add(p);

        for(Person p1: s)
            System.out.println((p1));


    }
}
