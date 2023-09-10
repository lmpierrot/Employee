class Employee {
    // Constructor to initaize an empployee with just a name
    public Employee(String name) {
        this.name = name;
    }
    // Private fields to store employee data
    private String name;
    private double baseSalary;
    private double bonus;
    
    // Contructor to initialize an with a name and base salary
    public Employee(String name, double salary) {
        this.name = name;
        this.baseSalary = salary;
        this.bonus = 0;
    }
    // Method to add a bonus to the employee's base salary 
    public void addBonus(double bonus) {
        this.bonus = bonus;
    }
    // Getter Methode to Retrieve the Employee's name  
    public String getName() {
        return name;
    }
    // Getter method to retrieve the employee's base salary 
    public double getBaseSalary() {
        return baseSalary;
    }
    // Getter method to retrieve the employee's net salary
    public double getNetSalary() {
        return baseSalary + bonus;
    }
    // Getter method to retrieve the employee's bonus
    public double getBonus() {
        return bonus;
    }

}