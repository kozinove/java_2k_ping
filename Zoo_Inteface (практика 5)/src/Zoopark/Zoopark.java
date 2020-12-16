package Zoopark;


public class Zoopark {

    public static Fundation zoo_f = new Fundation(); 
    
    public static String AddAnimal(String Name, String Type, String Cls, String Voice, String Room)
    {                
        String temp = "";
        try{
            zoo_f.getAllRoom(Room); //Проверка, занята ли клетка
            Interface_Zoo Zoopark = Create_Cell.build(Room); //Создание клетки
            //Установка значений
            Zoopark.setName(Name); 
            Zoopark.setType(Type);
            Zoopark.setClassAnimal(Cls);
            Zoopark.setVoice(Voice);
            //Добавление в zoo_f
            zoo_f.addRoom(Zoopark);
        }
        catch(Exception e){
            temp = "Error";
            System.out.print(e);
        }
        
        return temp;
    } 

    public static String AllAnimals()
    {        
        return zoo_f.getAllAnimals();
    }

}
