
import java.util.Scanner;

public class ConcecutiveNum {

	public static void numberOfWaysOfConcecutiveNumForGivenNum(int num) {
		int  conscutiveSumCount = 0;
		for (int i = 1; i < num; i++) 
		{
			int temp = 0;
			String concecutiveNum = "";
			for (int j = i; j < num; j++)
			{
				temp = temp + j;
				concecutiveNum = concecutiveNum.equals("")? ""+j:concecutiveNum + "+" + j;
				
				if (temp == num)
				{	
					conscutiveSumCount ++;
					System.out.println(concecutiveNum.trim());
					break;
				}
				
			}
		}
		System.out.println("Number of ways we can achive the consecutive sum count : "+ conscutiveSumCount);
		if(conscutiveSumCount == 0)
			System.out.println("For the given number we can't achive the consecutive sum = num");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		numberOfWaysOfConcecutiveNumForGivenNum(num);

	}

}
