import java.util.Scanner;

public class Imp {
    public static void main(String[] args) {
        Student details = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name & roll number: ");
        String name = sc.nextLine();
        String rollno = sc.nextLine();

        System.out.println("Enter the marks below \n");

        System.out.print("Mathematics: ");
        Float mathmark =sc.nextFloat();

        System.out.print("Physics: ");
        Float phymark =sc.nextFloat();

        System.out.print("Chemistry: ");
        Float chemmark =sc.nextFloat();

        details.getRequiredDetails(rollno, name, mathmark, phymark, chemmark);

        Float average = details.displayAverage();
        System.out.print("Average Score: " + average);
        }
    
}

class Student {
    String rollno;
    String name;
    float mathmark;
    float phymark;
    float chemmark;
    float avg;
  

    public void getRequiredDetails (String rollno, String name, float mathmark, float phymark, float chemmark) {
        this.rollno = rollno;
        this.chemmark = chemmark;
        this.name = name;
        this.phymark = phymark;
        this.mathmark = mathmark;

    }
    public float displayAverage (){
        avg= (mathmark + chemmark + phymark)/3;
        return avg;
    }
} 
