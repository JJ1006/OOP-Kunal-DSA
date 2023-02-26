package com.jaahanava.staticExample;
class Test{
    static  String name;

    public Test(String name) {
        Test.name = name;
    }
public class InnerClasses {

    }

    public static void main(String[] args) {
        Test a = new Test ("Kunal");
        Test b = new Test("JJ");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
