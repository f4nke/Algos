public class Main {
    public static void main(String[] args) {
        Chain<Integer, String> map = new Chain<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");


        System.out.println(map);
        map.remove(2);
        System.out.println(map);
        /*
        вывод на консоль:
        1, 2, 3, 4, 5,
        1, 3, 4, 5,
         */
    }
}
