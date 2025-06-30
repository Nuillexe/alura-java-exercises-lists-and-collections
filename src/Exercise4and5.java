import java.util.*;

public class Exercise4and5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Titulo> arrayList= new ArrayList<>();
        List<Titulo> linkedList= new LinkedList<>();
        String name;
        boolean stopInsertion=false;
        System.out.println("Enter names for the list(type stop to finish):");
        while(!stopInsertion) {
            name = scanner.nextLine();
            if (isStop(name)) {
                stopInsertion = true;
            }else {
                arrayList.add(new Titulo(name));
                linkedList.add(new Titulo(name));
            }
        }
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        /*Other way of order obejects at the list
        arrayList.sort(Comparator.comparing(Titulo::getName));
        linkedList.sort(Comparator.comparing(Titulo::getName));
        */
        System.out.println("ArrayList: "+arrayList);
        System.out.println("LinkedList: "+linkedList);

    }

    static boolean isStop(String answer){
        return answer.equalsIgnoreCase("stop");
    }
}
