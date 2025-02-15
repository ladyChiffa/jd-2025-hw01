import taxes.TaxSystem;

public class Company {
    protected String title;
    protected int debit;
    protected int credit;
    protected TaxSystem tsystem;

    public Company (String title, TaxSystem tsystem) {
        this.title = title;
        this.tsystem = tsystem;
        this.debit = 0;
        this.credit = 0;
    }

    public void shiftMoney(int amount) {
        if (amount >= 0 ) { debit += amount; }
        else { credit += Math.abs(amount); }
    }

    public void setTaxSystem ( TaxSystem system ) {
        this.tsystem = system;
    }

    public void payTaxes () {
        int payments = tsystem.calcTaxFor(this.debit, this.credit);
        System.out.println("Компания " + this.title + " уплатила налог в размере: " + payments + " руб.");
        this.debit = 0;
        this.credit = 0;
    }

    public int applyDeals(Deal deals[]){
        int diff = 0;
        for (int i = 0; i < deals.length; i++){
            shiftMoney(deals[i].debitChange);
            shiftMoney(-deals[i].creditChange);
            diff += deals[i].debitChange - deals[i].creditChange;
        }
        payTaxes();
        return diff;
    }
}
