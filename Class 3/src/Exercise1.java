import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesList=new ArrayList<>();
        String name;
        System.out.println("Enter names to store in the list. Type 'stop' to finish");

        do{
            name = scanner.nextLine();
            if(!name.equalsIgnoreCase("stop"))
                namesList.add(name);
        }while (!name.equalsIgnoreCase("stop"));

        for(String item: namesList){
            System.out.println(item);
        }
        scanner.close();
    }
}
