public class FirstHomeWork {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 1;
        int b = -1;
        String answer = ((a+b >= 0) ? "Сумма положительная" : "Сумма отрицательная");
        System.out.println(answer);
        System.out.println(checkSumSignStr(1,2));
        System.out.println(checkSumSignStr(1,-2));
    }

    public static String checkSumSignStr(int a, int b){
        return ((a+b >= 0) ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor(){
        int value  = (int) (Math.random() * 250 - 50);
            System.out.println(value);
            String color = "";
        if (value <=0) color = "Красный";
            else if (value <= 100) color = "Жёлтый";
                else color = "Зелёный";

        System.out.println(color);
    }

    public static void compareNumbers(){
        int a = (int) (Math.random() * 25 - 5);
        int b = (int) (Math.random() * 13 - 3);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(((a >= b) ? "a >= b" : "a < b"));
    }

}
