public class Date {
    private int month;
    private int day;
    private int year;

    public Date (int month, int day, int year) {

        if (month < 0) {
            month = 0;
            this.month = month;
        }
        this.month = month;

        if (day < 0) {
            day = 0;
            this.day = day;
        }
        this.day = day;

        if (year < 0) {
            year = 0;
            this.year = year;
        }
        this.year = year;
}
    public void setMonth(int month) {
        if (month < 0) {
            month = 0;
            this.month = month;
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 0) {
            day = 0;
            this.day = day;
        }
        this.day = day;
    }

    public void setYear(int year){
        if (year < 0){
            year = 0;
            this.year = year;
        }
        this.year = year;
    }

    public int getMonth () {
        return month;
    }

    public int getDay (){
        return day;
    }

    public int getYear (){
        return year;
    }
}
