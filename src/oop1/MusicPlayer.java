package oop1;

public class MusicPlayer {
    int volume=0;
    boolean isOn=false;

     void on(){
        isOn=true;
        System.out.println("음악 플레이를 시작");
    }
     void off(){
       isOn=false;
        System.out.println("음악 플레이를 종료");
    }
     void volumeUp(){
       volume++;
    }
     void volumeDown(){
        volume--;
    }
     void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON 볼륨"+volume);
        }else{
            System.out.println("OFF");
        }
    }
}
