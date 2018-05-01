
public class Sequencee {

	public static void main(String[] args) {
		System.out.println(writeSequence(1));
		System.out.println(writeSequence(2));
		System.out.println(writeSequence(3));
		System.out.println(writeSequence(4));
		System.out.println(writeSequence(5));
		System.out.println(writeSequence(6));
		System.out.println(writeSequence(7));
		System.out.println(writeSequence(8));
		System.out.println(writeSequence(9));
		System.out.println(writeSequence(10));

	}
	
	public static int writeSequence(int n) {
		//base case
	    if(n < 1) {
	        throw new IllegalArgumentException("Less than 1");
	       
	    }//base case #2
	    if(n == 1) {
	        System.out.print("1 ");
	        
	    }
	    
	    else if(n == 2) {
	        System.out.print("1 1");
	       //handles even numbers  
	    }else if( n % 2 == 0 ){
	    	
	        System.out.print((n / 2) + " ");
	        writeSequence(n -2);
	        System.out.print(" " + (n / 2));
	        //handles odd numbers 
	        }else if( n % 2 == 1 ) {
	            System.out.print(((n + 1) / 2) + " ");
	            writeSequence((n - 2));
	            System.out.print(" " + ((n + 1) / 2));
	        } 
	     
	    	
	        else {
		    	System.out.println(writeSequence (n)); 
		    }
		return n-n;
	



	}
	
}
