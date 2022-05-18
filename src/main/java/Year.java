public class Year {
    private final int  year;

    public Year(int year){
        this.year = year;
    }

    public Boolean isLeapYear() {
        return isDivisibleBy(4) && !(isDivisibleBy(100) && isNotDivisibleBy(400));
    }

    private boolean isNotDivisibleBy(int number) {
        return year % number != 0;
    }

    private boolean isDivisibleBy(int number) {
        return year % number == 0;
    }

}
