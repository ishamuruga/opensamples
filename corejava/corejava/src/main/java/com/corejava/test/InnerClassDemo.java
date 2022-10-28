package com.corejava.test;

class InnerOuterClass {
    // static member
    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private int outer_private = 30;

    int age = 56;

    class InnerClass {
        void display() {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can also access non-static member of outer class
            System.out.println("outer_y = " + outer_y);

            // can also access a private member of the outer class
            System.out.println("outer_private = " + outer_private);

            System.out.println(age);

        }
    }
}

public class InnerClassDemo
{
    public static void main(String[] args)
    {
        // accessing an inner class
        InnerOuterClass outerObject = new InnerOuterClass();
        InnerOuterClass.InnerClass innerObject = outerObject.new InnerClass();
         
        innerObject.display();
         
    }
}
