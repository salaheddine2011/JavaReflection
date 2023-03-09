package com.MainForBeans;

import com.Beans.FirstBean;
import com.Beans.SecondBean;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

public class Main {
//    @Autowired
//    static FirstBean first;
//
//    @Autowired
//    static SecondBean secondBean;

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Reflections reflections=new Reflections("com.Beans.",new SubTypesScanner(false));
        Set<Class<? extends Object>> allClasses= reflections.getSubTypesOf(Object.class);
        //Class[] arrayCls=new Class[allClasses.size()];
       // allClasses.toArray(arrayCls);
        System.out.println("************ Display Classes with Package **********");
        System.out.println(allClasses);
        ArrayList classes=new ArrayList<>();

        // Instantiate two Object

        FirstBean first=new FirstBean();
        SecondBean secondBean=new SecondBean();
        System.out.println("************ Display Classes without Package **********");

        for(var element: allClasses){
            String className=element.getSimpleName();
            //Class className=Class.forName(String.valueOf(element).substring(6));
            System.out.println(className);
            //System.out.println("the type is "+Class.forName(String.valueOf(element).substring(6)));
            classes.add(className);

        }

        // testing that the array contains informations
        // System.out.println(classes);

        System.out.println("**** let s display all of the Methods and attribute for each class ****");
        Method[] methods=first.getClass().getDeclaredMethods();
        Method[] methods1=secondBean.getClass().getMethods();
        System.out.println("********** for the FirstBean Class *****");
         for (Method method:methods) {
//             if(!method.getName().substring(0,3).equals("get") || !method.getName().substring(0,3).equals("set") ){
//                 System.out.println(method.getName());
//             }
            /* if(!method.getName().substring(0,4).equals("get") || !method.getName().substring(0,4).equals("set") ){
                 method.invoke(first);
             }*/
             if(method.getName().equals("methodFirstBean")){
                 System.out.println("Invoking the method : "+method.getName());
                 method.invoke(first);
             }
         }
    }

//        for(var element : classes){
//            System.out.println("for the class name +"+element+"we have: ");
//            Method[] methods=element.getClass().getDeclaredMethods();
//            for(Method method : methods){
//                System.out.println(method.getName());
//            }

    }

