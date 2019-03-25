package NBA.Objects;

public class Game {
    int points;
    int makes;
    int misses;
    int threeMakes;
    int threeMisses;
    int freeMakes;
    int freeMisses;
    int steals;
    int blocks;
    int rebounds;
    int assists;
    int game;
    Team teamA;
    Game(int p,int ma, int mi, int threeM, int threeMisses, int freeMa, int freeMi, int st, int bl, int reb, int ass, int game, Team teamAgainst){
        this.points = p;
        this.makes = ma;
        misses = mi;
        threeMakes = threeM;
        this.threeMisses = threeMisses;
        freeMakes = freeMa;
        freeMisses = freeMi;
        steals = st;
        blocks = bl;
        rebounds = reb;
        assists = ass;
        this.game = game;
        teamA = teamAgainst;
    }
}
