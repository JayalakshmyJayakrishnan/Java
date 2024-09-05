import java.util.Scanner;

public class AreaRec {
    public static void main(String[] args) {
        Area rect = new Area();
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE DIMENSIONS \n");
        System.out.println("Enter the Length:");
        Float length =sc.nextFloat();
       
        System.out.print("Enter the Breadth: ");
        Float breadth =sc.nextFloat();


        rect.setdimension(length, breadth);

        Float area = rect.getArea();
        System.out.print("Area of the Rectangle: " + area);
        }
    
}

class Area {
    float length;
    float breadth;
  

    public void setdimension (float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea (){
        area = length*breadth;
        return area;
    }
} 
