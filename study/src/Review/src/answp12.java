import java.util.Scanner;

public class answp12 {

	public static void main(String[] args) {
		/*
		 * 중간고사를 입력하시오 : 90 기말고사를 입력하시오 : 89 레포트고사를 입력하시오 : 99 출석고사를 입력하시오 : 100
		 * 
		 * 중간고사 : 90 기말고사 : 89 레포트 : 99 출석 : 100
		 * 
		 * 성적=93.20 <---소수이하 2째자리까지 학점=A System.out.printf("성적 : %.2f", avg);
		 * 평가=excellent
		 * 
		 * 
		 * 조건1) (중간+기말)/2 ---> 60% 레포트 ---> 20% 출석 ---> 20%
		 * 
		 * 조건2) 90이상 'A'학점 (3)A,B학점 ---->"excellent" 80이상 'B'학점 C,D학점 ---->"good" 70이상
		 * 'C'학점 F학점 ---->"poor" 60이상 'D'학점 (switch문이용) 나머지 'F'학점 (if~else if문이용)
		 */
		
		int middle, finals;
		double attend, report;
		char grade;
		String app = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("중간고사 : ");
		middle = scan.nextInt();
		
		System.out.print("기말고사 : ");
		finals = scan.nextInt();
		
		System.out.print("레포트 : ");
		report = scan.nextInt();
		
		System.out.print("출석 : ");
		attend = scan.nextInt();
		
		double mifi = ((middle+ finals) /2) * 0.6;
		report = report * 0.2;
		attend = attend * 0.2;
		
		double result = mifi + report + attend;
		System.out.println(result);
		
		if ( result >= 90 ) 
			grade ='A';
		else if (result >= 80 )
			grade ='B';
		else if (result >= 70 )
			grade ='C';
		else if (result >= 60 )
			grade ='D';
		else
			grade ='F';
		
		
		switch (grade) {
		case 'A' :
		case 'B' :	
			app = "excellent";
			break;
		case 'C' :
		case 'D' :	
			app = "good";
		case 'F' :	
			app = "poor";
		default:
			break;
		}
		
		System.out.printf("성적 : %.2f\n" , result);
		System.out.println("학점 : " + grade);
		System.out.println("평가 : " + app);
	}

}
