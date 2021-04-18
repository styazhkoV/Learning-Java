public class ClassesAndObjects {
    public static void main(String[] args) {
        Persone persone1 = new Persone();
        persone1.name = "Bob";
        persone1.age = 50;
        System.out.println("Меня зовут "+ persone1.name +","+ "мне" + persone1.age+"лет");
        Persone persone2 = new Persone();
        persone2.name = "Alex";
        persone2.age = 21;
        System.out.println("Меня зовут "+ persone2.name +","+ "мне" + persone2.age+"лет");
    }
}
class Persone{
    //У класса могут быть:
    //1.данные(поля),
    //2. действия которые он может совершать (методы)
    String name;
    int age;

}