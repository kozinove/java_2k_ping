public class Dog extends animal
{
    public Dog(String name)
    {
        family = "Dog";
        food = "Meet";
        this.name = name;
    }
    public void Say()
    {
        System.out.println("Гав-Гав");
        return;
    }
}
