public class Zoo
{
    public Cage[] zoo;
    public Zoo(Cage a, Cage b, Cage c, Cage d)
    {
        zoo[0] = a;
        zoo[1] = b;
        zoo[2] = c;
        zoo[3] = d;
    }
    public void Obhod()
    {
        int empty = 0;
        for (int i=0; i<4; i++)
        {
            if (zoo[i].jivotnoe == null)
            {
                empty++;
            }
            else
            {
                zoo[i].jivotnoe.Say();
            }
        }
        System.out.print("/n");
        System.out.print(empty);
        System.out.print(" cages is empty");
    }
}
