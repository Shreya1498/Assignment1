package Assignment;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  int n=121, r,sum=0,temp;    
			  //It is the number variable to be checked for palindrome  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			  
			  
	}

}
