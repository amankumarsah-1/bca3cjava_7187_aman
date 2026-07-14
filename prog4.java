//WRITE A JAVA PROGRAM TO PERFORM DIFFERENT ARITHMETIC OPERATION.(USING COMMAND LINE ARGUEMENT)

 class prog4{
		public static void main(String[] args){
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("your first number:"+ a);
		System.out.println("your second number:"+ b);
		
		System.out.println("your addition value is:" + (a+b));
		System.out.println("your Substraction value is:" +(a-b));
		System.out.println("your multiplication value is:" + (a*b));
		System.out.println("your divide value is: " + (a/b));
		System.out.println("your modulus value is: value" + (a%b));
		
		}
 
 
 }