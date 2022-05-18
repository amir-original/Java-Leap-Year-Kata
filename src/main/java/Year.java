public class Year {
    private final int  year;

    public Year(int year){
        this.year = year;
    }

    public Boolean isLeapYear() {
       return isDivisibleByFour() && !(isDivisibleByOneHundred() && !isDivisibleByFourHundred());
    }

    private boolean isDivisibleByFour() {
        return year % 4 == 0;
    }

    private boolean isDivisibleByFourHundred() {
        return year % 400 == 0;
    }

    private boolean isDivisibleByOneHundred() {
        return year % 100 == 0;
    }
}
