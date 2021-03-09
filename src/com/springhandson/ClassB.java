package com.springhandson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ClassB {

    private int a;
    private String b;
    private ClassA objA;


    @Autowired
    public ClassB(int a, String b, @Qualifier("wanted_bean") ClassA objA)
    {
        this.a=a;
        this.b=b;
        this.objA=objA;
    }


    public void seta(int a)
    {
        this.a=a;
    }

    public void setb( String b)
    {
        this.b=b;
    }


    @Autowired
    @Qualifier("wanted_bean")
    public void setObjA(ClassA objA)
    {
        this.objA=objA;
    }

    public int geta()
    {
        return a;
    }

    public String getb()
    {
        return b;
    }

    public ClassA getobjA()
    {
        return this.objA;
    }


}
