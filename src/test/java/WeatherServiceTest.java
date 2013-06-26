
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: paul.porter
 * Date: 6/25/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherServiceTest
{

    @Test(groups = "unit")
    public void testFindSmallestSpread()
    {
        WeatherService service = new WeatherService();
        List<WeatherDay> days = new ArrayList<WeatherDay>();
        WeatherDay day = new WeatherDay();
        day.setDayNumber(2);
        day.setMaxTemp(100);
        day.setMinTemp(50);
        days.add(day);
        assert service.findSmallestSpread(days) != null;
    }

    @Test(groups = "unit")
    public void testFindSmallestSpreadOverMultipleDays()
    {
        WeatherService service = new WeatherService();
        List<WeatherDay> days = new ArrayList<WeatherDay>();
        WeatherDay day = new WeatherDay();
        day.setDayNumber(1);
        day.setMaxTemp(100);
        day.setMinTemp(50);
        days.add(day);

        WeatherDay day2 = new WeatherDay();
        day2.setDayNumber(2);
        day2.setMaxTemp(100);
        day2.setMinTemp(60);
        days.add(day2);

        WeatherDay day3 = new WeatherDay();
        day3.setDayNumber(3);
        day3.setMaxTemp(100);
        day3.setMinTemp(40);
        days.add(day3);

        assertEquals(service.findSmallestSpread(days).getDayNumber(),2);
    }
}
