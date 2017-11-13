
import java.util.Scanner;

public class ConcecutiveNum {

	public static void numberOfWaysOfConcecutiveNumForGivenNum(int numer) {
		int  count = 0;
		for (int i = 1; i <= ((numer/2)+1); i++) 
		{
			int sum = 0;
			String concecutiveNum = "";
			for (int j = i; j <= ((numer/2)+1); j++)
			{
				sum = sum + j;
				
				concecutiveNum = concecutiveNum.equals("")? ""+j:concecutiveNum + "+" + j;
				
				if (sum == numer)
				{	
					count ++;
					System.out.println(concecutiveNum.trim());
					break;
				}
				
			}
		}
		System.out.println("Number of ways ="+ count);
		if(count == 0)
			System.out.println("For the given number we can't achive the consecutive sum = num");
		
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		numberOfWaysOfConcecutiveNumForGivenNum(num);

	}

}
