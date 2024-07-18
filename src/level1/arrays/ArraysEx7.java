package level1.arrays;

import java.util.Scanner;

public class ArraysEx7 {
    public static void main(String[] args) {
//        실행 결과 예시**
//```
//        1번 학생의 성적을 입력하세요: 국어 점수:100
//        영어 점수:80
//        수학 점수:70
//        2번 학생의 성적을 입력하세요: 국어 점수:30
//        영어 점수:40
//        수학 점수:50
//        3번 학생의 성적을 입력하세요: 국어 점수:60
//        영어 점수:70
//        수학 점수:50
//        4번 학생의 성적을 입력하세요: 국어 점수:90
//        영어 점수:100
//        수학 점수:80
//        1번 학생의 총점: 250, 평균: 83.33333333333333 2번 학생의 총점: 120, 평균: 40.0
//        3번 학생의 총점: 180, 평균: 60.0
//        4번 학생의 총점: 270, 평균: 90.0
//```

        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "수학", "영어"};
        int[] sum = new int[4];
        double[] avg = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = sc.nextInt();
                sum[i] += scores[i][j];
            }
            avg[i] = (double) sum[i] / 3;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + "번 학생의 총점: " + sum[i] + ", 평균: " + avg[i]);
        }

    }
}
