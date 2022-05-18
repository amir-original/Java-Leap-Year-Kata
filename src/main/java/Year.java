public class Year {
    private final int  year;

    public Year(int year){
        this.year = year;
    }

    public Boolean isLeapYear() {
        return isDivisibleByFour() && !(isDivisibleByOneHundred() && isNotDivisibleByFourHundred());
    }

    private boolean isNotDivisibleByFourHundred() {
        return isNotDivisibleBy(400);
    }

    private boolean isDivisibleByOneHundred() {
        return isDivisibleBy(100);
    }

    private boolean isDivisibleByFour() {
        return isDivisibleBy(4);
    }

    private boolean isNotDivisibleBy(int number) {
        return year % number != 0;
    }

    private boolean isDivisibleBy(int number) {
        return year % number == 0;
    }

}
