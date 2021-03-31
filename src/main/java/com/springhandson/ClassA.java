package com.springhandson;
import java.util.List;

public class ClassA {

    private int a;
    private String b;
    private List <Integer> c;

    public ClassA(int a, String b, List<Integer> c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    /*
    public void seta(int a)
    {
        this.a=a;
    }

    public void setb( String b)
    {
        this.b=b;
    }
    */


    public int geta()
    {
        return a;
    }

    public String getb()
    {
        return b;
    }

    public int getc()
    {
        return this.c.size();
    }

}
