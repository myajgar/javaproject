package ooopsConcept;

public class PolymorphismClass {  // having many form/behavior .
  static   void add(int a, int b){
        System.out.println(a+b);

    }
   static void  add(int a ,int b , int c){//method overloading/static polymorphism/compile time polymorphism.
        System.out.println(a+b+c);        //same method like add() , different params .
       //method overloading also calls as constructor overloading.

    }

    public static void main(String[] args) {
      add(5 ,6);
      add(2,3,4);



    }
}
