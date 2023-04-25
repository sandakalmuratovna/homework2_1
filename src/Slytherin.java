public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int persistence;
    private int lustForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int persistence, int lustForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.persistence = persistence;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getPersistence() {
        return this.persistence;
    }

    public int getLustForPower() {
        return this.lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setPersistence(int persistence) {
        this.persistence = persistence;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return this.getName() + " " + this.getSurname() + " Power of magic: " +
                this.getPower_of_magic() + " Transgression Distance: " + this.getTransgression_distance()
                + " Cunning: " + this.cunning + " Determinatioin: " + this.determination + " Ambition: " + this.ambition
                + " Persistence: " + this.persistence + " lust for power: " + this.lustForPower;
    }

    public void compare(Slytherin student){
        int countOfThis = this.cunning + this.determination + this.ambition + this.persistence + this.lustForPower;
        int countOfStudent = student.cunning + student.determination + student.ambition + student.persistence + student.lustForPower;
        if(countOfStudent>countOfThis){
            System.out.println(student.getName()+" "+student.getSurname()+ " is better Slytherin than " + this.getName() + " " + this.getSurname());
        }else{
            System.out.println(this.getName()+" "+this.getSurname()+ " is better Slytherin than " + student.getName() + " " + student.getSurname());
        }
    }
}
