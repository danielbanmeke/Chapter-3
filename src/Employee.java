public class Employee {
    private String firstName;
    private String lastName;
    private int monthlySalary;
    private double twelveMonths;


    public Employee(String firstName, String lastName, int salary, double annual) {

        this.firstName = firstName;
        this.lastName = lastName;

        if (salary < 0) {
            salary = 0;
            this.monthlySalary = salary;
        }
        this.monthlySalary = salary;

        if (annual < 0.0) {
            annual = 0.0;
                    this.twelveMonths = annual;
        }
        this.twelveMonths = annual;

    }

    public void setMonthlySalary(int salary) {
        if (salary < 0) {
            salary = 0;
            this.monthlySalary = salary;
        }
        this.monthlySalary = salary;
    }

        public String getFirstName (){
            return firstName;
        }

        public String getLastName (){
            return lastName;
        }

        public int getMonthlySalary () {
            return monthlySalary;
        }

        public double annual () {
            return twelveMonths;
        }

        public double getYearlySalary () {
            return (monthlySalary * twelveMonths);
        }
}