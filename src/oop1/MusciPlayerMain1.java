package oop1;

public class MusciPlayerMain1 {
    public static void main(String[] args) {
        int volume=0;
        boolean isOn=false;

        isOn=true;
        System.out.println("음악 플레이를 시작");

        volume++;
        System.out.println("음악 플레이어 볼륨"+volume);

        volume++;
        System.out.println("음악 플레이어 볼륨"+volume);

        volume++;
        System.out.println("음악 플레이어 볼륨"+volume);

        volume--;
        System.out.println("음악 플레이어 감사"+volume);

        System.out.println("음악 플레이 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON 볼륨"+volume);
        }else{
            System.out.println("OFF");
        }
        isOn=false;
        System.out.println("음악 종료");
    }
}
