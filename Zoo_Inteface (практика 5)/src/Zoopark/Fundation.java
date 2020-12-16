package Zoopark;
import java.util.ArrayList;
import java.util.TreeSet;



public class Fundation {
     ArrayList<Interface_Zoo> arr = new ArrayList<>();
     
     public void addRoom(Interface_Zoo zoos){
        arr.add(zoos);
    }
     
    public void getAllRoom(String r) throws Exception
    {
        TreeSet<String> set = new TreeSet<>();
        String[] temp = {"", "", ""};
        int size = 0;
        
        for(Interface_Zoo z : arr)
        {
            if (size != arr.size())
            {
                temp[size] = z.getCell();
                size++;
            }
        }
        
         for (String temp1 : temp) {
             if (temp1.equals(r)) {
                 throw new java.lang.Exception("Клетка занята");
             }
         }
    }
     
    public String getAllAnimals(){
        String temp = "";
        int x = 0;
        
         temp = arr.stream().map(z -> z.getCell() + ": " + z.getName() + ", " + z.getType() + ", " + z.getClassAnimal() + ", " + z.getVoice() + "\n\n").reduce(temp, String::concat);
        
        return temp;
    }
    
}