/**
 * Created with IntelliJ IDEA.
 * User: paul.porter
 * Date: 6/25/13
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherDay
{

    private int dayNumber;
    private int minTemp;
    private int maxTemp;

    public int getDayNumber()
    {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber)
    {
        this.dayNumber = dayNumber;
    }

    public int getMinTemp()
    {
        return minTemp;
    }

    public void setMinTemp(int minTemp)
    {
        this.minTemp = minTemp;
    }

    public int getMaxTemp()
    {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp)
    {
        this.maxTemp = maxTemp;
    }
}
