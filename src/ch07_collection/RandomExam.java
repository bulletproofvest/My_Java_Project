package ch07_collection;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] num = new int[3];
        int count = 0;

        for (int i = 0; i < 1000; i++) {

            count++;

            for (int j = 0; j < num.length; j++) {
                num[j] = rand.nextInt(6) + 1;
            }

            for (int exn:num){
                System.out.print(exn + "   ");
            }
            System.out.println();

            if (num[0] == num[1] && num[0] == num[2]) {
                if (num[0] == 5) {
                    continue;
                } else {
                    break;
                }
            }
        }

        System.out.println();
        System.out.println(count + "번째 숫자 3개 : " + num[0] + "\t" + num[1] + "\t" + num[2] + "\t");



    }
}

/*
* package ch07_collection;

import java.util.Random;
import java.util.Arrays;

public class RandomExam {
    public static void main(String[] args) {
        final int DICE_COUNT = 3;
        final int MAX_ATTEMPTS = 1000;
        final int EXCLUDE_NUMBER = 5;

        Random rand = new Random();
        int[] dice = new int[DICE_COUNT];
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            attempts++;

            // 주사위 굴리기
            for (int i = 0; i < DICE_COUNT; i++) {
                dice[i] = rand.nextInt(6) + 1; // 1~6
            }

            // 출력
            System.out.println("시도 " + attempts + ": " + Arrays.toString(dice));

            // 모든 값이 같은지 확인
            if (isAllSame(dice)) {
                // 특정 숫자(예: 5)는 제외
                if (dice[0] == EXCLUDE_NUMBER) {
                    continue; // 다시 굴리기
                } else {
                    break; // 성공 조건
                }
            }
        }

        // 결과 출력
        System.out.println();
        System.out.println("✔ " + attempts + "번째 시도에서 동일한 숫자 3개 발견: " + Arrays.toString(dice));
    }

    // 배열의 모든 값이 같은지 확인하는 메서드
    private static boolean isAllSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) return false;
        }
        return true;
    }
}
*/
