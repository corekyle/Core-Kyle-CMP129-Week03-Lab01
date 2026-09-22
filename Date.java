public class Date 
{   // START OF Date class

    
    // Declare fields
    private int month;
    private int day;
    private int year;

    private String monthName;
    
    // Date setter methods
    public void setMonth(int m)
    {   // START OF setMonth method
        month = m;
    }   // END OF setMonth method

    public void setDay(int d)
    {   // START OF setDay method
        day = d;
    }   // END OF setDay method

    public void setYear(int y)
    {   // START OF setYear method
        year = y;
    }   // END OF setYear method


    // Date getter methods
    public int getMonth()
    {   // START OF getMonth method
        return month;
    }   // END OF getMonth method

    public int getDay()
    {   // START OF getDay method
        return day;
    }   // END OF getDay method

    public int getYear()
    {   // START OF getYear method
        return year;
    }   // END OF getYear method


    // Methods to display the date in different formats
    public void displayDateMMDDYYYY()
    {   // START OF displayDateMMDDYYYY method
        System.out.printf("%d/%d/%d", month, day, year);
    }   // END OF displayDateMMDDYYYY method

    public void displayDateMonthDDYYYY()
    {   //START OF displayDateMonthDDYYYY method

        // Display date
        System.out.printf("%s %d, %d", monthName, day, year);

    }   // END OF displayDateMonthDDYYYY method

    public void displayDateDDMonthYYYY()
    {   //START OF displayDateDDMonthYYYY method


        // Display date
        System.out.printf("%d %s %d", day, monthName, year);

    }   // END OF displayDateDDMonthYYYY method



}   // END OF Date class
