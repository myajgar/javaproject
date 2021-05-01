package ooopsConcept;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapPractice {
    public static void main(String[] args) {
        //USA---> ct , ny , nj
        //canada--->co , mo ,np

        ArrayList<String>liststateofUsa =new ArrayList<>();
        liststateofUsa.add("ct");
        liststateofUsa.add("ny") ;
        liststateofUsa.add("nj");
        ArrayList<String>liststateofcanada= new ArrayList<>();
        liststateofcanada.add("co");
        liststateofcanada.add("mo");
        HashMap<String ,ArrayList<String> >countrylist = new HashMap<>();
        countrylist.put("USA" ,liststateofUsa);
        countrylist.put("CANADA" , liststateofcanada);
        System.out.println(countrylist);
        System.out.println(countrylist.get("USA"));
    }
}
