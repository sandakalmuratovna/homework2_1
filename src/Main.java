public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry","Potter",35, 23, 7, 5, 4);
        Gryffindor hermioneGranger = new Gryffindor("Hermione","Granger",23, 45, 5,5,6);
        Gryffindor ronWeasley = new Gryffindor("Ron","Weasley",23, 42, 3, 6, 5);

        Slytherin dracoMalfoy = new Slytherin("Draco","Malfoy",34, 24, 6,7,4, 8, 9);
        Slytherin grahamMontagu = new Slytherin("Graham","Montagu",28, 36, 5, 6,2,8,4);
        Slytherin gregoryGoyle = new Slytherin("Gregory","Goyle",34,14, 8, 5,3,1,4);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias","Smith",18,22,4,12,3);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric","Diggory",12,35,4,5,2);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch","Fletchley",24,35,4,1,9);

        Ravenclaw zhouChang = new Ravenclaw("Zhou","Chang",21,32,2,4,5,3);
        Ravenclaw padraPatil = new Ravenclaw("Padra","Patil",23,43,3,7,5,8);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus","Belly",12,32,4,12,23,3);

        harryPotter.compare(padraPatil);
        hermioneGranger.compare(ronWeasley);
        zachariasSmith.compare(cedricDiggory);
        grahamMontagu.compare(dracoMalfoy);
    }
}