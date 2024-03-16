import java.util.Scanner;

public class lab0_3 {
	public static void main(String[] args) {
		System.out.println("lab0_3:최지연");

		//사용자가 원하는 정수값 입력받기
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		//정렬되지 않은 정수 배열(array)과 정렬된 정수 배열(sortedArray) 초기화
		int array[] = {120, 990, 130, 150, 20, 300, 400, 990, 40, 100, 110, 150, 60, 80, 190, 200};
		int sortedArray[] = {20, 40, 60, 80, 100, 110, 120, 130, 150, 150, 190, 200, 300, 400, 990, 990};

		System.out.println(sequentialSearch(array, n));
		System.out.println(binarySearch(sortedArray, n));
	}

	//순차검색
	public static int sequentialSearch(int array[], int n) {
		for(int i = 0; i < array.length; i++) { //0번 배열부터 하나씩 지나며 원하는 정수값 찾기
			if (array[i] == n) {
				return i;
			}
		}

		return -1;  //검색 실패시 -1 return
	}

	//이진검색
	public static int binarySearch(int array[], int n) {
		int low = 0;
		int high = array.length-1;
		int mid; //초기 low, high, mid값 지정
		while(low <= high) {
			mid = (low+high)/2;

			if(n == array[mid]) { //원하는 정수 발견시 mid return
				return mid;
			} else if (n < array[mid]) { //array[mid] 값보다 n의 값이 작으면 mid 아래에 있는 값 중에서 이진탐색 반복
				high = mid-1;
			} else { //array[mid] 값보다 n의 값이 크면 mid 위에 있는 값 중에서 이진탐색 반복
				low = mid + 1;
			}
		}
		return -1; //검색 실패시 -1 return

	}

}
