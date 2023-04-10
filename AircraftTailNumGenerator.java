import javax.swing.JOptionPane;

public class AircraftTailNumGenerator {
    public static void main(String[] args){
        ObjectTailNumGen flight1 = new ObjectTailNumGen();
        JOptionPane display = new JOptionPane();
        flight1.random();
        display.showMessageDialog(null, "Here's the tail number to remember: "+flight1.getTailNumber());
        System.out.println(flight1.getTailNumber());
        String input = display.showInputDialog(null, "Enter the tailnumber", "ex: N12345");
        if(flight1.isSame(input)){
            display.showMessageDialog(null, "You got it correct!");
        }else{
            display.showMessageDialog(null, "You failed!");
        }
    }
}
