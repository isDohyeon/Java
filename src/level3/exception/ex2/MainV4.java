package level3.exception.ex2;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
        NetworkServiceV4 serviceV4 = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                serviceV4.sendMessage(input);
            } catch (Exception e) { // 공통 예외 처리
                exceptionHandler(e);
            }
            System.out.println();

        }
        System.out.println("프로그램 정상 종료");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);

        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
