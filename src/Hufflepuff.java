public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int honesty;
    private int loyalty;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgressionDistance, int industriousness, int honesty, int loyalty) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getIndustriousness() {
        return this.industriousness;
    }

    public int getHonesty() {
        return this.honesty;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public String toString() {
        return this.getName() + " " + this.getSurname() + " Power of magic: " +
                this.getPower_of_magic() + " Transgression Distance: " + this.getTransgression_distance() +
                " Industriousness: " + this.industriousness + " Honesty: " + this.honesty + " Loyalty: " + this.loyalty;
    }

    public void compare(Hufflepuff student){
        int countOfThis = this.industriousness + this.honesty + this.loyalty;
        int countOfStudent = student.industriousness + student.honesty + student.loyalty;
        if(countOfStudent>countOfThis){
            System.out.println(student.getName()+" "+student.getSurname()+ " is better Slytherin than " + this.getName() + " " + this.getSurname());
        }else{
            System.out.println(this.getName()+" "+this.getSurname()+ " is better Slytherin than " + student.getName() + " " + student.getSurname());
        }
    }
}
