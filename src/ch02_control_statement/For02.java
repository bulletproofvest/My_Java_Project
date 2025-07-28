package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= 10 ; i++) {

            if(i%2==0){
                even += i;
            }else{
                odd += i;
            }
        }
        System.out.println("홀수 : " + odd);
        System.out.println("짝수 : " + even);

        odd = 0;
        even = 0;

        for (int i = 1; i <= 10 ; i++) {

            switch (i%2){
                case 0:
                    odd += i;
                    break;
                case 1:
                    even += i;
                    break;
                default:
                    System.out.println("오류");
                    System.exit(0);
            }
        }

        System.out.println("홀수 : " + odd);
        System.out.println("짝수 : " + even);
    }
}
