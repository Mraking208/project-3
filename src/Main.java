public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 30000;
        int bonus = replenishment > 1000 ? replenishment / 100 : replenishment;
        int finish = balance + replenishment + bonus;
        System.out.println("Итоговый баланс " + finish);
        System.out.println("Бонус равен " + bonus);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}