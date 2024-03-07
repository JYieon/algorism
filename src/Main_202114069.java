import java.util.Scanner;

//사용자가 원하는 갯수의 정수값을 입력받아 배열에 저장한 후 풀력하는 프로그램입니다.

public class Main_202114069 {

	public static void main(String[] args) {
		System.out.println("lab0_1:최지연");

		//사용자가 원하는 정수 갯수(n)를 입력받음
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		//n개의 정수값을 입력받아 배열에 저장
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		//n개의 정수값의 평균(average) 구하기
		float average = 0;
		for(int i = 0; i < n; i++) {
			average += array[i];
		}
		average = average / n;
		System.out.println(average);

		//평균값보다 큰 정수 개수(count) 구하기
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(array[i]>average) {
				count++;
			}
		}
		System.out.print(count);
	}
}
