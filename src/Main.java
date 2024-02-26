import task1.Calculator;
import task2.helperClasses.Animal;
import task2.helperClasses.Cat;
import task2.CompareArrays;
import task2.helperClasses.Dog;
import task3.Pair;

public class Main {
    public static void main(String[] args) {
        //калькулятор
        double x = 2;
        int y = 7;
        double i = Calculator.sum(x, y);
        System.out.println(i);
        System.out.println(Calculator.multiply(x, y));
        System.out.println(Calculator.divide(x, y));
        System.out.println(Calculator.subtract(x, y));

        //Сравнение массивов
        Cat[] arr1 = {new Cat(), new Cat(), new Cat()};
        Cat[] arr2 = {new Cat(), new Cat(), new Cat(), new Cat()};
        System.out.println(CompareArrays.compareArrays(arr1, arr2));

        Animal[] arr3 = {new Cat(), new Cat(), new Cat()};
        System.out.println(CompareArrays.compareArrays(arr1, arr3));

        Animal[] arr4 = {new Cat(), new Dog(), new Cat()};
        System.out.println(CompareArrays.compareArrays(arr1, arr4));

        //Pair
        Pair<Cat[], Animal[]> pair = new Pair<>(arr1, arr3);
        System.out.println(pair);
    }
}
