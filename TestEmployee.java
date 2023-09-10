public class TestEmployee {
    // Method to Print employee information 
    public static void printEmployee(Employee e) {
        System.out.print("--------------");
        System.out.print(" Employee ");
        System.out.println("--------------");
        System.out.printf("%-25s: %s\n", "Employee Name", e.getName());
        System.out.printf("%-25s: %s\n", "Salary before bonus", e.getBaseSalary());
        System.out.printf("%-25s: %s\n", "Bonus amount", e.getBonus());
        System.out.printf("%-25s: %s\n", "Salary after bonus", e.getNetSalary());
        System.out.println();
    }

    public static void main(String[] args) {
        // Create two employee Object and Initialize them  
        Employee e1 = new Employee("John Brown", 45000);
        Employee e2 = new Employee("Mary Jane", 65000);
        // Add bonusses to the employee 
        e1.addBonus(1000);
        e2.addBonus(800);
        // Print a Header  
        System.out.println("ABC Payroll");
        // Print employee information using the printEmployee method
        printEmployee(e1);
        printEmployee(e2);
        // Print the Report End Marker  
        System.out.print("-------------");
        System.out.print(" Report End ");
        System.out.println("-------------");
        System.out.println("Press any Key to continue ..._");
    }

}
