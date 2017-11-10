
public class FutureTest {
	
	public static void main(String ar[]) {
		
		int days=calculate(4,5,1);
		
		System.out.println(days);
	}
	
	static int calculate(int A,int K,int P){
		int days=0;
		
		for(int i=1;i<100;i++) {
			
			int asol=(A*i)+P;
			int ksol=(K*i);
			
			if(asol<ksol)
			{
				return i;
			}
			
			continue;
				
		}
		
		
		return days;
	}

}
