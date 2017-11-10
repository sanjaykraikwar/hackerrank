
public class LCM {

	public static void lcmSum(int array[]) {

		
		for (int j = 0; j < array.length; j++) {
			int lcmSum = 0;
			for (int i = 1; i <= array[j]; i++) {

				if (array[j] % i == 0)
					lcmSum = lcmSum + i;

			}
			System.out.println("lcmSum : "+ lcmSum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,6,10,4};
		lcmSum(array);
	}

}


