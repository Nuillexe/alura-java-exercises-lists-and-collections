import java.util.ArrayList;
import java.util.Scanner;


public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Forms> formsList= new ArrayList<>();
        formsList.add(new Square(10));
        formsList.add(new Square(7));
        formsList.add(new Circle(4));
        formsList.add(new Circle(3));

        int totalArea=0;
        for(Forms item: formsList){
            totalArea+=item.areaCalculate();
        }
        System.out.println("The total of areas is: "+ totalArea);
    }
}

interface Forms{
    public double areaCalculate();
}

class Square implements Forms{
    private int side;
    public Square(int side){
        this.side=side;
    }
    @Override
    public double areaCalculate(){
        return Math.pow(side,2);
    }
}

class Circle implements  Forms{
    private int raio;

    public Circle(int raio) {
        this.raio = raio;
    }
    @Override
    public double areaCalculate(){
        return 3.14* Math.pow(raio,2);
    }
}
