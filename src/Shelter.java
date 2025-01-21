public class Shelter {
    private int defenseLevel;
    private int numberOfSupplies;

    public Shelter(int pdefenselevel, int pnumberofsupplies){
        defenseLevel = pdefenselevel;
        numberOfSupplies = pnumberofsupplies;
    }

    public void setDefenseLevel(int sdefenselevel){
        defenseLevel = sdefenselevel;
    }

    public void setNumberOfSupplies (int snumberofsupplies){
        numberOfSupplies = snumberofsupplies;
    }

    public int getDefenseLevel(){
        return defenseLevel;
    }

    public int getNumberOfSupplies(){
        return numberOfSupplies;
    }

    public void printInfo(){
        System.out.println("The defense level is "+defenseLevel+", and the number of supplies is "+numberOfSupplies+".");
    }

}
