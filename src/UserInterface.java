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

    public String inputDate()
    {
        System.out.println("Enter date in MM-dd-yyyy: ");
        System.out.println("Example: 04-23-2021");
        System.out.println();
        String date = input.nextLine();
        return date;
    }

    public boolean selectTimeOfDay()
    {
        System.out.println("Enter Y to see information for time of day: ");
        System.out.println("Example: dawn–twilight–sunrise, morning, daytime, evening, sunset–twilight–dusk, night.");
        System.out.println();
        String select = input.nextLine();
        boolean selectTimeOfDay = false;
        if (select.toLowerCase().equals("y"))
        {
            selectTimeOfDay = true;
        }
        return selectTimeOfDay;
    }

    public boolean selectMoonInfo()
    {
        System.out.println("Enter Y to see information for the moon: ");
        System.out.println("Example: moonrise, moonset,  moon phase.");
        System.out.println();
        String select = input.nextLine();
        boolean selectMoonInfo = false;
        if (select.toLowerCase().equals("y"))
        {
            selectMoonInfo = true;
        }
        return selectMoonInfo;
    }

    public boolean selectCelestialEvent()
    {
        System.out.println("Enter Y to see information for celestial events: ");
        System.out.println("Example: eclipses, planetary events, meteor showers, astronomy events, spacecraft events.");
        System.out.println();
        String select = input.nextLine();
        boolean selectCelestialEvent = false;
        if (select.toLowerCase().equals("y"))
        {
            selectCelestialEvent = true;
        }
        return selectCelestialEvent;
    }

    public void displayErrorMessage(String msg)
    {
        System.out.println("An error occurred. Please try again.");
        System.out.println(msg);
    }
}
