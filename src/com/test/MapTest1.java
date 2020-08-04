package com.test;



import java.util.*;

public class MapTest1 {

    public static void main(String[] args) {

        //需要用到key 和 value 时效率高 （常用）
        Map<String,String> map = new HashMap<>();

        map.put("1","张三");
        map.put("2","李四");

        for(Map.Entry<String, String> entry : map.entrySet()){
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey+":"+mapValue);
        }


        //在只需要使用key 或者 value的时候时候效率高
        Map <String,String> map2 = new HashMap<String,String>();
        map2.put("熊大", "棕色");
        map2.put("熊二", "黄色");
//key
        for(String key : map2.keySet()){
            System.out.println(key);
        }
//value
        for(String value : map2.values()){
            System.out.println(value);
        }


        System.out.println("-------------------");

        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, String> entry = entries.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("问");

        for( String i:list){
            System.out.println(i);
        }


    }
}
