package ooopsConcept;

public class SingletonClass { // singleton class use for create only one object.
                              // private constructor.
   //1 private static object of the class (half way)

        private static SingletonClass obj =null ;
   private SingletonClass(){


   }
    //3.public static  method which has return type of the class(object)---singleton method.

        public static   SingletonClass getInstance(){ //factory method
       if (obj== null){   //other half

           obj = new SingletonClass() ;

       }
        return obj ;

   }
    public void demo(){
        System.out.println("hello");
    }
}
