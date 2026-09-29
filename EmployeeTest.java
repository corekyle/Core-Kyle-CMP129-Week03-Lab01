public class EmployeeTest 
{   // START OF EmpoyeeTest class

    public static void main(String[] args)
    {   // START OF main method

        // Create Employee objects
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // Display employees
        System.out.printf("%-20s %-9s %-15s %-15s\n" +
                          "--------------------------------------------------------------\n", "Name", "ID Number", "Department", "Position");
        System.out.printf("%-20s %-9d %-15s %-15s\n", employee1.getName(), employee1.getidNum(), employee1.getDepartment(), employee1.getPosition());
        System.out.printf("%-20s %-9d %-15s %-15s\n", employee2.getName(), employee2.getidNum(), employee2.getDepartment(), employee2.getPosition());
        System.out.printf("%-20s %-9d %-15s %-15s", employee3.getName(), employee3.getidNum(), employee3.getDepartment(), employee3.getPosition());

    }   // END OF main method
    
}   // END OF EmployeTest class
