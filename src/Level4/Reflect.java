package Level4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
    public static void test(Object o)throws NoSuchMethodException,SecurityException,IllegalAccessException,IllegalArgumentException, InvocationTargetException{
        Class clazz=o.getClass();
        Field[] fields= clazz.getDeclaredFields();
        for(int i=0;i< fields.length;i++){
            String attrName=fields[i].getName();
            System.out.println("attrName=="+attrName);
            String methodName="set"+attrName.substring(0,1).toUpperCase()+attrName.substring(1);
            Method method= clazz.getMethod(methodName,new Class[]{String.class});
            method.invoke(o,new Object[]{i+""});
        }

    }
    public static void main(String[] args)throws NoSuchMethodException,SecurityException,IllegalAccessException,IllegalArgumentException,InvocationTargetException{
        Reflect rf=new Reflect();
        Person p=new Person();
        test(p);
        System.out.println(p.getName());
        System.out.println(p.getScore());
        System.out.println(p.getHobby());
    }
}
