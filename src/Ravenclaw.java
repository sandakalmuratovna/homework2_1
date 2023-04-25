public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creatively;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creatively) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creatively = creatively;
    }

    public int getSmart() {
        return this.smart;
    }

    public int getWise() {
        return this.wise;
    }

    public int getWitty() {
        return this.witty;
    }

    public int getCreatively() {
        return this.creatively;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreatively(int creatively) {
        this.creatively = creatively;
    }

    public String toString() {
        return this.getName() + " " + this.getSurname() + " Power of magic: " +
                this.getPower_of_magic() + " Transgression Distance: " + this.getTransgression_distance()
                + " Smart: " + this.smart + " Wise: " + this.wise + " Witty: " + this.witty + " Creatively: " + this.creatively;
    }

    public void compare(Ravenclaw student){
        int countOfThis = this.smart + this.witty + this.wise + this.creatively;
        int countOfStudent = student.smart + student.witty + student.wise + student.creatively;
        if(countOfStudent>countOfThis){
            System.out.println(student.getName()+" "+student.getSurname()+ " is better Slytherin than " + this.getName() + " " + this.getSurname());
        }else{
            System.out.println(this.getName()+" "+this.getSurname()+ " is better Slytherin than " + student.getName() + " " + student.getSurname());
        }
    }
}
