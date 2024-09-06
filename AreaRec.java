import java.util.Scanner;

class Area {
    private float length;
    private float breadth;

    // Corrected method name to follow camelCase convention
    public void setDimension(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float getArea() {
        // No need to declare a new variable, return the result directly
        return length * breadth;
    }
}

public class AreaRec {
    public static void main(String[] args) {
        Area rect = new Area();
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE DIMENSIONS \n");
        System.out.print("Enter the Length: ");
        float length = sc.nextFloat();
       
        System.out.print("Enter the Breadth: ");
        float breadth = sc.nextFloat();

        rect.setDimension(length, breadth);

        float area = rect.getArea();
        System.out.println("Area of the Rectangle: " + area);
        sc.close();
    }
}

