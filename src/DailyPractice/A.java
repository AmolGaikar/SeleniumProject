package DailyPractice;

	
	public class A {
		
		public int add(int a,int b) {
			System.out.println(a+b);
			return a+b;
		}
		public void sub(int c,int d) {
			System.out.println(c-d);
		}
		

	public static void main(String[] args) {
      A obj=new A();
      obj.sub(obj.add(40,50),50);
	}

}
