package taxes;

public class TaxIncomeExpense extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        int diff = debit - credit;
        return (diff > 0) ? diff * 15 / 100 : 0;
    }
}
