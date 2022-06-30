import java.util.Scanner;

public class MainTool {

    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Press 1 to deposit or 2 to report a purchase.");
        Node[] linkArr = new Node[25];
        DataStruct dataStruct = new DataStruct();
        dataStruct.linked(linkArr);
    }


}
