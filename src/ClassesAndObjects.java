public class ClassesAndObjects {
    public static void main(String[] args) {
        Persone persone1 = new Persone();
        persone1.setNameAndAge("Роман",33);
        String s1 = "Вова";
        //persone1.age = 50;
        persone1.sayHello(); //Вызов метода Speek
        Persone persone2 = new Persone();
        persone2.setNameAndAge(s1,22);
        //persone2.age = 25;
        persone2.speek();
        persone1.speek();
        /*int year1 = persone1.calculateYersToReiterment();
        int year2 = persone2.calculateYersToReiterment();
        System.out.println("первому человеку до пенсии " + year1 + " лет");
        System.out.println("второму человеку до пенсии " + year2 + " лет");*/
    }
}

class Persone {
    //У класса могут быть:
    //1.данные(поля),
    //2. действия которые он может совершать (методы)
    String name;
    int age;

    void setNameAndAge(String username, int userage ){
       name = username;
       age = userage;
    }

    int calculateYersToReiterment(){
        int yers = 65 - age;
        return yers;


    }
    void speek() { //метод
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }

    }

    public void sayHello() {
        System.out.println("Привет!");
    }
}
