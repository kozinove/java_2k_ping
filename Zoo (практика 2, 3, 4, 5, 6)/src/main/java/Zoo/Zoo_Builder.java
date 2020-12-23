/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Dragonsnom
 */
public class Zoo_Builder  {
    
   static ArrayList<String> cell = new ArrayList<>();
    static Animal an = new Animal();
    
    
    static void AddCell()
    {
        cell.add("Empty");
        Zoo_Gui.jTextArea2.append("Клетка добавлена\n");
    }
    

    static String ShowAnimals() {
        
        int x = 1;
        StringBuilder tmp  = new StringBuilder();
 
        if (cell.isEmpty()) {
           tmp = new StringBuilder("Клеток нет");
        }
        else{
        Iterator<String> iter = cell.iterator();
        while (iter.hasNext()) {

            tmp.append("Cage ").append(x).append(": ").append(iter.next()).append("\n");
            x++;

        }
        }
        return tmp.toString();
    }


    

    
    
    
    
}
