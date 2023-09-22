package com.gentech.interfaces;

interface Fruitsnames
{
    void showfruname(String s);
}

interface Fruitsrate extends Fruitsnames
{
    void showfrurate(int n);
}

interface Fruitsexport extends Fruitsnames
{
    void showempno(String n);
}

class showfruits implements Fruitsrate, Fruitsexport
{
    public void showfruname(String s) 
    {
        System.out.println("Fruit,. Name : "+s);
    }
    
    public void showfrurate(int n)
    {
        System.out.println("Fruits Rate per grams : "+n);
    }
    
    public void showempno(String n)
    {
        System.out.println("Export type : "+n);
    }
}

public class HierachicalExtends
{
    public static void main(String[] args)
    {
        showfruits o = new showfruits();
        o.showfruname("Apple");
        o.showfrurate(130);
        o.showempno("Lorry");
    }
}
