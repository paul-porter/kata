

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: paul.porter
 * Date: 6/25/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class FootballParserTest
{

    @Test(groups = "unit")
    public void testLoadFile()
    {
        FootballParser parser = new FootballParser();
        assert parser.loadFile() != null;
    }

    @Test(groups = "unit")
    public void testFileHasDate()
    {
        Integer a;
        FootballParser parser = new FootballParser();

        try {
            a = parser.getData().size();
        }
        catch (IOException e){
            a = null;
        }

        assert a > 0;
    }

    @Test(groups = "unit")
    public void testFileHasFileData()
    {
        Integer a;
        FootballParser parser = new FootballParser();

        try {
            a = parser.getData().size();
        }
        catch (IOException e){
            a = null;
        }

        assert a == 20;
    }

    public void testMinValueOnFile(){
        FootballParser parser = new FootballParser();
        assert parser.getMinDiffTeamData() != null;
    }
}
