import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: paul.porter
 * Date: 6/25/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherService
{

    public WeatherDay findSmallestSpread(List<WeatherDay> days)
    {
        int smallestSpread = Integer.MAX_VALUE;
        WeatherDay smallestDay = null;

        for (WeatherDay day : days)
        {
            int spread = day.getMaxTemp() - day.getMinTemp();
            if (spread < smallestSpread)
            {
                smallestDay = day;
                smallestSpread = spread;
            }
        }

        return smallestDay;
    }

}
