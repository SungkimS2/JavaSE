package day03.loop;
/*
 *  2. do ~ while()문
 *   while문과 비슷하지만, 최소 한번은 실행된다.
 * 
 *  do{
 *  	반복 수행할 코드
 *  } while(조건문);
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
		} while(count < 100);
		
		System.out.println("깃허브 테스트 중입니다! 깃허브에서...");
		
	}
}



