package org.problemOmr;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class ProblemOmr2 {
    private static int count;

    public static void main(String[] args) {
        /*
         * < OMR 카드 그리기 문제 >
         * 1. 배열 answerCorrect 는 시험문제의 정답지이다.
         * 2. 배열 answerStudent 에 1~5 사이의 랜덤 숫자 5개를 저장한다.
         * 3. answerCorrect 와 answerStudent 의 값을 비교해 정오표를 출력한다.
         * 4. 한 문제당 20점이다.
         * 출력 예시)
         * answerCorrect    = {1, 3, 4, 2, 5}
         * answerStudent    = {1, 1, 4, 4, 3}
         * 정오표             = {O, X, O, X, X}
         * 성적              = 40점
         */

        int[] answerCorrect = {1, 3, 4, 2, 5}; // 시험답안
        int[] answerStudent = new int[5]; // 학생답안
        String[] answerSheet = new String[answerStudent.length];

//        int count = 0; // 정답 맞춘 개수
        int score = 0; // 성적

        Random random = new Random();

        IntStream.range(0, answerCorrect.length).forEach(i -> answerStudent[i] = getRandomNumber(random));

        IntStream.range(0, answerCorrect.length).forEach(i -> {
            Runnable drawFunction = answerCorrect[i] == answerStudent[i] ?
                    () -> handleCorrect(answerSheet, i) :
                    () -> answerSheet[i] = "X";
            drawFunction.run();
        });


        /*
        ## 기능 구현 목록
        ### 1. 랜덤숫자 생성하는 기능
        ### 2. 학생 배열 채우는 기능
        ### 3. 정답과 학생의 정답 배열을 비교하는 기능
        ### 4. 비교하면서 카운트 + 합계까지 내는 기능
        ### 5. 출력 기능
         */

        System.out.printf("정답:     %s \n", Arrays.toString(answerCorrect));
        System.out.printf("학생 정답: %s\n", Arrays.toString(answerStudent));
        System.out.printf("정오표:   %s\n", Arrays.toString(answerSheet));
        System.out.printf("맞춘개수:  %s\n", count);
        System.out.printf("점수:    %s점\n", score = count * 20);
    }

    private static void handleCorrect(String[] answerSheet, int i) {
        answerSheet[i] = "O";
        count++;
    }


    private static int getRandomNumber(Random random) {
        return random.nextInt(1, 6);
    }

}