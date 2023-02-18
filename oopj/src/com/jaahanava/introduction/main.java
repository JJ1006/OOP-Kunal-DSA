package com.jaahanava.introduction;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        // storing roll numbers
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

//        Student kunal;

        Student kunal = new Student(16,"JJ",88.6f);
//        Student rahul = new Student();

//        kunal.rno = 13;
//        kunal.name = "Jaahanava Joshi";
//        kunal.marks = 88.5f;


//        kunal.changeName("Kunal Kushwaha");
//        kunal.greeting();

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);
    }
}
    //create a class for every single student

// constructors
    class  Student {
        int rno;
        String name;
        float marks = 90;

//        we need a way to add the value of the above poperties object by object

//        we need one word to access every object

        void greeting(){
            System.out.println("Hello! My name is " + this.name);
        }

        void changeName(String newName){
            this.name = newName;
        }

        Student (Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student() {
        // this is how you call a constructor from another constructor
            // internally: new Student(13,"default person",100.0f)
            this(13,"default person",100.0f);
        }


//        Student arpit = new Student(19,"Arpit",88.9f);
//        here, this will be replaced by arpit
        Student( int rno, String name, float marks) {
         this.rno = rno;
         this.name = name;
         this.marks = marks;
        }
    }
