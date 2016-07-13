package com.aayongche.thinkInJava4.jdk8.stream;



/**
 * Created by lyj on 16-6-22.
 */
public class Test2 {
    public static void main(String[] args) {
        //聚合操作
       /* List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        Stream<Integer> value = values.stream();
        Integer sum = value.reduce(0, (x, y) -> x + y);
        System.out.println(sum);*/

       /* List<String> values = new ArrayList<String>();
        values.add("a");
        values.add("ab");
        values.add("abc");
        values.add("abcd");
        values.add("abcde");
        Stream<String> value=values.stream();
        int sum=value.reduce(0,(total,word)->total+word.length(),(total1,total2)->total1+total2);
        System.out.println(sum);*/

        //收集数据
        /*List<String> values = new ArrayList<String>();
        values.add("a");
        values.add("ab");
        values.add("abc");
        values.add("abcd");
        values.add("abcde");
        Stream<String> value=values.stream();
        String[] result=value.toArray(String[]::new);
        System.out.println(Arrays.toString(result));*/

        //收集到list set
//        List<String> values = new ArrayList<String>();
//        values.add("a");
//        values.add("ab");
//        values.add("abc");
//        values.add("abcd");
//        values.add("abcde");
//        Stream<String> value=values.stream();
//        value.forEach(System.out::println);
//        List<String> result=value.collect(Collectors.toList());
//        Set<String> set=value.collect(Collectors.toSet());
//        String str=value.collect(Collectors.joining());
//        String str1=value.collect(Collectors.joining(","));

        
    }
}