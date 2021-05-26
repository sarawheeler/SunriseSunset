import java.time.LocalDate;

public class SunriseSunset
{
    public static void main(String[] args) throws Exception
    {
        UserInterface  ui = new UserInterface();
        InformationFetcherRequestAndResponse reqRep = new InformationFetcherRequestAndResponse();

        while (true)
        {
            String cityState = ui.inputCityState();
            reqRep.setCityState(cityState);

            int clockFormat = ui.inputClockFormat();
            reqRep.setClockFormat(clockFormat);

            String date = ui.inputDate();
            reqRep.setDate();

            reqRep.setTimeOfDay();

            reqRep.setMoonInfo();

            reqRep.setCelestialEvent();
        }
    }
}
