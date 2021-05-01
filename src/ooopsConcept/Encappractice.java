package ooopsConcept;

public class Encappractice { //data hidding.make the data name private and use setter and getter method.
    private String name;    //to automatic generate the code go the code bar and click generate and set/get.
    private int age;

    public void setName(String name) { //first we have  setname() now we are have  getname() to printout.
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
