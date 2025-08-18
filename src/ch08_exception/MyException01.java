package ch08_exception;

public class MyException01 {
    public static void main(String[] args) {
        int x = 3, y = 0;
        int[] arr = {10, 20, 30};
        /*
        // 예외 처리 잘해야함
        try{
            System.out.println("0으로 나누면 안됩니다");

            arr[3] = 50;

        } catch (ArithmeticException ex){
            System.out.println("0으로 나누면 안됩니다");
        } catch (ArrayIndexOutOfBoundsExceptionn ex){
            System.out.println("배열 인덱스 초과 오류 발생");
        } catch (Exception ex){
            System.out.println("기타 다은 예외 발생");
        } finally {
            System.out.println("여기는 예외 발생 여부와 상관 없이 부조건 실행");
            System.out.println("파일 닫기, 데이터 베이스 접속 종료(끊기)");
        }

        */

        try{
            System.out.println("0으로 나누면 안됩니다");

            arr[3] = 50;

        } catch (ArithmeticException ex){
            System.out.println("0으로 나누면 안됩니다");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("배열 인덱스 초과 오류 발생");
            System.out.println("예외 객체 정보 확인");
            System.out.println("관련 메시지 : " + ex.getMessage());
            System.out.println("관련 문자열 : " + ex.toString());

            ex.printStackTrace(); //
        } catch (Exception ex){
            System.out.println("기타 다은 예외 발생");
        } finally {
            System.out.println("여기는 예외 발생 여부와 상관 없이 부조건 실행");
            System.out.println("파일 닫기, 데이터 베이스 접속 종료(끊기)");
        }

    }

}
