public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public void setYear(int year) {
        if (year < 0) {
            year = 0;
            this.year = year;
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getAge(){
        return 2023 - year;
    }

    public int getMaximumHeartRate(){
        return 220 - (getAge());
    }

    public int getTargetHeartRate(){
        return 80 % getMaximumHeartRate();
    }
}
