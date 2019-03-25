package NBA;

import NBA.Objects.Team;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Team> teams;

    public static void main(String[] args){
        loadTeams();
    }

    public static void loadTeams(){
        teams = new ArrayList<>();
        teams.add(new Team("EAST",0,0,"Toronto Raptors"));
        
    }



}
