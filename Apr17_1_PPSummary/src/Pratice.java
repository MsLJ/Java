
public class Pratice {
	public static void main(String[] args) {
//
//bubblesort ->e{12,45,1,4,12}숫자들 크기 비교 for문
//자리 바꾸기전에 그 기존에 자리에 있던 숫자를 저장해줄 함수를
//if e[0]>e[1]  
//e[0]=e[1]  --> if e[i]>e[i+1]
// i의 범위는< length-1  i++
//마지막 숫자는 정렬이 다 되었기에 다시 할필요x
//정렬이 다 끝난뒤 정렬이 끝난 횟수만큼을 최대 범위내에서 한번더 빼주고
//그러면 그 정렬이 끝난 횟수만큼을 세는 함수가 필요
//int turn=0;
//for turn
//턴의 범위는 정렬이 다 끝나야하는거니까 e의length의-1만큼
		int ar[] = { 23, 15, 45, 7, 3 }; 
		int a;
		int x = 0;
		int count=0;
		for (x = 0; x < ar.length - 1; x++) {

			for (int i = 0; i < ar.length - 1-x; i++) {
				if (ar[i] > ar[i + 1]) {
					count++;
					a=ar[i];
					ar[i] = ar[i + 1];
					ar[i+1]=a;
					
					

				}else return;
			}System.out.println(ar);

		}

	}

}
