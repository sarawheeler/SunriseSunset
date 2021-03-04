import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface
{
    private Scanner input;

    public UserInterface ()
    {
        input = new Scanner(System.in);
    }

    public String inputCityState ()
    {
        System.out.println("Enter City, State: ");
        System.out.println();
        String cityState = input.nextLine();
        return cityState;
    }

    public int inputClockFormat ()
    {
        System.out.println("Enter 12 for 12-hour clock format or enter 24 for 24-hour clock format: ");
        System.out.println();
        int twelve = 12;
        int twentyFour = 24;
        int clockFormat = input.nextInt();
        return clockFormat;
    }

    public LocalDate inputDate()
    {
        System.out.println("Enter date: ");
        System.out.println();
        //LocalDate date = input.??();
        //return date;
    }

    public char selectTimeOfDay ()
    {
        System.out.println("Enter Y to see information for time of day: ");
        System.out.println("Example: dawn–twilight–sunrise, morning, daytime, evening, sunset–twilight–dusk, night.");
        System.out.println();
        //make entry non case sensitive
        //set Y = true with boolean
        //repeat with other info questions
    }

    public char selectTimeOfDay ()
    {
        System.out.println("Enter Y to see information for time of day: ");
        System.out.println("Example: dawn–twilight–sunrise, morning, daytime, evening, sunset–twilight–dusk, night.");
        System.out.println();
        //make entry case insensitive
        //set Y = true with boolean
    }

    public char selectMoonInfo ()
    {
        System.out.println("Enter Y to see information for the moon: ");
        System.out.println("Example: moonrise, moonset,  moon phase.");
        System.out.println();
        //make entry case insensitive
        //set Y = true with boolean
    }

    public char selectCelestialEvent ()
    {
        System.out.println("Enter Y to see information for celestial events: ");
        System.out.println("Example: eclipses, planetary events, meteor showers, astronomy events, spacecraft events.");
        System.out.println();
        //make entry case insensitive
        //set Y = true with boolean
    }

    public void displayErrorMessage(String msg)
    {
        System.out.println("An error occurred. Please try again");
        System.out.println(msg);
    }

    public void displaySelectedInfo()
    {

    }
}
