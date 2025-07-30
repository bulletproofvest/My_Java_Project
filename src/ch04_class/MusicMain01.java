package ch04_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MusicMain01 {

    static List<Music01> musicList = new ArrayList<>();

    public static void priMenu(){
        System.out.println("[1] 음악 추가 [2] 곡 정보 검색 [3] 추천곡 받기 [4] 종료 ");
        System.out.print("원하는 서비스를 숫자로 입력하시오 : ");
    }

    public static void musicAdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("곡명 : ");
        String title = sc.nextLine();
        System.out.print("아티스트 : ");
        String artist = sc.nextLine();
        System.out.print("작곡가 : ");
        String composer = sc.nextLine();
        System.out.print("작사가 : ");
        String lyrics = sc.nextLine();
        System.out.print("언어(ko, en, jp) : ");
        String lang = sc.nextLine();

        Music01 music = new Music01(title, artist, composer, lyrics, lang);
        musicList.add(music);

        System.out.println("곡이 저장되었습니다.");
        System.out.println();

    }

    public static void musicSearch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정보를 알고 싶은 곡명을 입력하세요: ");
        String name = sc.nextLine();

        boolean search = false;

        for(Music01 music : musicList){
            if(music.title.equalsIgnoreCase(name)){
                music.display();
                search = true;
                System.out.println();
                break;
            }
        }

        if(!search){
            System.out.println("곡을 찾을 수 없습니다.\n음악을 추가해주세요.");
            System.out.println();
        }

    }

    public static void musicRandom(){
        List<Music01> lamusiclist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("언어를 골라주세요(ko, en, jp) : ");
        String la = sc.next();

        for(Music01 music : musicList){
            if(music.lang.equalsIgnoreCase(la)){
                lamusiclist.add(music);
            }
        }

        if(lamusiclist.isEmpty()){
            System.out.println("저장된 곡이 없습니다.\n음악을 추가해주세요.");
            System.out.println();
        }else {
            Random ran = new Random();
            int ranbomnum = ran.nextInt(lamusiclist.size());
            System.out.println("🎧 추천 곡명: " + lamusiclist.get(ranbomnum).title);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            priMenu();
            int num = sc.nextInt();

            if(num == 4){
                System.out.println("종료합니다.");
                break;
            } else if (num == 1){
                musicAdd();
            } else if (num == 2) {
                musicSearch();
            } else if (num == 3) {
                musicRandom();
            } else {
                System.out.println("다시 입력해주세요.");
                System.out.println();
            }
        }

    }
}
