package demoWork4;

public class ArrayPractice {
    public static void main(String[] args) {
 //arrays are used to store multiple values in a single variable.
        //declare an array
        String [] names ={"ali" , "ajgar" ,"sumon"} ;
        System.out.println(names[0]);
        //to find out how many elements an array use length( ) property.
       System.out.println(names.length);
        //we can use 'for loop' and length() property to specify how many times loop should run.
        String [] names ={"ali" , "ajgar" ,"sumon"} ;
        for(int i =0 ; i <names.length ; i++){
            System.out.println(i);


        }

    }
}
