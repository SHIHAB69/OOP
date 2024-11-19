package src.introduction;

public class WadiyaRoyalSystem {
    public static void main(String[] args) {
        SupremeLeader leader = new SupremeLeader("Aladin","The supreme");
        RoyalServent servent = new RoyalServent("Fadil", "Chief Bodyguard", " Loyalty to the death");

        leader.showIdentity();
        servent.showIdentity();

        leader.issueDecree();
        servent.serveLeader();

        System.out.println("Royal servents loyalty badge "+ servent.getLoyaltyBadge());
        leader.setSecretWeapon("Pointy Nuclear Missile");
    }

    static abstract class WadiaRoyal {
        protected String name;
        protected String rank;

        public WadiaRoyal(String name, String rank){
            this.rank = rank;
            this.name = name;
        }

        public abstract void showIdentity();
    }

    static class SupremeLeader extends WadiaRoyal{
        private String secretWeapon;

        public SupremeLeader(String name, String rank){
            super(name,rank);
        }

        @Override
        public void showIdentity(){
            System.out.println("Supreme leader " + name + " also known as " + rank);
        }
        public void issueDecree(){
            System.out.println(name+" has issued a supreme decree");
        }

        public void setSecretWeapon(String weapon){
            this.secretWeapon = weapon;
        }
    }

    interface RoyalDuties{
        void serveLeader();
    }

    static class RoyalServent extends WadiaRoyal implements RoyalDuties{
        private final String loyaltyBadge;

        public RoyalServent(String name, String rank, String loyaltyBadge){
            super(name,rank);
            this.loyaltyBadge = loyaltyBadge;
        }
        @Override
        public void showIdentity(){
            System.out.println("Royal servant "+name+" title "+rank);
        }
        @Override
        public void serveLeader(){
            System.out.println(name+" is serving the supreme leader");
        }

        public String getLoyaltyBadge(){
            return loyaltyBadge;
        }

    }
}
