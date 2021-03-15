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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class App
{
    public static void main(String[] args)
    {

        List<Person> l = new ArrayList<Person>();
        Set<Person> s = new TreeSet<Person>();


        l.add(new Person(1,"Abhinav"));
        l.add(new Person(-100,"Shukla"));
        l.add(new Person(5,"Pranshu"));
        l.add(new Person(100,"Manya"));
        l.add(new Person(-12,"Anita"));

        l.stream().filter(person -> (person.getId()>0)).sorted(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }).forEach(System.out::println);

        /*
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

        System.out.println();

        Person p = new Person(1,"Abhinav");
        s.add(p);
        s.add(new Person(2,"Manya"));
        s.add(new Person(3,"Anita"));
        s.add(p);

        for(Person p1: s)
            System.out.println((p1));

        System.out.println();

        System.out.println(new Person(1, "shukla").equals(new Person(1,"shukla")));
        System.out.println(new Person(1, "shukla") == new Person(1, "shukla"));


    }
}
