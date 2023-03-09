package com.codingWithSalah.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main2 {
    public static void main(String[] args) throws NoSuchMethodException {

        Method method=Prog.class.getMethod("methode", int.class);
        Method method2=Prog.class.getMethod("methode", int.class, int.class);

        Parameter[] parameters=method.getParameters();
        Parameter[] parameters2=method2.getParameters();



        for(Parameter parameter: parameters){
            System.out.println("Parameter: "+parameter.getName()+" Type "+parameter.getType());
        }

        for(Parameter parameter: parameters2){
            System.out.println("Parameter: "+parameter.getName()+" Type "+parameter.getType());
        }

    }
}
