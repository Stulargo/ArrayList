Nowość! Skróty klawiszowe. … Skróty klawiszowe Dysku zostały zaktualizowane, aby umożliwić nawigację przy użyciu pierwszych liter
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tank> tanks= new ArrayList<>();

        ArrayList<Person> crew1 = new ArrayList<>();
        crew1.add(new Person("Janek"));
        crew1.add(new Person("Mikołaj"));
        crew1.add(new Person("Bartek"));

        ArrayList<Person> crew2 = new ArrayList<>();
        crew2.add(new Person("Dawid"));
        crew2.add(new Person("Krystian"));
        crew2.add(new Person("Krzysztof"));

        ArrayList<Person> crew3 = new ArrayList<>();
        crew3.add(new Person("Grzesiek"));
        crew3.add(new Person("Maksymilian"));
        crew3.add(new Person("Arek"));

        ArrayList<Person> crew4 = new ArrayList<>();
        crew4.add(new Person("Karol"));
        crew4.add(new Person("Igor"));
        crew4.add(new Person("Maciek"));

        Tank tank1 = new Tank(crew1);
        Tank tank2 = new Tank(crew2);
        Tank tank3 = new Tank(crew3);
        Tank tank4 = new Tank(crew4);

        tanks.add(tank1);
        tanks.add(tank2);
        tanks.add(tank3);
        tanks.add(tank4);


        for (Tank tank : tanks){

            System.out.println(tank.crew.getFirst().name + " " + tank.crew.get(1).name + " " + tank.crew.get(2).name);
        }

        System.out.println();

        for(int i = 0; i < tanks.size(); i++){
            System.out.println(tanks.get(i).crew.getFirst().name + " " + tanks.get(i).crew.get(1).name + " " + tanks.get(i).crew.get(2).name);
        }
    }
}
