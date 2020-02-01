package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] randomLotto = new int[6];
		int[] userLotto = new int[6];
		int count = 0;

		//로또번호 랜덤 생성
		for (int i = 0; i < randomLotto.length; i++) {
			randomLotto[i] = (int)(Math.random()*45)+1;
			//중복 체크
			for (int j = 0; j < i; j++) {
				if(randomLotto[i]==randomLotto[j]){
					i=i-1;
				}
			}
		}
		//유저 로또번호
		for (int i = 0; i < userLotto.length; i++) {
			System.out.print(i+1+"번째 수 : ");
			userLotto[i] = sc.nextInt();
			//음수, 45이상 체크
			if(userLotto[i]>0&&userLotto[i]<=45) {
				//중복 체크
				for (int j = 0; j < i; j++) {
					if(userLotto[i]==userLotto[j]) {
						//중복 되었을떄 재입력
						i--;
					}
				}
			}else {
				//음수,45초과가 되었을떄 재입력
				i--;
			}
			
		}
		//당첨번호 비교
		for (int i = 0; i < userLotto.length; i++) {
			for (int j = 0; j < randomLotto.length; j++) {
				
				if(userLotto[i] == randomLotto[j]) {
					count++;
					break;
				}
			}
			if(count == 6 ) {
				System.out.println("당첨!");
			}
		}
	}
}