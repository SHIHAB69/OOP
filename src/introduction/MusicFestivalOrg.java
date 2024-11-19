package src.introduction;

import java.util.SplittableRandom;

public class MusicFestivalOrg {
    public static void main(String[] args) {
        Artist artist = new Artist("Amy","Singer","Pop",7.7);
        artist.showDetails();
        artist.getRatings();

        EventManager manager = new EventManager("Mark","Coordinator", 5);
        manager.scheduleEvent("Jazz Night");
        manager.handleComplaints("None");
        manager.feedbackReport("Event was successfull");
    }
    static abstract class FestivalMember{
        protected String name;
        protected String role;
        public FestivalMember(String name, String role){
            this.name = name;
            this.role= role;
        }
        abstract public void showDetails();
    }

    static class Artist extends FestivalMember{
        private String genre;
        private double ratings;
        public Artist(String name, String role,String genre,double ratings){
            super(name,role);
            this.genre = genre;
            this.ratings= ratings;
        }
        @Override
        public void showDetails(){
            System.out.println("Artist: "+ name+", Role: "+role);
            System.out.println("Genre: "+genre);
        }

        public void getRatings(){
            System.out.println("Ratings: "+ratings+"/5");
        }

    }

    interface FestivalOperations{
        void scheduleEvent(String type);
        void handleComplaints(String numberOfComplains);
    }

    static class EventManager extends FestivalMember implements FestivalOperations{
        private int managedEvents;
        private String feedback;
        public EventManager(String name,String role,int managedEvents){
            super(name,role);
            this.managedEvents = managedEvents;
        }

        public void feedbackReport(String feedback){
            this.feedback = feedback;
        }

        @Override
        public void showDetails(){
            System.out.println("Event manager: "+name+", Role"+role);
            System.out.println("Managed Events: "+managedEvents);
        }

        @Override
        public void scheduleEvent(String type){
            System.out.println("Event Scheduled: "+type);
        }
        @Override
        public void handleComplaints(String numberOfComplains){
            System.out.println("Complaits Handled"+numberOfComplains);
        }
    }
}
