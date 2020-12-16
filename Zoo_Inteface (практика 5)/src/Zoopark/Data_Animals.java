package Zoopark;

public abstract class Data_Animals implements Interface_Zoo {
    private String Name;
    private String Type;
    private String Class;
    private String Voice;

   
    @Override
    abstract public String getCell();
    
    
    @Override
    public String getName() {return Name;}   
    
    @Override
    public String getType() {return Type;}  
    
    @Override
    public String getClassAnimal() {return Class;}  
    
    @Override
    public String getVoice() {return Voice;} 
    
    @Override
    public void setName(String _name) throws Exception{
       if(Name != " ")
           throw new java.lang.Exception("Error");
       Name = _name;
    }
     
    @Override
    public void setType(String _type) throws Exception{
       if(Type != " ")
           throw new java.lang.Exception("Error");
       Type = _type;
    }
    
    @Override
     public void setClassAnimal(String _classAnimal) throws Exception{
        if(Class != " ")
            throw new java.lang.Exception("Error");
        Class = _classAnimal;
    }
     
    @Override
    public void setVoice(String _voice) throws Exception{
      if(Voice != " ")
          throw new java.lang.Exception("Error");
      Voice = _voice;
    }
     
    @Override
     public String toString() { 

        return getCell() + ". " + ". Animal: " + "Name - " + getName() + ", Type - " + getType() + ", Class - " + getClassAnimal() + ", Voice - " + getVoice(); 
    }
}
