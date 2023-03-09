package com.source;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        String catClassName="com.codingWithSalah.reflection.Cat";
        Class<?> catClass=Class.forName(catClassName);
        Object cat=catClass.newInstance();
        String methodName="getName";
        Method getNameMethod=cat.getClass().getMethod(methodName);
        String name= (String) getNameMethod.invoke(cat);

        // with multiple parameters

        methodName ="withParameters";
        Class<?> [] paramTypes={int.class, int.class};
        Method printCatMethod=cat.getClass().getMethod(methodName,paramTypes);
        printCatMethod.invoke(cat,5,9);
    }
}
