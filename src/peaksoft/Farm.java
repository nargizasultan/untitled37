package peaksoft;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private AbstractAnimal[] cows;
    private AbstractAnimal[] horses;
    private AbstractAnimal[] sheep;


    public Farm(String address, String ownerName, AbstractAnimal[] cows, AbstractAnimal[] horses, AbstractAnimal[] sheep) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
    }

    public Farm() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public AbstractAnimal[] getCows() {
        return cows;
    }

    public void setCows(AbstractAnimal[] cows) {
        this.cows = cows;
    }

    public AbstractAnimal[] getHorses() {
        return horses;
    }

    public void setHorses(AbstractAnimal[] horses) {
        this.horses = horses;
    }

    public AbstractAnimal[] getSheep() {
        return sheep;
    }

    public void setSheep(AbstractAnimal[] sheep) {
        this.sheep = sheep;
    }
    @Override
    public String toString() {
        return "Farm information: " +
                "\naddress: " + address +
                "\nownerName: " + ownerName + " \n" +
                "Sheep: " + sheep.length + "\n" +
                "Horses: " + horses.length + "\n" +
                "Cows: " + cows.length+"\n"+
                "Sheep: " + Arrays.toString(sheep) + "\n" +
                "Horses: " + Arrays.toString(horses) + "\n" +
                "Cows: " + Arrays.toString(cows);

    }



}