// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Записываем цену билета в рублях, и цену за 1 милю, делим цену на стоимость бесплатной мили
        int TicketPrice = 15800;
        int BonusesMilePrice = 20;
        int Bonuses = (TicketPrice / BonusesMilePrice);

        // Выводим результат
        System.out.println(Bonuses);

    }
}