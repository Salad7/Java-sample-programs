package NBA.Objects;

import java.util.ArrayList;

enum Position {
    One,Two,Three;
}



public class Player {



    String name;
    static Position pos;
    ArrayList<Game> games = new ArrayList<>();


    Player(String n, Position pos){
     this.pos = pos;
     this.name = n;
    }

    public void addGame(int p,int ma, int mi, int threeM, int threeMisses, int freeMa, int freeMi, int st, int bl, int reb, int ass, int game, Team team){
        Game gameIn = new Game(p,ma,mi,threeM,threeMisses,freeMa,freeMi,st,bl,reb,ass,game,team);
        games.add(gameIn);
    }

}
