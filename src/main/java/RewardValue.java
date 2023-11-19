class RewardValue {
    private double cashValue, milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            // Handle invalid case or throw an exception
            System.out.println("Invalid constructor usage.");
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double convertCashToMiles(double cashValue) {
        return cashValue * 0.0035;
    }

    private double convertMilesToCash(double milesValue) {
        return milesValue / 0.0035;
    }
}