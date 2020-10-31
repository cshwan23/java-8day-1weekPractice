package com.naver.erp;

public class Workspace04 {

	public static void main(String[] args) {
		
		
		
		//국어 95점 영어 88점 수학77
		
		
		int kor = 95;
		int eng = 88;
		int mat = 39;
		
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		
		String hakjum = "";
		String result = "";
		
		if (avg >= 90 && avg <= 100) {
			
			hakjum = "a";
			
		}else if (avg >= 80) {
			
			hakjum = "b";
			
		}else if (avg >= 70) {
			
			hakjum = "c";
			
		}else if (avg >= 60) {
			
			hakjum = "d";
		}else {
			
			hakjum = "f";
		}
		System.out.println("문1 = " + hakjum);
		
//문제 2)
//평균 80점이 넘으면 "합격"
// 80 미만이면 "불합격" 출력
		
		if (avg >= 80) {
			
			result = "합격";
			
		}else{
			
			result = "불합격";
			
		}
		System.out.println("문2 = " + result);
		
//문제3)
//삼항연산자를 이용하여 합격 불합격을 출력하자
		
		String result1 = avg >= 80 ? "합격" : "불합격";
		
		System.out.println("문3 = " + result1);
	
//문제4)
// 아래의 조건을 만족하면 합격 만족하지 못하면 불합격
// 조건 - 평균 60 이상, 각과목 40 이상
		
		if (avg < 60 || kor < 40 || eng < 40 || mat < 40) {
			
			
			result = "불합격";
			
			
		}else {
			
			result = "합격";
			
		}
		
		System.out.println("문4 = " + result);

		
//문제5)
//1부터 5까지 더한 결과를 출력
		
		tot = 0;
		
		for ( int i = 1; i <= 5 ; i++  ) {
			
			
			tot += i;
			
		}
		System.out.println("문5 = " + tot);
		
//문제6)
//1부터 5까지 더하되 홀수만 골라 더한 결과를 출력하기
		
		tot = 0;
		
		for ( int i = 1 ;  i <= 5 ; i+=2 ) {
			
			tot = tot + i;
			
		}
		System.out.println("문6 = " + tot);
		
//문제7)
//증감식 i++를 건들지말고 홀수의 합을 구해보기
// -> 알게 된 사실
// 반복문에서 i가 1씩 증감할 때
// i%2로 나눈 나머지 값은 2개가 나온다. 1 아니면 0
// i%3로 나눈 나머지 값은 3개가 나온다. 1 아니면 2 아니면 0 
// i%4로 나눈 나머지 값은 4개가 나온다. 1 아니면 2 아니면 3 아니면 0
		
		tot = 0;
		
		for (int i = 1 ; i <= 5 ; i++) {
			
			if (i%2 == 1) {
			// 2로 나눈 나머지가 0아니면1인데
			// 짝수나 홀수는 2개로 반복되기 때문
				
				tot = tot + 1;
				
			}
			
			
		}
		System.out.println("문7 = " + tot);

//문제8)
// for 문을 사용하여 1~ 60까지 더하되 40번대 숫자를 제외하고 더한 결과값을 출력
		
		tot = 0;
		
		for (int i = 1 ; i <= 60 ; i++ ) {
			
			
			if (!(i >= 40 && i < 50 )) {
		
			
				tot = tot + i;
			}

		}
		
		System.out.println("문제8 = " + tot);
		
//문제 9)
//5단 구구단을 아래처럼 출력
// 5 X 1 = 5
// 5 X 2 = 10
// 5 X 3 = 15
		System.out.println("문제9");
		
		int a = 5;
		
		for ( int i = 1 ; i < 10 ; i++) {
		
			
			System.out.println(a + " X " + i + " = " + a*i );
			
		}
		
//문제 10)
//ocjp 문제
//i의 값을 구하시오
		
		int i = 1;   
		int j = i++; 
		if ( ( i == ++j ) | ( i++ == j ) ) {
			   
			i = i + j;
			    
		}
		
		System.out.println("문10 = " + i );
//i = 5 출력
		
//문제 11) 
//i 값 구하시오
		i = 1;   
		j = i++; 
		
		if ( ( i == ++j ) || ( i++ == j ) ) {
			        
			i = i + j;
			   
		}
		
		System.out.println("문11 = " + i );
		//4출력
		
//문제 12)
//평균 60이상 두과목 70점이상 합
//cnt변수 써서 증감식으로 만드시오
		
		int cnt = 0;

		if (kor >= 70) {
			cnt++;
		}
		if (mat >= 70) {
			cnt++;
		}
		if (eng >= 70) {
			cnt++;
		}
		if (avg >= 60 && cnt >1 ) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println("문12 = " + result);
		
//문제 13)
//switch 구문
//break 쓰는 이유
//같다면 원하는 데이터 갖고 빠져나오게 하려고
//break를 안 써 놨다면,
//만약 true 여도 그대로 지나서 다음브레이크 앞의 데이터 실행구문을 실행한다.
//(case가 맞지 않아도)
		
		result = "";
		int xxx = (int)avg;
		
		switch (xxx) {
		
		case 100 : result = "A"; break;
		case 99 : result = "A"; break;
		default : result = "점수없음"; break;
		// 위에 나온 케이스에 맞는 값이 없을 경우 디폴트 오른쪽 실행구문 실행. 
		
		// switch 구문의 장점 : 화면에 벗어날 정도로 길어져도 switch 구문인지 알 수 있다.
		// case 때문에
		}

		
		
		
		
		
	}

}
