public class Main {
    public static void main(String[] args) {
        int initialBalance = 1000;
        int cashIn = 20_000;
        int bonus;
        int finalBalance;

        if (cashIn <= 1000) {
            bonus = 0;
            finalBalance = (initialBalance + cashIn + bonus);

        } else {
            bonus = cashIn / 100;
            finalBalance = (initialBalance + cashIn + bonus);
        }

        System.out.println("Количество полученных бонусов: " + bonus);
        System.out.println("Итоговый баланс: " + finalBalance);
    }
}