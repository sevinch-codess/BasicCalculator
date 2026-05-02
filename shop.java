class Shop {
    private double priceBubblegum = 2;
    private double priceToffee = 0.2;
    private double priceIceCream = 5;
    private double priceMilkChocolate = 4;
    private double priceDoughnut = 2.5;
    private double pricePancake = 3.2;

    private double earnedBubblegum = 202;
    private double earnedToffee = 118;
    private double earnedIceCream = 2250;
    private double earnedMilkChocolate = 1680;
    private double earnedDoughnut = 1075;
    private double earnedPancake = 80;

private double expensesStaff;
    private double expensesOther;
    private double income = earnedBubblegum + earnedToffee + earnedIceCream + earnedMilkChocolate +
            earnedDoughnut + earnedPancake;

    public void printPrices() {
        System.out.println("Prices:\nBubblegum: $" + priceBubblegum +
                "\nToffee: $" + priceToffee +
                "\nIce cream: $" + priceIceCream +
                "\nMilk chocolate: $" + priceMilkChocolate +
                "\nDoughnut: $" + priceDoughnut +
                "\nPancake: $" + pricePancake);
    }

    public void printEarnedAmounts() {
        System.out.println("Earned amount:\nBubblegum: $" + earnedBubblegum +
                "\nToffee: $" + earnedToffee +
                "\nIce cream: $" + earnedIceCream +
                "\nMilk chocolate: $" + earnedMilkChocolate +
                "\nDoughnut: $" + earnedDoughnut +
                "\nPancake: $" + earnedPancake +
                "\n" +
                "\nIncome: $" + income);
    }

 public void printExpenses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses:");
        expensesStaff = scanner.nextInt();
        System.out.println("Other expenses:");
        expensesOther = scanner.nextInt();
        double netIncome = income-expensesStaff-expensesOther;
        System.out.println("Net income: $" + netIncome);
    }
}
