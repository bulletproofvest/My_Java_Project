package ch03_array;

public class Array02 {
    public static void main(String[] args) {
        String[] bts = {"진", "뷔", "정국", "rm", "지민", "슈가", "제이홉"};

        System.out.println("배열 요소 출력하기");

        for (int i = 0; i < bts.length; i++) {
            if(i == bts.length - 1){
                System.out.print(bts[i]);
                break;
            }
            System.out.print(bts[i] + ", ");
        }
    }
}
