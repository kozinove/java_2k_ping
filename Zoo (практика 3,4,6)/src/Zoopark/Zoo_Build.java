package Zoopark;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Zoo_Build {

    ArrayList<String> cell = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public void add_animal() {
        animal a = new animal();
        int v;
        show_cells();
        System.out.println("В какую клетку посадить животное ?");
        int ch = scan.nextInt() - 1;

        if(cell.get(ch).equals("Пусто"))
        {
            System.out.println("Добавить:\n" +
                    "1. Кролика\n" +
                    "2. Слона\n" +
                    "3. Тигра\n" );

            v = scan.nextInt();
            if(v == 1) {
                try {
                    a.Rabbit();
                    cell.set(ch, "Name:" +  a.getName() + ", " +"Type: " + a.getType() + ", " + "Voice: " + a.getVoice());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(v == 2) {
                try {
                    a.Elephant();
                    cell.set(ch, "Name:" +  a.getName() + ", " +"Type: " + a.getType() + ", " + "Voice: " + a.getVoice());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(v == 3) {
                try {
                    a.Tiger();
                    cell.set(ch, "Name:" +  a.getName() + ", " +"Type: " + a.getType() + ", " + "Voice: " + a.getVoice());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        else {
            System.out.println("Клетка занята");
        }
    }

    public void remove_animal() {
        show_cells();
        System.out.println("Из какой клетки убрать животное");
        int ch = scan.nextInt() - 1;

        if(cell.get(ch).equals("Пусто"))
            System.out.println("Клетка и так пустая");
        else
            try {
                cell.set(ch,"Пусто");

            } catch (Exception e) {
                e.printStackTrace();
            }

    }

    public void show_table() {

        int Veg = 0;
        int Pred = 0;

        for (String s : cell) {
            if (s.contains("Predator"))
                Pred++;
            if (s.contains("Herbivore"))
                Veg++;
        }

        System.out.println("\n-------------------\n" +
                "Predator||Herbivore\n" +
                "     " + Pred + "  ||  " + Veg +
                "\n-------------------\n");
    }

    public void cells_make() {
        cell.add("Пусто");

    }


    public void show_cells() {
        Iterator<String> iter = cell.iterator();
        int x = 1;
        while (iter.hasNext()) {

            System.out.println("Cage " + x + " " + iter.next());
            x++;

        }
    }
    public void FileWriter() throws IOException {
        File file = new File("Zoo.txt");

        FileWriter writer = new FileWriter(file);

        for (int i = 0; i < cell.size(); i++) {

            writer.write("cage " + (i+1) + ": " + cell.get(i));
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }

    public  void FileReader()
    {
        try {
            File file = new File("Data.txt");

            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {

                cell.add(line);

                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

