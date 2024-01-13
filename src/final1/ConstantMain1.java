package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 참여자 수"+1000);
        int currentUserCount=999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    private static void process(int currentUerCount){
        System.out.println(currentUerCount);
        if(currentUerCount>1000){
            System.out.println("대기자");
        }else{
            System.out.println("게임에 참여");
        }
    }
}
