import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main extends Thread{
    public static void main(String[] args) {
        int columns = 0;
        int rows = 0;
        String character = null;
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Let's create a rectangle based on a certain character of your choice!");
        for(String only1Char = "N"; !(only1Char.equals("Y"));){
            System.out.println("Enter only 1 character: ");
            character = scanner.nextLine();
            if(character.length() == 1){
                only1Char = "Y";
            }
        }
        for(String sevenColumns = "N"; !(sevenColumns.equals("Y"));){
            System.out.println("Enter an amount of columns to the rectangle of characters (min: 14): ");
            columns = scanner.nextInt();
            if(columns >= 14){
                sevenColumns = "Y";
            }
        }
        for(String fourRows = "N"; !(fourRows.equals("Y"));){
            System.out.println("Enter an amount of rows to the rectangle of characters (min: 3): ");
            rows = scanner.nextInt();
            if (rows >= 3){
                fourRows = "Y";
            }
        }
        for(int i = 1; i <= rows;i++){
            for(int j = 1; j <= columns; j++){
                System.out.print(character);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i <= 2; i++){
            try{
                Thread.sleep(500);
                System.out.println("The rectangle was sucessfuly created!");
            }catch(InterruptedException e){
                System.out.println("The exception was caught " + e);
            }
        }
    }
}