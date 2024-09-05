import java.util.*;
public class StrFreq {
    public static void main(String[] args) {
        char c;
        String var;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        var = sc.nextLine();

        System.out.println("Enter the character: ");
        c = sc.next().charAt(0);
        int len=var.length();
        int rep=0;
        for(int i=0; i<len; i++){
            if(c==var.charAt(i)){
                rep++;
            }

        }
        System.out.println("The frequency of the character is"+rep);
}
}
