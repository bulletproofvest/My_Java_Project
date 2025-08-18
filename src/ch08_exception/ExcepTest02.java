package ch08_exception;

import java.util.Scanner;

public class ExcepTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        scan.close() ;

        try{
            System.out.println("첫 번째 정수 입력 : ");
            int x = Integer.parseInt(scan.next()) ;

            System.out.println("두 번째 정수 입력 : ");
            int y = Integer.parseInt(scan.next()) ;
            System.out.println(x / y);
        } catch (NumberFormatException e){
            System.out.println("올바른 형식 입력");
        } catch (ArithmeticException e){
            System.out.println("0으로 나누기 예외 발생");
        } catch (Exception e){
            System.out.println("나머지 예외 항목 발생");
        } finally {
            System.out.println("스캐너 장치 닫음");
            scan.close();
        }
    }
}
