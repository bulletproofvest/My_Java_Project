package ch04_class;



public class Music01 {

    String title;
    String artist;
    String composer;
    String lyrics;
    String lang;
    int count;

    public Music01(String title, String artist, String composer, String lyrics, String lang){
        this.title = title;
        this.artist = artist;
        this.composer = composer;
        this.lyrics = lyrics;
        this.lang= lang;
    }

    void display(){
        System.out.println("곡명 : " + title);
        System.out.println("아티스트 : " + artist);
        System.out.println("작곡가 : " + composer);
        System.out.println("작사가 : " + lyrics);
        System.out.println("언어 : " + lang);
    }

}
