package ch04_class;



public class Music01 {

    String title;
    String artist;
    String composer;
    String lyrics;
    String lang;
    int count;

    public Music01(String title, String artist, String composer, String lyrics, String lang){
        // this.title = (title == null) ? "알 수 없음" : title; -> if -else
        this.title = title;
        this.artist = (artist == null) ? "알 수 없음" : artist;
        this.composer = (composer == null) ? "알 수 없음" : composer;
        this.lyrics = (lyrics == null) ? "알 수 없음" : lyrics;
        this.lang = (lang == null) ? "알 수 없음" : lang;
    }


    void display(){
        System.out.println("곡명 : " + title);
        System.out.println("아티스트 : " + artist);
        System.out.println("작곡가 : " + composer);
        System.out.println("작사가 : " + lyrics);
        System.out.println("언어 : " + lang);
    }

}
