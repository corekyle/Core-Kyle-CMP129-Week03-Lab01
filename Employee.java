public class Employee 
{   // START OF Employee class
    
    // Declare fields
    String name;
    int idNumber;
    String department;
    String position;

    // Contructors
    public Employee(String n, int id, String dep, String pos)
    {
        name = n;
        idNumber = id;
        department = dep;
        position = pos;
    }

    public Employee(String n, int id)
    {
        name = n;
        idNumber = id;
        department = "";
        position = "";
    }

    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }


    //Mutator functions for Employee class
    public void setName(String n)
    {   // START OF setName method
        name = n;
    }   // END OF setName method

    public void setID(int id)
    {   // START OF setID method
        idNumber = id;
    }   // END OF setID method

    public void setDepartment(String dep)
    {   // START OF setDepartment method
        department = dep;
    }   // END OF setDepartment method

    public void setPosition(String pos)
    {   // START OF setPosition method
        position = pos;
    }   // END OF setPosition method


    // Accessor functions for Employee class

}   // END OF Employee class
