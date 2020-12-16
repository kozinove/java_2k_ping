package Zoopark;

public  class animal implements Zoo_Metods{

    String Name;
    String Type;
    String Voice;


    void Rabbit()
    {
        try {
            setName("Rabbit");
            setType("Herbivore");
            setVoice("mmm");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   void Elephant()
    {
        try {
            setName("Elephant");
            setType("Herbivore");
            setVoice("tuuu");

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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public String getName() { return Name; }

    @Override
    public String getType() { return Type; }

    @Override
    public String getVoice() { return Voice; }

    @Override
    public void setName(String Name)throws Exception {
        if (this.Name != null)
            throw new java.lang.Exception("Error Name is null");
        this.Name = Name;
    }
    @Override
    public void setType(String Type)throws Exception{
        if(this.Type != null)
            throw new java.lang.Exception("Error Type is null");
        this.Type = Type;
    }

    @Override
    public void setVoice(String Voice)throws Exception {
        if (this.Voice != null)
            throw new java.lang.Exception("Error Voice is null");
        this.Voice = Voice;
    }

}


