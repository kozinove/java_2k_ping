/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import static Zoo.Zoo_Builder.an;
import static Zoo.Zoo_Builder.cell;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dragonsnom
 */
public class Zoo_Metods {
    
    static void AddAnimal(String animal) {
         
        switch (animal) {
            case "Elephant" ->an.Elephant();
            case "Tiger" -> an.Tiger();
            case "Rabbit" -> an.Rabbit();
        }

     }
    
    static void PutAnimal(int x)
    {
        if (cell.size() > x || x < 1) {
            
            Zoo_Gui.jTextArea2.append("Нет таких клеток\n");
            
        }
        else{
        if(cell.get(x - 1).equals("Empty"))
        {
          try{
        cell.set(x - 1 ,"Name " +  an.getName() + ", " + "Type: " + an.getType() + ", " + "Class: " +an.getClassAnimal() + ", " + "Voice: " + an.getVoice());
        }catch (Exception e) {
            e.printStackTrace();
        }
        }
        
        else{
            Zoo_Gui.jTextArea2.append("Клетка занята\n");

        }
        }
    }

    static void AnimalRemove(int x)
    {
        
        if (cell.size() > x || x < 1) {
            
            Zoo_Gui.jTextArea2.append("Нет таких клеток\n");
            
        }
        else{
        if(cell.get(x - 1).equals("Empty"))
        {
                  Zoo_Gui.jTextArea2.append("Клетка и так пустая\n");
        }
        
        else{
            try{
        cell.set(x - 1, "Empty");
        }catch (Exception e) {
            e.printStackTrace();
        }

        }
        }
        
    }
    
    static void Table()
    {
        int Veg = 0;
        int Pred = 0;

        for (String s : cell) {
            if (s.contains("Predator"))
                Pred++;
            if (s.contains("Herbivore"))
                Veg++;
        }
        
        Zoo_Gui.jTextArea2.append("\n--------------------------\n" +
                "Predator||Herbivore\n" +
                "     " + Pred + "       ||    " + Veg +
                "\n--------------------------\n");
    }
    
    static void FileWriter() throws IOException {
        File file = new File("Zoo.txt");

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < cell.size(); i++) {
                
                writer.write("cage " + (i+1) + ": " + cell.get(i));
                writer.write("\n");
            }
            writer.flush();
        }
          Zoo_Gui.jTextArea2.append("Зоопарк записан");
    }

    static  void FileReader()
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
    

