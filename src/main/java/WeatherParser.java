import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: paul.porter
 * Date: 6/25/13
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherParser
{

    public BufferedReader loadFile()
    {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("/Users/paul.porter/workspace/heroku/serene-fortress-5051/weather.dat"));
        } catch(FileNotFoundException e) {
            reader = null;
        }

        return reader;
    }

    public List<WeatherDay> getData() throws IOException
    {
        List<WeatherDay> days = new ArrayList<WeatherDay>();

        BufferedReader reader = loadFile();

        String currentLine;
        while ((currentLine = reader.readLine()) != null)
        {
            currentLine = currentLine.trim();
            if (currentLine.length() > 0 && Character.isDigit(currentLine.charAt(0)))
            {
                String[] parsedResults = currentLine.split(" ");
                WeatherDay currentDay = new WeatherDay();
                int column = 0;

                for(String token : parsedResults)
                {
                    if(token.length() > 0)
                    {

                        if (token.endsWith("*"))
                        {
                            token = token.substring(0, token.length() - 1);
                        }

                        switch (column) {
                            case 0:
                                currentDay.setDayNumber(Integer.valueOf(token));
                                break;
                            case 1:
                                currentDay.setMaxTemp(Integer.valueOf(token));
                                break;
                            case 2:
                                currentDay.setMinTemp(Integer.valueOf(token));
                                break;

                        }
                        column++;
                    }
                }
                days.add(currentDay);
            }
        }

        return days;

    }

}
