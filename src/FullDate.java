/*A  program that asks a user for month , day, and year as a number  and then print out the date in full date format.
*/
import java.util.Scanner;
public class FullDate {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String month = "";
        System.out.println("Enter month (mm)");
        int mon = sc.nextInt();
        System.out.println("Enter DAY (DD)");
        int day = sc.nextInt();
        System.out.println("Enter year (yy)");
        int  year = sc.nextInt();

        //determine the name of the month
        switch (mon)
        {
            case 1:
                 month ="January";
                break;
            case 2:
                month = " February";
                break;
            case 3:
                month ="March";

                break;
            case 4:
                month= "April";
                break;
            case 5:
                month= "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
               month ="July";
                break;
            case 8:
                month =" August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
              month =" October";
                break;
            case 11:
                month=" November";
                break;
            case 12:
                month ="December";
                break;
            default:
                System.out.println ("Invalid number");
        }
       //print out the output
        System.out.printf("It is %s %s", month, year);




    }
}
