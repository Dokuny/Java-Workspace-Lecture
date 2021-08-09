package chapter5;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		double lengthSum = 0;
		
		for(int a = 0; a < array.length; a++ ) {
			lengthSum += array[a].length;
			for(int b = 0; b < array[a].length; b++) {
				sum += array[a][b];
				//lengthSum++ 해도된다. +=lengthSum 대신
			}
			
		}
		
	
		avg = sum / lengthSum;
		
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);

	}

}
