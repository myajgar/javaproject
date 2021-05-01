package ooopsConcept;

public class ArrayInJava { // collection of variables with same data types.
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 5;
        num[1] = 4;
        num[2] = 3;
        num[3] = 1;
        num[4] = 9;
       // num[5] = 10; u cant add one extra.
        System.out.println(num[0]);//print with array size otherwise its wont work.
        System.out.println(num.length);//use 'length' to find out size.

      //u can also loop through an array.
        for (int i = 0; i < num.length ; i++){
            System.out.println(num[i]);
        }
    }
}