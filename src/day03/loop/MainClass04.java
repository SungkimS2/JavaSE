package day03.loop;
/*

*
**
***
****
*****
******
*******

�ݺ��� ���ǹ� ����
 �ָ����� 2��for�� �ڵ� �м��ϱ� 
 
2��
   *
  **
 ***
****

3��
   *
  ***
 *****
******* 
  
4��
   *
  ***
 *****
*******
 *****
  ***
   *


   ��
   *
  ***
 *****
******* 
  | | Merry Christmas~*

 
 */

public class MainClass04 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) {
			System.out.print(i+": ");
			for(int j = 0; j < i+1; j++) { 
				System.out.print("*");
			}
			
			System.out.println();	// ����
		}
	}

}
