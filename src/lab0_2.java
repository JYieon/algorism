import java.util.Scanner;

//재귀 알고리즘을 사용하여 1부터 n까지의 합을 구하는 메소드, 1부터 n까지의 정수를 출력하는 메소드 작성

public class lab0_2 {

	//1부터 n까지의 합을 구하여 리턴하는 메소드
	public static int sum(int n) {
		if(n>0) { //양의 정수 n만 재귀될 수 있도록 if조건 설정
			return n + sum(n-1);
		}
		return n;
	}

	//1부터 n까지의 정수를 출력하는 메소드
	public static int number(int n) {
		if(n>0) {
			System.out.print(n + " ");
			return number(n-1);
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println("lab0_2:최지연");

		//사용자가 원하는 정수값(n)을 입력받음
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(sum(n));
		number(n);
	}

}
