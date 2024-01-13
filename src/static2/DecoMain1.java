package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s="hello java";
        DecoUtill1 utill1 = new DecoUtill1();
        String deco = utill1.deco(s);

        System.out.println("before"+s);
        System.out.println("after"+deco);

    }
}
