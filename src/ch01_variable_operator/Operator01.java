package ch01_variable_operator;

public class Operator01 {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 8 ;

        boolean bool1 = a != b ; //두 수가 같지 않으니 true
        boolean bool2 = --a == b++ ; // 두 수를 비교할 때 a는 9, b는 8이므로 false , a = 9, b = 9
        boolean bool3 = a++ != --b ;  //두 수를 비교할 때 a는 9, b는 8이므로 ture , a = 10, b = 8
        boolean bool4 = bool3 && (5>7) ; //bool3은 ture, 5>7은 false이므로 false
        boolean bool5 = !bool4 || ( bool1 && bool2 ) ;
        // 왼쪽 bool4는 false
        // bool1은 true, bool2는 false 이므로 오른쪽은 false
        // bool4만 반전된거임<<

        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("bool3 : " + bool3);
        System.out.println("bool4 : " + bool4);
        System.out.println("bool5 : " + bool5);

    }
}
