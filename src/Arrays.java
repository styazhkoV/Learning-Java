public class Arrays {
    public static void main(String []args) {
        int number = 10; // примитивный тип данных [10]
        int [] numbers = new int [5];//  numbers -> [массив] Ссылочный тип данных
        for(int i = 0; i < numbers.length; i++ ) {//сначала создаём массив
            numbers[i] = i * 10;
        }for (int i = 0; i< numbers.length; i++){// потом его инициализируем
                System.out.println(numbers[i]);
            }
        int[] numbers1 ={1,2,3,};//создаём массив и сразу его инициализируем
        for(int i = 0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
        }



}
