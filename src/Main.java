public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили
        int price = 13676;
        int amountOfRublesForBonuses = 20;

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int bonusMiles = price/amountOfRublesForBonuses;
        System.out.println("Количество бонусных миль = " + bonusMiles);
    }
}