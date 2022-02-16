package peaksoft;

public class Main {

    public static void main(String[] args) {


        AbstractAnimal cow1 = new Cow(33.3f,2,'F',"Milky");
        AbstractAnimal cow2 = new Cow(53.2f,6,'M',"Billy");
        AbstractAnimal cow3 = new Cow(87.6f,7,'F',"Anjella");
        AbstractAnimal cow4 = new Cow(32.1f,2,'M',"Worse");
        AbstractAnimal cow5 = new Cow(99.7f,8,'M',"Quick");

        AbstractAnimal sheep1 = new Sheep(4.2f,5,'F',"Heice");
        AbstractAnimal sheep2 = new Sheep(4.2f,3,'F',"Sammy");
        AbstractAnimal sheep3 = new Sheep(3.3f,2,'M',"Tyne B");

        AbstractAnimal horse1 = new Horse(77.9f,5,'M',"Smort","Brown");
        AbstractAnimal horse2 = new Horse(89.7f,5,'F',"Donny","White");

        //2

        AbstractAnimal sheep4 = new Sheep(44.4f,3,'M',"Iown");
        AbstractAnimal cow6 = new Cow(76.6f,5,'M',"Jack");
        AbstractAnimal horse3 = new Horse(98.7f,7,'F',"Jasmin","Black");



        AbstractAnimal[] abstractAnimals = {cow1,cow2,cow3,cow4,cow5,sheep1,sheep2,sheep3,horse1,horse2};
        AbstractAnimal[] abstractAnimals2 = {cow6,sheep4,horse3};

        Cow[] cows = new Cow[5];
        Sheep[] sheep = new Sheep[3];
        Horse[] horses = new Horse[2];

        Cow[] cows1 = new Cow[1];
        Sheep[] sheeps2 = new Sheep[1];
        Horse[] horses2 = new Horse[1];


        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;

        for(AbstractAnimal i : abstractAnimals) {
            if (i instanceof Cow) {
                cows[counter] = (Cow) i;
                counter++;
            }
            if(i instanceof Sheep){
                sheep[counter1] = (Sheep) i;
                counter1++;
            }
            if(i instanceof Horse){
                horses[counter2] = (Horse) i;
                counter2++;
            }
        }

        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        for(AbstractAnimal j : abstractAnimals2) {
            if (j instanceof Cow) {
                cows1[counter3] = (Cow) j;
                counter3++;
            }
            if(j instanceof Sheep){
                sheeps2[counter4] = (Sheep) j;
                counter4++;
            }
            if(j instanceof Horse){
                horses2[counter5] = (Horse) j;
                counter5++;
            }
        }

        Farm farm = new Farm("Naryn", "Dilbara", cows, horses, sheep);
        Farm farm2 = new Farm("Batken","Dinara",cows1,sheeps2,horses2);
        System.out.println(farm);
        System.out.println("--------------------------------------------------------");
        System.out.println(farm2);


    }


}