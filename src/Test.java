package src;


public class Test {
    public static void main(String[] args) {

        //create nominee
        Nominee nominee = new Nominee("Sihab", 203,90);

        //create a committee member
        CommitteeMember commiteeMember = new CommitteeMember("Sourov",222);

        nominee.showDetails();
        commiteeMember.showDetails();
        commiteeMember.casteVote(nominee.id);
        commiteeMember.evaluateNominee("Good performance this season");

        System.out.println("Nominee Score (Read-only)"+nominee.getNomineeScore());

    }

   static abstract class Person{
        protected String name;
        protected int id;

        public Person(String name, int id){
            this.name = name;
            this.id = id;
        }

        abstract void showDetails();
    }

    static class Nominee extends Person{
        private final int nomineeScore;
        public Nominee(String name, int id, int nomineeScore){
            super(name,id);
            this.nomineeScore = nomineeScore;
        }

        @Override
        void showDetails(){
            System.out.println("Nominee Details");
            System.out.println("Nominee name: "+ name);
            System.out.println("Nominee id: "+ id);
        }

        public int getNomineeScore(){
            return nomineeScore;
        }
    }
    interface CommiteeActions{
        void casteVote(int nomineeId);
        void evaluateNominee(String feedback);
    }

    static class CommitteeMember extends Person implements CommiteeActions{
        private String feedback;

        public CommitteeMember(String name, int id){
            super(name, id);
        }
        @Override
        public void showDetails(){
            System.out.println("Comittee Member Details");
            System.out.println("Name: "+name);
            System.out.println("Id: "+id);
        }

        @Override
        public void casteVote(int nomineeId) {
            System.out.println("Nominee ID casted: "+nomineeId);
        }

        @Override
        public void evaluateNominee(String feedback){
            this.feedback = feedback;
            System.out.println("Feedback submitted for internal records");

        }
    }
}