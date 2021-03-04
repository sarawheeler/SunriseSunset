import java.time.LocalDate;

public class InformationFetcherRequestAndResponse
{
    private String cityState;
    private int clockFormat;
    private LocalDate date;
    private char timeOfDay;
    private char moonInfo;
    private char celestialEvent;

    //API connection constants
    private static final String URL = "https://api.sunrise-sunset.org/json";

    //ClockFormat constants
    public static int twelve = 12;
    public static int twentyFour = 24;

    //ExtraInfo Constants
    public static boolean getTimeOfDay = false;
    public static boolean getMoonInfo = false;
    public static boolean getCelestialEvent = false;

    public String validateCityState(String cityState)
    {
        return null;
    }

    public String setCityState(String cityState)
    {
        String valid = validateCityState(cityState);

        if(valid == null)
        {
            this.cityState = cityState;
        }
        return valid;
    }

    public void setClockFormat(int clockFormat)
    {
        this.clockFormat = clockFormat;
    }

    public String validateDate()
    {
       //not sure how to validate the date
    }

    public String validateTimeOfDay()
    {
        if (timeOfDay == 'Y' || getTimeOfDay == false)
        {
            return null;
        }
        else
        {
            return "Invalid character input. Input bust be Y.";
        }
    }

    public String setTimeOfDay()
    {
        String valid = validateTimeOfDay();

        if(valid == null)
        {
            this.timeOfDay = timeOfDay;
        }

        return valid;
    }

    public String validateMoonInfo()
    {
        if (moonInfo == 'Y' || getMoonInfo == false)
        {
            return null;
        }
        else
        {
            return "Invalid character input. Input bust be Y.";
        }
    }

    public String setMoonInfo()
    {
        String valid = validateMoonInfo();

        if(valid == null)
        {
            this.moonInfo = moonInfo;
        }

        return valid;
    }

    public String validateCelestialEvent()
    {
        if (timeOfDay == 'Y' || getCelestialEvent == false)
        {
            return null;
        }
        else
        {
            return "Invalid character input. Input bust be Y.";
        }
    }

    public String CelestialEvent()
    {
        String valid = validateCelestialEvent();

        if(valid == null)
        {
            this.celestialEvent = celestialEvent;
        }

        return valid;
    }

}
