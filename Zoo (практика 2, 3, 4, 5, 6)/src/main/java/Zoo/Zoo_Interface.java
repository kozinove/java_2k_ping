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
public interface Zoo_Interface {
    

    String getName();
    String getType();
    String getClassAnimal(); 
    String getVoice();
   
    void setName(String Name) throws Exception;
    void setType(String Type) throws Exception;
    void setClassAnimal(String ClassAnimal)throws Exception;
    void setVoice(String Voice)throws Exception;
    
}
