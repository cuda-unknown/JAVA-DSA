
class dim{
    int roll;
    String name;
    dim(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.roll);
    }
    void calcu(){
        if(roll==1) System.out.println("Fist Student ");
        else if (roll==2) System.out.println( "2nd Student ");
    }
}
public class Stude {

    String name;
    int roll;
    int marks;

    Stude(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name is : " + this.name);
        System.out.println("Roll No is : " + this.roll);
        System.out.println("Marks are :" + this.marks);
    }

    void calculateGrade() {
        if (this.marks <= 100 && this.marks > 90)
            System.out.println("A");
        else if (this.marks <= 90 && this.marks > 80)
            System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println();
        Stude s1 = new Stude("Nirmal", 1, 99);

        s1.display();
        s1.calculateGrade();


        dim d1=new dim("Sohi", 2);
        d1.display();
        d1.calcu();

    }
}
