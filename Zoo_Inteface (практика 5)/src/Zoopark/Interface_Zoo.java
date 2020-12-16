package Zoopark;

public interface Interface_Zoo {
    String getCell(); 
    
    String getName();
    String getType();
    String getClassAnimal(); 
    String getVoice();
   
    void setName(String _name) throws Exception;
    void setType(String _type) throws Exception;
    void setClassAnimal(String _classAnimal)throws Exception;
    void setVoice(String _voice)throws Exception;
}
