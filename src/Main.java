public class Main {

    public static void main(String[] args) {
        int initialBalance = 100; // Начальный счет клиента
        int topUpAmount = 1100; // Сумма пополнения счета

        // Переменная для хранения суммы бонусов
        int bonus = 0;

        // Условный оператор проверки, превышает ли сумма пополнения 1000 рублей
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100; // Бонус - 1 рубль за каждые 100 рублей
        }

        int finalBalance = initialBalance + topUpAmount + bonus;

        System.out.println("Итоговая сумма на счету:" + finalBalance + " рублей.");
        System.out.println("Количество бонусных рублей:" + bonus + " рублей.");


    }
}
