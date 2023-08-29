package com.javaex.ex01;

import java.util.Scanner;

public class CalendarComplete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하시오 : ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하시오 : ");
        int month = scanner.nextInt();
        int lastDate = 0;
        int weekNum = 0;

        boolean isLeapYear = false;

        String[] week = new String[]{"일","월","화","수","목","금","토"};

        // 1년부터 입력한 해까지의 윤년개수만큼 1일 추가
        for (int i=1;i<year;i++) {
            if ( (i % 4 == 0 && i % 100 != 0) || i % 400 == 0 )  {
                lastDate += 1;
            }
        }

        //입력한 해가 윤년일경우 트루를 반환d
        if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )  {
            isLeapYear = true;
        }

        //입력한 월의 앞쪽부분을 반복으로 더해서 반환
        for (int i=1;i<month;i++) {
            switch ( i ){
                case 1: case 3:  case 5: case 7: case 8: case 10: case 12:
                    lastDate += 31;
                    break;
                case 2:
                    lastDate += isLeapYear ? 29 : 28;
                    break;
                case 4: case 6: case 9: case 11:
                    lastDate += 30;
                    break;
            }
        }
        //입력한 월의 날짜 수를 반환
        switch ( month ){
            case 1: case 3:  case 5: case 7: case 8: case 10: case 12:
                weekNum = 31;
                break;
            case 2:
                weekNum = isLeapYear ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                weekNum = 30;
                break;
        }

//        지나온 해의 일수를 구하기 위해 현재 연도는 제외
        int lastYear = year-1;

        int total = 1+ lastDate + (lastYear * 365) ; // 지정월 이전까지의 총일수
        //  첫시작날 + 지나온 달의 일수 + 지나온 년의 일수

        int day = total % 7; // 시작 요일

        System.out.println("1년부터 입력된 년도까지 지나온 날 수 = " + total);
//        System.out.println( day ); 요일배열의 번호
//        System.out.println(week[day]);

        System.out.println("       " + year + "년 " + month + "월");
        System.out.println("일  " + "월  " + "화  " + "수  " + "목  " + "금  " + "토  ");
        System.out.println("---------------------------");

//        첫째주 첫요일만큼 앞에 공백을 주기
        String whith = "    ";
        for (int i=1;i<=day;i++) {
            System.out.print(whith);
        }

//        입력된 월에 맞는 날짜수를 printf로 출력
        for (int i=1;i<=weekNum;i++) {
            System.out.printf( "%02d  ",i );
            day++;
            if (day == 7) {  // 배열 요일을 순환하여 토요일에 줄바꿈 입력
                System.out.println();
                day = 0;
            }
        }

        
    }
}

