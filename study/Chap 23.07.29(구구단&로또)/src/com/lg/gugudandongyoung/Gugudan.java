package com.lg.gugudandongyoung;

import java.util.Scanner;

public class Gugudan {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        // 시작할 단 입력 받기
        int startNumber = inputStartNumber(scanner);
        // 종료할 단 입력 받기
        int endNumber = inputEndNumber(scanner);
        // 반복 길이 입력 받을 메서드
        int endLength = inputEndLengt(scanner);

        final int startLength = 1;
        int row = endNumber - startNumber + 1;
        int column = endLength;
        int[][] result = new int[row][column];

        // 계산 결과 저장하기
        for (int i = startNumber; i <= endNumber; i++) {
            int rowIndex = i - startNumber; // 2차원 배열 result의 행 인덱스
            for (int j = startLength; j <= endLength; j++) {
                int columnIndex = j - 1; // 2차원 배열 result의 열 인덱스
                result[rowIndex][columnIndex] = calc(i, j);
            }
        }

        // 구구단 출력하기
        for (int i = startNumber; i <= endNumber; i++) {
            int rowIndex = i - startNumber; // 2차원 배열 result의 행 인덱스
            System.out.println("=====" + i + "단 =====");
            for (int j = startLength; j <= endLength; j++) {
                int columnIndex = j - 1; // 2차원 배열 result의 열 인덱스
                show(rowIndex, columnIndex, i, j, result);
            }
        }
    }



    // 시작할 단 입력 받는 메서드 - 타입 변수
    private int inputStartNumber(Scanner scanner) {
        System.out.print("시작할 단 입력: ");
        return scanner.nextInt();
    }

    // 종료할 단 입력 받는 메서드
    private int inputEndNumber(Scanner scanner) {
        System.out.print("종료할 단 입력: ");
        return scanner.nextInt();
    }

    // 반복 길이 입력 받을 메서드
    private int inputEndLengt(Scanner scanner) {
        System.out.print("반복할 길이 입력: ");
        return scanner.nextInt();
    }

    // 구구단 결과를 계산할 메서드
    private int calc(int i, int j) {
        return i * j;
    }

    // 구구단 출력 메서드
    private void show(int rowIndex, int columnIndex, int i, int j, int[][] result) {
        System.out.printf("%d * %d = %d%n", i, j, result[rowIndex][columnIndex]);
    }
}
