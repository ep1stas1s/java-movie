package view;

import java.util.Scanner;

public class InputView {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static int inputMovieId() {
		try {
			System.out.println("## 예약할 영화를 선택하세요.");
			return Integer.parseInt(SCANNER.nextLine());
		} catch (IllegalArgumentException e) {
			return inputMovieId();
		}
	}
	
	public static int inputStartDateTime() {
		try {
			System.out.println("## 예약할 시간표를  선택하세요.");
			return Integer.parseInt(SCANNER.nextLine());
		} catch (IllegalArgumentException e) {
			return inputStartDateTime();
		}
	}
	
	public static int inputMovieCount() {
		try {
			System.out.println("## 예약할 인원을 입력하세요.");
			return Integer.parseInt(SCANNER.nextLine());
		} catch (IllegalArgumentException e) {
			return inputMovieCount();
		}
	}
	
	public static int inputPoint() {
		try {
			System.out.println("## 포인트 사용 금액을 입력하세요. 포인트가 없으면 0 입력");
			return Integer.parseInt(SCANNER.nextLine());
		} catch (IllegalArgumentException e) {
			return inputPoint();
		}
	}
	
	public static int inputPaymentMethod() {
		try {
			System.out.println("## 신용카드는 1번, 현금은 2번");
			return Integer.parseInt(SCANNER.nextLine());
		} catch (IllegalArgumentException e) {
			return inputPaymentMethod();
		}
	}

}
