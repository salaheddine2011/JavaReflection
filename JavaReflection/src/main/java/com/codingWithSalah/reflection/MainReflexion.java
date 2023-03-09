package com.codingWithSalah.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflexion {
    public static void main(String[] args) throws Exception {
        Cat myCat=new Cat("rex",6);
        Field[] catFields =myCat.getClass().getDeclaredFields();
        for(Field field: catFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat,"rex fex");
            }
        }
        System.out.println(myCat.getName());

        Method[] catMethod=myCat.getClass().getDeclaredMethods();
        for (Method method: catMethod){
            if(method.getName().equals("heyThisIsPrivate") ){
                method.setAccessible(true);
                method.invoke(myCat);
            } else if (method.getName().equals("thisIsAPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);// because there is No Object just the class
            }
        }

        for (Method method: catMethod){
                System.out.println(method.getName()+" "+method.getModifiers());

        }



    }

}
