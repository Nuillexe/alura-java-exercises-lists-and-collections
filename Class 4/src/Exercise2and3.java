import java.util.*;

public class Exercise2and3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Titulo> list= new ArrayList<>();
        String name;
        boolean stopInsertion=false;
        System.out.println("Enter names for the list(type stop to finish):");
        while(!stopInsertion){
            name=scanner.nextLine();
            if(isStop(name))
                stopInsertion=true;
            else
                list.add(new Titulo(name));
        }

        //Collections.sort(list);
        list.sort(Comparator.comparing(Titulo::getName));
        System.out.println(list);
    }

    static boolean isStop(String answer){
        return answer.equalsIgnoreCase("stop");
    }
}

class Titulo implements Comparable<Titulo>{
    private String name;
    public String getName(){
        return name;
    }

    public Titulo(String name){
        this.name=name;
    }

    public String toString(){
        return this.name;
    }
    @Override
    public int compareTo(Titulo anotherTitulo){
        return this.name.compareTo(anotherTitulo.name);
    }
}
