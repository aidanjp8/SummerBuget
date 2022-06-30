import javax.swing.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class DataStruct {


    CusObj current = new CusObj();
    day day = new day();

    //data struc
    Node[] linkArr;

    //puts a linked list in each index
    public void linked(Node[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = new Node(null,null,null);
        }
    }

    //expands the array by doubling size
    public void expandArray(Node[] array) {
        Node[] newArray = new Node[array.length*2];
        linked(newArray);
        System.arraycopy(array, 0, newArray, 0, array.length);
    }


    public String spend(double amount, Node[] array) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        day.total = day.total - amount;

        return "subtracted " + amount + " to total on " + dtf.format(now);
    }

    public String recive(double amount, Node[] array) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        for (Node node : array) {
            if (node.getHead().equals(dtf.format(now))) {
                break;
            }
        }
        day.total = day.total + amount;

        return "added " + amount + " to total on " + dtf.format(now);
    }

//    public double averageEntertain(int days) {
//        int count = 0;
//        for (int i = 0; i < history.size(); i++) {
//            if (history.contains(current.mark)) {
//                if (current.amount > 0.0) {
//                    count++;
//                }
//            }
//        }
//
//        //HOW DO I GET INDEX OF A ARRAYLIST
//        return 2;
//    }
    public double averageHousing(int days) {return 2;}
    public double averageFood(int days) {return 2;}
    public boolean checkAves(){return false;}




}


// inheriting JFrame
class test2 extends JFrame
{
    JFrame frame;
    test2()
    {
        setTitle("Budget");

        // create button
        JButton deposit = new JButton("deposit");
        JButton withdraw = new JButton("withdraw");

        deposit.setBounds(50, 15, 115, 55);
        withdraw.setBounds(165, 15, 115, 55);

        // adding button on frame
        add(deposit);
        add(withdraw);
        // setting close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new test2();
    }
}
