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
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class FootballParser
{

    public List<TeamData> getData() throws IOException
    {
        List<TeamData> list = new ArrayList<TeamData>();

        BufferedReader reader = loadFile();

        String currentLine;
        while ((currentLine = reader.readLine()) != null)
        {
            currentLine = currentLine.trim();
            if (currentLine.length() > 0 && Character.isDigit(currentLine.charAt(0)))
            {
                String[] parsedResults = currentLine.split(" ");
                TeamData myTeam = new TeamData();
                int column = 0;

                for(String token : parsedResults)
                {
                    if(token.length() > 0)
                    {
                        switch (column) {
                            case 1:
                                myTeam.setName(token);
                                break;
                            case 6:
                                myTeam.setGoalsFor(Integer.valueOf(token));
                                break;
                            case 8:
                                myTeam.setGoalsAgainst(Integer.valueOf(token));
                                break;

                        }
                        column++;
                    }
                }
                list.add(myTeam);
            }
        }

         return list;
    }

    public BufferedReader loadFile(){

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("/Users/paul.porter/workspace/heroku/serene-fortress-5051/football.dat"));
        } catch(FileNotFoundException e) {
            reader = null;
        }

        return reader;
    }

    public TeamData getMinDiffTeamData() {
        TeamData returnValue = null;

        try
        {
            List<TeamData> list = this.getData();
            for(TeamData team : list) {

            }
        } catch (IOException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return returnValue;
    }

}
