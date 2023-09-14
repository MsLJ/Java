
//part1:PP(procedural programming)
//    절차지향프로그래밍

public class PMain {
	public static void bubblesort(int[] ar) {
		int t;
		for (int turn = 0; turn < ar.length - 1; turn++) {
			// 정리를 여러번 반복해주면서 다시 정밀하게 정렬

			for (int i = 0; i < ar.length - 1 - turn; i++) {
				// 뒤에 -turn은 뒤에꺼를 정렬해주지 않아도돼서i
				// 처음으로 돌리면 기존 배열에서 정리해주고
				if (ar[i] > ar[i + 1]) {
					t = ar[i]; // t에 13
					ar[i] = ar[i + 1]; // ar[0]이 3
					ar[i + 1] = t; // ar[1]이 13

				}

			}
		}

	}

	public static void selectionSort(int[] ar) {
		int min = 0;
		int minindex;
		int t;
		for (int turn = 0; turn < ar.length-1; turn++) {
			min = ar[turn];
			minindex=turn;

			for (int i = (turn+1); i < ar.length; i++) {
				if (min > ar[i]) {
					min = ar[i];
					minindex = i;
					
				}
		}
			t=ar[turn];
			ar[turn]=ar[minindex];
			ar[minindex]=t;
		


		}

		// 그 최솟값이랑 0번이랑 자리바꾸기
		// 최소값이 어디있었는지
		System.out.println("------");
		System.out.println(min);
		System.out.println("------");

	}

	public static void main(String[] args) {

		int[] ar = { 23, 15, 45, 7, 3 };
		//selectionSort(ar);
		// bubblesort(ar);
		// int[] ar = { 13, 3, 23, 45, 7, 123, 1213 };
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}

		// 정렬하는 함수

		// 그 함수 호출

	}
}
