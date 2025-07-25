package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = 24;
        String status = "";

        if(temperature >= 35){
            status = "폭염 경보";
        } else if (temperature > 30) {
            status = "무더운 날씨";
        }else if (temperature > 20) {
            status = "쾌적한 날씨";
        }else if (temperature > 10) {
            status = "쌀쌀한 날씨";
        }else{
            status = "추운 날씨";
        }

        System.out.println(status);

    }
}
