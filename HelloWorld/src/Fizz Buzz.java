
  public class HelloWorld {

	static int counter = 1;
	public static void main(String[] args) {
		
	while(counter<101) {
		if(counter%3==0 && counter%5==0 ) {
		 System.out.println("FizzBuzz");
		 System.out.println(counter);}
		else {
         if(counter%3==0) 
          {System.out.println("Fizz");
          System.out.println(counter);}
         else {
    	  if(counter%5==0) {System.out.println("Buzz");
    	  System.out.println(counter);}
          else 
           {System.out.println("Nix");
           System.out.println(counter);}
}	
}
counter++;
}
}
}