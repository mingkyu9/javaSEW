package oop1;

public class MusciPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data=new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
        System.out.println("음악 종료");
    }
    static void on(MusicPlayerData data){
        data.isOn=true;
        System.out.println("음악 플레이를 시작");
    }
    static void off(MusicPlayerData data){
        data.isOn=true;
        System.out.println("음악 플레이를 종료");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON 볼륨"+data.volume);
        }else{
            System.out.println("OFF");
        }
    }
}