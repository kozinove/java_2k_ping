public class Cage
{
    public animal jivotnoe;
    public Cage() { }
    public Cage(animal tvar)
    {
        jivotnoe = tvar;
    }
    public animal WhoHere()
    {
        return jivotnoe;
    }
    public void PutAnimal(animal tvar) throws Exception
    {
        if (jivotnoe != null)
        {
            throw new Exception("STACKOWERFLOW");
        }
        jivotnoe = tvar;
        return;
    }
}
