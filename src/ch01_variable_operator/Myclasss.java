package ch01_variable_operator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//String food, String color, String music, String movie, String book, String firstLove

public class Myclasss {
    public static void main(String[] args) {

        ArrayList<String> MyList = new ArrayList<>();
        ArrayList<String> YouList = new ArrayList<>();
        ArrayList<String> queList = new ArrayList<>(Arrays.asList("좋아하는 음식", "좋아하는 색상", "좋아하는 음악","좋아하는 영화", "좋아하는 책", "첫사랑"));
        // ~~의 ~~은?

        int quenum = queList.size();
        Scanner sc = new Scanner(System.in);
        String Myname;
        String Youname;

        System.out.println("유저 이름:");
        Myname = sc.nextLine();

        for(int i = 0; i<quenum; i++){
            System.out.println(Myname + "의" + queList.get(i) + "은?");
            String input = sc.nextLine();
            MyList.add(input);
        }

        System.out.println(MyList);

        System.out.println("상대 유저 이름:");

        for(int i = 0; i<quenum; i++){

        }

    }
}
