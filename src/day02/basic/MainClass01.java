package day02.basic;

/*
 * 주석 - 컴퓨터가 인식하지 않는 영역
 *
 * 여러줄 주석 입니다.
 * 
 */


// 한줄 주석
// 자바 코드 시작 class
public class MainClass01 {
	
	/**
	 * JavaDoc 주석
	 * 공신력 있는 주석. 
	 * 자바 코드에 포함.
	 * 
	 * main() - 자바 처음 실행되는 메소드
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// print 메소드 호출 "안녕하세요~" 출력!
		print();
	}
	
	/**
	 * 안녕하세요 출력 메소드
	 */
	public static void print() {
		System.out.println("안녕하세요~");
	}

}
