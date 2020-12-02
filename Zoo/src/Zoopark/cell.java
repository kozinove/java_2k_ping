package Zoopark;

import java.util.*;

public class cell{

    int x = 1;

    Scanner scan = new Scanner(System.in);
    animal a = new animal();

    ArrayList<String> cells = new ArrayList<>();
    ArrayList<String> Type = new ArrayList<>();

    void initial_cells(){
        for (int i = 0; i < 4 + (Math.random() * 10); i++) {
            cells.add(a.Null());
            Type.add("Пусто");
            x++;
        }
    }


      void add_cell(){
        cells.add(a.Null());
        Type.add("Пусто");
        x++;
    }

   public void cells() {
        int x;
        do {
            System.out.println("Какую клетку хотите настроить?\n");
            for (int i = 1; i < this.x; i++)
                System.out.println("Клетку № " + i);
            System.out.println("0. Выйти в главное меню\n");
             x = scan.nextInt();
             if (x != 0){
                 System.out.println("Какое животное добавить в клетку?\n" +
                         "1. Жираф\n" +
                         "2. Лев\n" +
                         "3. Тигр\n" +
                         "4. Слон\n");
                 int an = scan.nextInt();
                 if(an == 1) {
                     if(Type.get(x).equals("Хищник"))
                         System.out.println("Хищник начал охоту\n");
                     else if(Type.get(x).equals("Травоядное"))
                         System.out.println("Травоядные встретились\n");
                     cells.add(x,a.Giraffe());
                     Type.add(x,"Травоядное");
                 }
                 if(an == 2) {
                     if(Type.get(x).equals("Хищник"))
                         System.out.println("Хищник начали драку\n");
                     else if(Type.get(x).equals("Травоядное"))
                         System.out.println("Хищник начал охоту\n");
                     Type.add(x,"Хищник");
                     cells.add(x,a.Lion());
                 }
                 if(an == 3) {
                     if(Type.get(x).equals("Хищник"))
                         System.out.println("Хищник начали драку\n");
                     else if(Type.get(x).equals("Травоядное"))
                         System.out.println("Хищник начал охоту\n");
                     Type.add(x,"Хищник");
                     cells.add(x,a.Tiger());
                 }
                 if(an == 4) {
                     if(Type.get(x).equals("Хищник"))
                         System.out.println("Хищник начал охоту\n");
                     else if(Type.get(x).equals("Травоядное"))
                         System.out.println("Травоядные встретились\n");

                     cells.add(x,a.Elephant());
                     Type.add(x,"Травоядное");
                 }

             }
        }while(x != 0);

    }


   public void walk() {
        Iterator<String> iter = cells.iterator();
        while (iter.hasNext()){

            System.out.println(iter.next());
        }
    }

    public void unic() {

            HashSet<String> intSet = new HashSet<>();
            intSet.add("африканский Слон");
            intSet.add("белый Тигр");

            System.out.println(intSet);
    }

}

