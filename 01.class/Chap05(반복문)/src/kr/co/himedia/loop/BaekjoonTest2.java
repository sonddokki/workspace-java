package kr.co.himedia.loop;

import java.util.Scanner;

public class BaekjoonTest2 {
	public static void main(String[] args) {
        // 스캐너 적용
        Scanner scanner = new Scanner(System.in);

        // n에 입력할 정수 받기
        int n = scanner.nextInt();

        // 배열 num의 갯수를 n으로 지정
        int[] num = new int [n];

        // for문을 통해 배열 num에 정수를 n의 수만큼 입력받기
        for (int i=0;i<n;i++) {
            num[i] = scanner.nextInt();
        }

        // 최대값과 최소값으로 쓸 변수 선언
        int min = num[0];
        int max = num[0];

        // for문을 통해 배열 num이 max보다 크면 그 num을 max에 대입
        // 그리고 그것을 반복
        // 동일한 방식으로 부등호를 바꿔 min도 적용
        for (int i=0;i<n;i++) {
            if ( num[i] > max ) {
                max = num[i];
            }
            if ( num[i] < min ) {
                min = num[i];
            }
        }
        // for문을 빠져나와 최소와 최대값을 출력
        System.out.print( min + " " + max );

    }
}
