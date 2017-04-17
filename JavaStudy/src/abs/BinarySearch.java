package abs;

public class BinarySearch {

	int binarySearch(int[] array, int target) {
		return binarySearch(array, target, 0, array.length-1);
	}
	
	int binarySearch(int[] array, int target, int lower, int upper) {
		
		int center, range;
		range = upper - lower;
		center = (range/2) + lower;
		if(target == array[center])
			return center;
		else if(target < array[center]) {
			return binarySearch(array, target, lower, center-1);
		} else {
			return binarySearch(array, target, center+1, upper);
		}
	}
	
	int iterBinarySearch(int[] array, int target) {
		int lower = 0, upper = array.length - 1;
		int center, range;
		while(true) {
			range = upper - lower;
			center = (range/2) + lower;
			if(target == array[center]) {
				return center;
			}
			else if(target < array[center]) {
				upper = center - 1;
			} else {
				lower = center + 1;
			}
		}
	}
}
