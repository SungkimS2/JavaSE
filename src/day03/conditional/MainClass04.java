package day03.conditional;

public class MainClass04 {
	public static void main(String[] args) {
		char ch = 'q';
		switch (ch) {
		case 'w':
			System.out.println("앞으로 이동");
			break;
		case 'a':
			System.out.println("좌측으로 이동");
			break;
		case 's':
			System.out.println("뒤로 이동");
			break;
		case 'd':
			System.out.println("우측으로 이동");
			break;
		default:
			System.out.println("대기!");
			break;
		}
		
		
	}

}
