package ch02_control_statement;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 10;
        int last_day = 0;

        // switch case 구문 사용

        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                last_day = 31;
                break;
            case 4, 6, 9, 11:
                last_day = 30;
                break;
            case 2:
                last_day = 29;
                break;
            default:
                System.out.println("오류");
                System.exit(0); // 프로그램 강제 종료
        }
        System.out.println(month + "월의 마지막 날은 " + last_day + "일 입니다.");
    }
}
