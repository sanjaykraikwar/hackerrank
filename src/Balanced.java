import java.util.Scanner;
import java.util.Stack;

public class Balanced {
	
	public static void main(String ar[]) {
	
		Scanner scan = new Scanner(System.in);
		 String input = scan.next();
		int pemitted=scan.nextInt();
		
		Stack s=checkBalanced(input);
		String remain="";
		
		if(s.isEmpty())
		{
			System.out.println("balanced");
		}
		
		else {
		    System.out.println("notbalanced");
		    while(!s.isEmpty()) {
		     remain=remain+s.pop();
		    }
		    if(remain.length()<pemitted) {
		    	System.out.println("can't be balanced");
		    }
		    else if(remain.length()==pemitted)
		    {
		    	System.out.println("can be balanced");
		    }
		    
		    else {
		    	if(remain.length()%2==0) {
		    		if((remain.length()/2)==pemitted) {
		    			System.out.println("can be balanced");
		    		}
		    		else {
		    			System.out.println("can't be balanced");
		    		}
		    		
		    }
		    	else {
		    		
		    		if(((remain.length()/2)+1)==pemitted) {
		    			System.out.println("can be balanced");
		    		}
		    		else {
		    			System.out.println("can't be balanced");
		    		}
		    		
		    	}
		    	
		    }
		}
	}

	private static Stack  checkBalanced(String input) {
		
		Stack s=new Stack();
		
		for(int i=0;i<input.length();i++) {
			
			char c =input.charAt(i);
			
			if(c=='<')
				s.push('<');
			else if(c=='>') {
				if(s.peek().equals('<')){
					s.pop();
				}
				
		}
		}
		
	return s;
	}

}
