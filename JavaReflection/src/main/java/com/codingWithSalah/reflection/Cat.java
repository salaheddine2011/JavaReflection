package com.codingWithSalah.reflection;


public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(){

    }

    public String getName() {
        return name;
    }

   public void withParameters(int x,int y){
       System.out.println(x+y);
   }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow(){
        System.out.println("Meow");
    }

    private void heyThisIsPrivate(){
        System.out.println("How did you call this");
    }

    public static void thisIsAPublicStaticMethod(){
        System.out.println("I m a public and static");
    }
    private static void thisIsAPrivateStaticMethod(){
        System.out.println("I m a private and static");
    }
}
