package ooopsConcept;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        num.add(22);
        num.add(33);
        num.add(44);
        list.add("valvo");
        list.add("toyota");
        list.add("kia");
        list.add("BMW");
        list.add("honda");
        System.out.println(list);
        System.out.println(list.size());

        for(int i =0 ; i <list.size() ; i++){
        String s1  =  list.get(i);
            System.out.println(s1);
        }

        list.remove(1);
        System.out.println(list);

    }
}