package demoWork4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Demo44 {
    public static void main(String[] args) {

        ArrayList<String> citiesList = new ArrayList<>();
        HashSet<String> cities = new HashSet<>(); //unique data only no duplicate data allowed for hasset.
        cities.add("stamford");
        cities.add("norwalk");     //<object> -->when like this its can hold..int ,string,boolean.
        cities.add("milford");

        System.out.println(cities);
        Iterator it = cities.iterator();//hasNext will return true if iteration has more value.next() will return
        while (it.hasNext()) {
            String city = it.next().toString();
            // System.out.println(city);
            //in ArrayList we will put Hashset.
            citiesList.add(city);
        }
        System.out.println(citiesList);
// String city =it.next();//its gonna give you red coz next( )method does not return String it return object.
// String city = it.next().toString();//next() method will return the next element in iteration.
//arraylist and hashset result is same but we need HS to use some method from arrlist like get() method.come from AL


        // System.out.println  ( it.hasNext());

    }
}






