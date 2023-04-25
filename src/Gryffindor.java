public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getBravery() {
        return this.bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String toString() {
        return this.getName() + " " + this.getSurname() + " Power of magic: " +
                this.getPower_of_magic() + " Transgression Distance: " + this.getTransgression_distance() + " Nobility: " +
                this.nobility + " Honor: " + this.honor + " Bravery: " + this.bravery;
    }

    public void compare(Gryffindor student){
        int countOfThis = this.nobility + this.honor + this.bravery;
        int countOfStudent = student.nobility + student.honor + student.bravery;
        if(countOfStudent>countOfThis){
            System.out.println(student.getName()+" "+student.getSurname()+ " is better Slytherin than " + this.getName() + " " + this.getSurname());
        }else{
            System.out.println(this.getName()+" "+this.getSurname()+ " is better Slytherin than " + student.getName() + " " + student.getSurname());
        }
    }
}
