package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new  Person().hello();
        //String s =new String("abcd");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));

        Person p = new Person("Tom",66.5f,1.7f);
        p.hello();
        /*p.weight = 66.5f;
        p.height = 1.7f;*/
        System.out.println(p.bmi());

        int score = 88;
        System.out.println(score <=60);
        System.out.println(score >80 && score<90);
        System.out.println(score <80 || score>90);

        char c = 'A';
        System.out.println(c>60);
        System.out.println(c>'a');
        /*int age = 19;
        Integer age2 = 20;
        char c ='c';
        Character c2 = 'a';
        byte b =120;
        float weight = 66.5f;
        double height =1.7;
        boolean adult = true;
        boolean enroll = false;
        String name ="Tom";*/
    }
}
