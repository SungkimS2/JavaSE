package day03.operator;
/*
 *  6. 비트연산자 - 2진수로 표현된 두 비트 연산자
 * 	  & : And 연산자
 *	  | : Or 연산자
 *	  ^ : XOR 연산자
 *	  ~ : Not 연산자
 *
 *  7. 쉬프트연산자
 *   << : 왼쪽으로 비트 이동
 *   >> : 오른쪽으로 비트 이동
 * 
 */

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println(3&4);
		System.out.println(3|4);
		System.out.println(3^4);
		System.out.println(~3); // 음수 2의보수 값 출력
		
		System.out.println(1<<2);
		System.out.println(2>>1);
	}
}
