package LearningJava;

public class ifelseif {

	public static void main(String[] args) {
     int a=50;
     int b=300;
     int c=500;
     
     if (a>b && a>c) { // if first condition is false automatically we r going to 2nd condition,if second condition also false then else part will be printed
    	 System.out.println("a is grater");
     }else if (b>a && b>c) {
    	 System.out.println("b is grater");
    	 
     } else {
    	 System.out.println("c is grater");
    	 
     }
	}

}
