public class Hogwarts {
    private int powerOfMagic;
    private int  transgressionDistance;
    private String name;
    private String surname;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance){
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        this.name = name;
        this.surname = surname;
    }

    public String getName(){return this.name;}
    public String getSurname(){return this.surname;}
    public int getPower_of_magic() {
        return this.powerOfMagic;
    }

    public int getTransgression_distance(){
        return this.transgressionDistance;
    }

    public void setPower_of_magic(int powerOfMagic){
    this.powerOfMagic = powerOfMagic;
    }

    public void setTransgression_distance(int transgressionDistance){
        this.transgressionDistance = transgressionDistance;
    }

    public void compare(Hogwarts student){
        int countOfThis = this.powerOfMagic + this.transgressionDistance;
        int countOfStudent = student.powerOfMagic + student.transgressionDistance;
        if(countOfStudent>countOfThis){
            System.out.println(student.getName()+" "+student.getSurname()+ " is better Hogwarts student than " + this.getName() + " " + this.getSurname());
        }else{
            System.out.println(this.getName()+" "+this.getSurname()+ " is better Hogwarts student than " + student.getName() + " " + student.getSurname());
        }
    }

}
