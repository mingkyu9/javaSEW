package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child=new Child();
        System.out.println("Child->Child");
        System.out.println("value="+child.value);
        child.method();

        Parent parent=new Parent();
        System.out.println("P->P");
        System.out.println(parent.value);
        parent.method();

        Parent poly=new Child();
        System.out.println("p->c");
        System.out.println(poly.value);
        poly.method();
    }
}
