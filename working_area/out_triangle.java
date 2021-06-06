package working_area;
import java.util.Scanner;

public class out_triangle {
    public static void main(String[] args){
        System.out.println("input your size");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            var size = scan.nextInt();
            for(int i=1;i<=size;i++){
                for(int j=1;j<=(2*size-1-(2*i-1))/2;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=(2*size-1-(2*i-1))/2;j++){
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
        scan.close();
    }
}
