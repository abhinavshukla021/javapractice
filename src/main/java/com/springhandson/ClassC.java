package com.springhandson;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassC {

    private int a;
    private String b;
    private ClassB objB;


    public ClassC(int a, String b, ClassB objB)
    {
        this.a=a;
        this.b=b;
        this.objB = objB;
    }

    public void seta(int a)
    {
        this.a=a;
    }

    public void setb( String b)
    {
        this.b=b;
    }

    public void setobjB(ClassB objB)
    {
        this.objB = objB;
    }


    public int geta()
    {
        return a;
    }

    public String getb()
    {
        return b;
    }

    public ClassB getobjB()
    {
        return this.objB;
    }

}
