package regionals;
import java.util.*;

public class DiagonalDifference{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = Integer.parseInt(scanner.next());
        System.out.println("Enter the elements of the square matrix: ");
        ArrayList list = new ArrayList<String>();
        for(int i = 0; i < size; i++){
            list.add(scanner.nextLine());
        }

//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.indexOf(i));
//        }
    }
}
