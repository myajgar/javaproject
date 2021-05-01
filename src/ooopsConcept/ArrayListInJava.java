package ooopsConcept;

import java.util.ArrayList;     //usa- ct ,nj ,ny           canada-cl ,op,mp
import java.util.HashMap;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<String> stateofusa = new ArrayList<>();
        stateofusa.add("ct") ;
        stateofusa.add("nj") ;
        stateofusa.add("ny");
        ArrayList<String> stateofcanada = new ArrayList<>() ;
        stateofcanada.add("cl") ;
        stateofcanada.add("op") ;
        stateofcanada.add("mp") ;
        HashMap<String , ArrayList<String>>countrymap = new HashMap();
        countrymap.put("USA" , stateofusa);
        countrymap.put("CANADA" , stateofcanada);
        System.out.println(countrymap);
        System.out.println(countrymap.get("USA"));
        System.out.println("***********************");
        HashMap<String , Integer>cityandziofUSA =new HashMap<>();
        cityandziofUSA.put("stamford" , 234) ;
        cityandziofUSA.put("milford" , 9032) ;
        HashMap<String , Integer>cityzipofCANADA=new HashMap<>();
        cityzipofCANADA.put("cl" , 3245) ;
        cityzipofCANADA.put("op" ,9876) ;
        ArrayList< HashMap<String , Integer>>cityofzipcodes =new ArrayList<>() ;
        cityofzipcodes.add(cityandziofUSA) ;
        cityofzipcodes.add(cityzipofCANADA);
        System.out.println(cityofzipcodes);


        }
    }

