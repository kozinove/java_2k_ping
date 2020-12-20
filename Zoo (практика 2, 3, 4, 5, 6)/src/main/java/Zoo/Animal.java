/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Dragonsnom
 */
public class Animal implements Zoo_Interface{
    
    public String Name = "Name";
    public String Type = "Type";
    public String Class = "Class";
    public String Voice = "Voice";
    
    
    void Rabbit()
    {
        try {
            setName("Rabbit");
            setType("Herbivore");
            setVoice("mmm");
            setClassAnimal("mammals");

        } catch (Exception e) {
        }
    }

   void Elephant()
    {
        try {
            setName("Elephant");
            setType("Herbivore");
            setVoice("tuuu");
            setClassAnimal("mammals");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


void Tiger()
    {
        try {
            setName("Tiger");
            setType("Predator");
            setVoice("rrrr");
            setClassAnimal("mammals");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    @Override
    public String getName() {return Name;}   
    
    @Override
    public String getType() {return Type;}  
    
    @Override
    public String getClassAnimal() {return Class;}  
    
    @Override
    public String getVoice() {return Voice;} 
    
    @Override
    public void setName(String Name)throws Exception {
        if (this.Name == null)
            throw new java.lang.Exception("Error: Name is null");
        this.Name = Name;
    }
    @Override
    public void setType(String Type)throws Exception{
        if(this.Type == null)
            throw new java.lang.Exception("Error: Type is null");
        this.Type = Type;
    }

    @Override
    public void setVoice(String Voice)throws Exception {
        if (this.Voice == null)
            throw new java.lang.Exception("Error: Voice is null");
        this.Voice = Voice;
    }

    @Override
    public void setClassAnimal(String ClassAnimal) throws Exception {
          if (this.Class == null)
            throw new java.lang.Exception("Error: Class is null");
        this.Class = ClassAnimal;
    }


    
}
