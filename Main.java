import taxes.TaxIncome;
import taxes.TaxIncomeExpense;


public class Main {
    public static void main(String[] args) {
        Company c = new Company("ООО Батарейка", new TaxIncomeExpense());
        Deal deals[] = {
                new Sale("Конфеты Я в шоколаде", 14000),
                new Sale("Карамель Ерундук", 15000),
                new Expenditure("Какао-порошок плавленый", 9000),
                new Sale("Леденцы Куркума на палочке", 6000),
                new Expenditure("Сахар-песок с ароматом винегрета", 2000),
                new Expenditure("Щепа рубленая с занозами", 6000)
        };
        int marginTotal;

        System.out.println("2023 год");

        marginTotal = c.applyDeals(deals);
        System.out.println("Доход gross: " + marginTotal);

        System.out.println("2024 год");

        c.setTaxSystem(new TaxIncome());
        marginTotal = c.applyDeals(deals);
        System.out.println("Доход gross: " + marginTotal);

    }
}
