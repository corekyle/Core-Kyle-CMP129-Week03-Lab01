import java.util.Scanner;

public class DateTest 
{   // START OF DateTest class
    
    public static void main(String[] args)
    {   // START OF main method

        // Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Create Date object
        Date date1 = new Date();


        // Declare variables
        int month;
        int day;
        int year;


        // Array of months with different number of days
        int[] month31 = {1, 3, 5, 7, 8, 10, 12};
        int[] month30 = {4, 6, 9, 11};


        // Get user input for month
        System.out.print("Enter month(1-12): ");
        month = keyboard.nextInt();
        // Input validation for month
        while(month < 1 || month > 12)
        {
            System.out.print("Invalid input. Enter month(1-12): ");
            month = keyboard.nextInt();
        }
        date1.setMonth(month);

        // Get user input for day
        System.out.print("Enter day: ");
        day = keyboard.nextInt();
        // Input validation for day
        // Months with 31 days
        for(int num : month31)
        {   // START OF for
            if(num == month)
            {   // START OF if
                while(day < 1 || day > 31)
                {   // START OF while
                    System.out.print("Invalid input for " + date1.getMonthName() +  ". Enter day: ");
                    day = keyboard.nextInt();
                }   // END OF while
            }   // END OF if
        }   // END OF for
        // Months with 30 days
        for(int num : month30)
        {   // START OF for
            if(num == month)
            {   // START OF if
                while(day <1 || day > 30)
                {   // START OF while
                    System.out.print("Invalid input for " + date1.getMonthName() + ". Enter day: ");
                    day = keyboard.nextInt();
                }   // END OF while
            }   // END OF if
        }   // END OF for
        // February
        if(month == 2)
        {   // START OF if
            while(day <1 || day > 29)
            {
                System.out.print("Invalid input for February. Enter day: ");
                day = keyboard.nextInt();
            }
        }   // END OF if
        date1.setDay(day);

        // Get user input for year
        System.out.print("Enter year: ");
        year = keyboard.nextInt();
        // Input validation for February leap year
        while(year % 4 != 0 && day > 28)
        {
            System.out.print("Invalid input for February 29th. Enter a leap year: ");
            year = keyboard.nextInt();
        }
        date1.setYear(year);



        // Display date
        System.out.println("");
        date1.displayDateMMDDYYYY();
        System.out.println("");
        date1.displayDateMonthDDYYYY();
        System.out.println("");
        date1.displayDateDDMonthYYYY();
        System.out.println("");
    }   // END OF main method

}   // END OF DateTest class
