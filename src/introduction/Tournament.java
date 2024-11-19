package src.introduction;

import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Players player = new Players("Jack",101,"SharpShooter",85);
        player.showDetails();
        player.getPlayerScore();
        Referee ref = new Referee("Alice",201,"Professional");
        ref.showDetails();
        ref.refereeNote("Good perfomance this year");
        ref.startmatch();
        ref.declareWinner(player);
    }

    static abstract class Person{
        protected String name;
        protected int id;
        public Person(String name, int id){
            this.name = name;
            this.id =id;
        }
        abstract void showDetails();
    }

    static class Players extends Person{
        private String gameTag;
        private int score;
        public Players(String name, int id, String gameTag, int score){
            super(name,id);
            this.gameTag = gameTag;
            this.score = score;
        }
        @Override
        public void showDetails(){
            System.out.println("Player: "+ name+", ID: "+id);
            System.out.println("Game Tag: "+gameTag);
        }
        public void getPlayerScore(){
            System.out.println("Player Score: "+score);
        }
    }
    interface TournamentAction{
        void startmatch();
        void declareWinner(Players name);
    }
    static class Referee extends Person implements TournamentAction{
            private String refereeLevel;
            private String note;
        public Referee(String name, int id,String refereeLevel){
            super(name,id);
            this.refereeLevel = refereeLevel;
        }
        void refereeNote(String note ){
            this.note = note;
        }
        @Override
        public void showDetails(){
            System.out.println("Referee: "+name+" ID: "+id);
            System.out.println("referee Level: "+refereeLevel);
        }

        @Override
       public void startmatch(){
            System.out.println("Match started");
        }
        @Override
        public void declareWinner(Players name){
            System.out.println("Winner is "+ name.name);
        }
    }
}
