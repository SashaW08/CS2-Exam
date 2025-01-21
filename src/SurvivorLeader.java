public class SurvivorLeader {

    public static void main(String[] args) {
        SurvivorLeader survivorleader = new SurvivorLeader();
    }

    private String transmission = "q2xf1t8r5w3t tm9c5i8l900d5n7heto 3g5t6hgw44y5e7bhty605rh8t5 85ml95ak2k5r7qw5ksp295e5t7p45 o5i3n 6z5n205 9soe5o8hhg5lygtt5dq7th 5 gf34s9o 35j7j5o45k99hg5kyqqcjg5mkpl20z5o629sle5k20sk5k9c5 gh73h qxp25vi8t5i3f2v1q 9x7z6t5l8r9j3o4v5l3l1w 9y5a4d6f7x2c9l5g h8s45ek6";

    Shelter[] shelters = new Shelter[40];

    public SurvivorLeader(){
        System.out.println("Goodbye World! Good luck surviving the apocalypse!");

        for(int x=0; x<shelters.length; x++){
            shelters[x] = new Shelter((int)(Math.random()*100+1), (int)(Math.random()*1001));
        }

        displayShelters();
        System.out.println("It is "+checkSupplies()+" that two or more numbers of supplies are the same.");
        System.out.println("This is the decoded string: "+decipher(transmission));
        newDefense();
        displayShelters();

    }

    public void displayShelters(){
        for(int x=0; x<shelters.length; x++){
            shelters[x].printInfo();
        }
    }

    public boolean checkSupplies(){
        boolean sameyesorno = false;

        for(int x=0; x<shelters.length; x++){
            for(int i=x+1; i<shelters.length; i++){
                if(shelters[x].getNumberOfSupplies()==shelters[i].getNumberOfSupplies()){
                    sameyesorno = true;
                }
            }
        }

        return sameyesorno;
    }

    public String decipher(String ptransmission){
        String decodedstring = "";
        int fiveindex = ptransmission.indexOf("5");

        while(ptransmission.contains("5")){
            decodedstring = decodedstring + ptransmission.charAt(fiveindex+1);
            ptransmission = ptransmission.substring(fiveindex+1);
            fiveindex = ptransmission.indexOf("5");
        }


        return decodedstring;
    }

    public void newDefense(){

        shelters[0].setDefenseLevel((int)(Math.random()*100+1));

        for(int x=1; x<shelters.length; x++){

            shelters[x].setDefenseLevel((int)(Math.random()*100+1));

            for(int y=1; y<=x; y++) {

                if (shelters[x].getDefenseLevel() == shelters[x - y].getDefenseLevel()) {

                    shelters[x].setDefenseLevel((int) (Math.random() * 100 + 1));

                }
            }
        }
    }
}