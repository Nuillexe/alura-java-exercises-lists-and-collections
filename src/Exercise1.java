//Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
import java.util.*;


public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        boolean stopInsertion=false;

        System.out.println("Enter number for the list(type stop to finish):");
        while(!stopInsertion){
            if(scanner.hasNextInt()){
                list.add(scanner.nextInt());
                scanner.nextLine();
            }else{
                if(isStop(scanner.nextLine())){
                    stopInsertion=true;
                }else{
                    System.out.println("Enter a number, please");
                }
            }
        }

        if(list.isEmpty()){
            System.out.println("The list is empty");
        }else{
            Collections.sort(list);//order in ascending order
            System.out.println("List in ascending order: "+list);
            Collections.sort(list, Collections.reverseOrder());//order in descending order
            System.out.println("List in descending order: "+list);
        }
    }
    static boolean isStop(String answer){
        return answer.equalsIgnoreCase("stop");
    }
}