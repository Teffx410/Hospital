
package core;


public class ConsultantDoctor extends Doctor{
    private Team leaderOf;

    public ConsultantDoctor(Team leaderOf, int id, Team team) {
        super(id, team);
        this.leaderOf = leaderOf;
    }
    
}
