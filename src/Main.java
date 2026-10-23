public class Main {
    static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        /* так ну ошибка возникает примерно здесь
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Calculator.lambda$new$3(Calculator.java:10)
        at Main.main(Main.java:7)
        вобщем ошибка говорит что на 0 делить нельзя, поэтому надо сделать проверку y на 0
        и обработать ошибку( сделаю в классе Calculator
        */
        try {
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
