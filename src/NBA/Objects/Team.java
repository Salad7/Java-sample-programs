package NBA.Objects;

import java.util.ArrayList;

public class Team {


    String teamName;
    ArrayList<Player> players;
    ArrayList<String> teamsPlayed;
    int wins;
    int losses;
    String conference;

    public Team(String conference,int wins,int losses,String teamName){
        this.conference = conference;
        this.wins = wins;
        this.losses = losses;
        this.teamName = teamName;
        players = new ArrayList<>();
        teamsPlayed = new ArrayList<>();
    }



}
