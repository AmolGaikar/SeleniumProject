package LearningJava;

public class SwitchcaseDemo {

	public static void main(String[] args) {
    int number=4;
    
    if (number==1) {
    	System.out.println("Monday");
    } else if (number==2) {
    	System.out.println("Tuesday");
    } else if (number==3) {
    	System.out.println("wednesday");
    } else if (number==4) {
    	System.out.println("Thursday");
    } else if (number==5) {
    	System.out.println("Friday");
    } else if (number==6) {
    	System.out.println("Saturday");
    } else if (number==7) {
    	System.out.println("Sunday");
    } else {
    	System.out.println("not a weekday");
    }
	
	
      switch (number) {
      case 1: System.out.println("Monday");
              break;                    // To break the flow of code
      case 2: System.out.println("Tuesday");
              break;
      case 3: System.out.println("wednesday");
              break;
      case 4: System.out.println("Thursday");
              break;
      case 5: System.out.println("Friday");
              break;
      case 6: System.out.println("Saturday");
              break;
      case 7: System.out.println("Sunday");
              break;
       default: System.out.println("Not matched with any case");
       
      }
	}
}