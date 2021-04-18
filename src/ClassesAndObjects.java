public class ClassesAndObjects {
    public static void main(String[] args) {
        Persone persone1 = new Persone();
        persone1.name = "Bob";
        persone1.age = 50;
        persone1.sayHello(); //Вызов метода Speek
        Persone persone2 = new Persone();
        persone2.name = "Alex";
        persone2.age = 25;
        persone2.speek();
    }
}

class Persone {
    //У класса могут быть:
    //1.данные(поля),
    //2. действия которые он может совершать (методы)
    String name;
    int age;

    void speek() { //метод
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }

    }

    public void sayHello() {
        System.out.println("Привет!");
    }
}
