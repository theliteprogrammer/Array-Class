public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(90);
        System.out.println("Before:");
        numbers.print();
        numbers.removeAt(4);
        System.out.println("After removing at index 4:");
        numbers.print();
    }
}
