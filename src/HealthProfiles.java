public class HealthProfiles {
    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private double height;
    private double weight;

    public HealthProfiles(String firstName, String lastName, String gender, int month, int day, int year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

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

        if (height < 0.0){
            height = 0.0;
            this.height = height;
        }

        if (weight < 0.0){
            weight = 0.0;
            this.weight = weight;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender(){
        return gender;
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

    public void setHeight(double height) {
        if (height < 0.0) {
            height = 0.0;
            this.height = height;
        }
        this.height = height;
    }

    public void setWeight(double weight) {
        if (weight < 0.0){
            weight = 0.0;
            this.weight = weight;
        }
        this.weight = weight;
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

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
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

    public double getBMI(){
        return (weight / (height * height));
    }
}
