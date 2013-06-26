/**
 * Created with IntelliJ IDEA.
 * User: paul.porter
 * Date: 6/25/13
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class TeamData implements Comparable<TeamData>
{
    String name;
    Integer goalsFor;
    Integer goalsAgainst;
    Integer difference;

    public Integer getGoalsAgainst()
    {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst)
    {
        this.goalsAgainst = goalsAgainst;
    }


    public Integer getGoalsFor()
    {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor)
    {
        this.goalsFor = goalsFor;
    }

    public Integer getDifference()
    {
        return difference;
    }

    public void setDifference(Integer difference)
    {
        this.difference = difference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(TeamData teamData)
    {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
