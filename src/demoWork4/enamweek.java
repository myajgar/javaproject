package demoWork4;

public class enamweek {    //enum can not be used to crete object .
    EnamDays days;  // Days days =Days.monday
    enamweek(EnamDays days){   //enum constants are public ,static , final.(unchangeable-can not be overriden).
     this.days =days;  //it cannot extends no class but implement interfaces.
    }                  //use enum when u have value are constant like month ,days ,colour ,etc.
    public void game(){
        switch (days){ //switching to the enum(days)
         case Monday:
          System.out.println("pay");
             break;
         case Tuesday:
          System.out.println("work");
          break;
         case Friday:
          System.out.println("gaming");
          break;
         default:
          System.out.println("fun");
        }
    }
}
