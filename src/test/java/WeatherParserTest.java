

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: paul.porter
 * Date: 6/25/13
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherParserTest
{

    @Test(groups = "unit")
    public void testLoadFile()
    {
        WeatherParser weatherParser = new WeatherParser();
        assert weatherParser.loadFile() != null;
    }

    @Test(groups = "unit")
    public void testGetData() throws IOException
    {
        WeatherParser weatherParser = new WeatherParser();
        assert weatherParser.getData() != null;
    }

    @Test(groups = "unit")
    public void test() throws IOException
    {
        WeatherParser weatherParser = new WeatherParser();
        List<WeatherDay> weatherDays = new ArrayList<WeatherDay>();
        assert weatherParser.getData().size() == 30;
        for (WeatherDay day : weatherDays)
        {
            assert day.getMaxTemp() > day.getMinTemp();
        }
    }

}
