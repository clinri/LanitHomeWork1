import main.java.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik vasya = new Kotik("Вася","мэу",3,3000);
        Kotik masha = new Kotik();
        masha.setName("Машка");
        masha.setVoice("мяяяу");
        masha.setSatiety(4);
        masha.setWeight(2500);

    }
}