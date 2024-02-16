public class Commision extends Hourly {

    double totalSales;
    double rate;


    public Commision(String name, String address, String phoneNumber, String socialSecurity, double hourlyPay, double rate) {
        super(name, address, phoneNumber, socialSecurity, hourlyPay);
        this.rate = rate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {

        return super.pay() + totalSales * rate;

    }

    public String toString() {
        return super.toString() + "\nTotal Sales " + totalSales;
    }


}
