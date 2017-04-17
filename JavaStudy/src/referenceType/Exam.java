package referenceType;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exercise07();
		System.out.println("");
		exercies08();
		System.out.println("");
		exercies09();
	}

	public static void exercise07() {

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int n : array) {
			if (n > max) {
				max = n;
			}
		}

		System.out.println("Array Max : " + max);
	}

	public static void exercies08() {

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}

		avg = (double) sum / count;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

	public static void exercies09() {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();

			switch (selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int [studentNum];
				break;
			case 2:
				for(int i=0 ; i<studentNum ; i++) {
					System.out.print("scores[" + i + "]" + "> ");
					scores[i] = sc.nextInt();
				}
				break;
			case 3:
				for(int i=0 ; i<studentNum ; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
			case 4:
				int sum = 0;
				double avg;
				int max = 0;
				
				for(int n : scores) {
					//if(n > max) max = n;
					max = (n > max)? n : max;
					sum += n;
				}
				avg = (double) sum / studentNum;
				
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + avg);
				
				break;
			case 5:
				run = false;
			}
		}
	}
}
