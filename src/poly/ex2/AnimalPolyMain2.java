package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animalArr={dog,cat,caw};
        for (Animal animal : animalArr) {
            System.out.println("시작");
            animal.sound();
            System.out.println("종료");

        }
    }
}
