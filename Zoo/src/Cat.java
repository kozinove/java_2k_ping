public class Cat extends animal
{
    public Cat(String name)
    {
        family = "Cat";
        food = "All";
        this.name = name;
    }
    public void Say()
    {
        System.out.println("Мяу-Мяу");
        return;
    }
}
