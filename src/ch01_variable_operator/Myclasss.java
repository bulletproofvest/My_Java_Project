package ch01_variable_operator;
import java.util.*;


//String food, String color, String music, String movie, String book, String firstLove

public class Myclasss {
    public static void main(String[] args) {

        ArrayList<String> MyList = new ArrayList<>();
        ArrayList<String> YouList = new ArrayList<>();
        ArrayList<String> queList = new ArrayList<>(Arrays.asList("좋아하는 음식", "좋아하는 색상", "좋아하는 음악","좋아하는 영화", "좋아하는 책", "첫사랑"));
        // ~~의 ~~은?

        int quenum = queList.size(); //queList size
        Scanner sc = new Scanner(System.in);
        String Myname;
        String Youname;

        System.out.print("유저 이름: ");
        Myname = sc.nextLine();

        for(int i = 0; i<quenum; i++){
            System.out.println(Myname + "의" + queList.get(i) + "은?");
            String input = sc.nextLine();
            MyList.add(input);
        }

        System.out.print("상대 유저 이름: ");
        Youname = sc.nextLine();

        for(int i = 0; i<quenum; i++){
            System.out.println(Youname + "의" + queList.get(i) + "은?");
            String input = sc.nextLine();
            YouList.add(input);
        }


        Collections.shuffle(queList); //리스트를 무작위로 섞음

        System.out.println(Youname+"에 대해 맞춰보세요.");

        for(int i=0; i<quenum; i++){

            System.out.println(Youname + "의" + queList.get(i) + "은?");
            String input = sc.nextLine();

            String output = YouList.get(i);

            if(input.equals(output)){
                System.out.println("맞췄습니다.");
            }
            else {
                System.out.println("틀렸습니다.");
                i--;
            }
        }

        Collections.shuffle(queList);

        System.out.println(Myname+"에 대해 맞춰보세요.");

        for(int i=0; i<quenum; i++){

            System.out.println(Myname + "의" + queList.get(i) + "은?");
            String input = sc.nextLine();

            String output = MyList.get(i);

            if(input == null){
                MyList.remove(i);

            }
            if(input.equals(output)){
                System.out.println("맞췄습니다.");
            }

            else {
                System.out.println("틀렸습니다.");
                i--;
            }

            System.out.println("게임 종료");
        }


    }
}
