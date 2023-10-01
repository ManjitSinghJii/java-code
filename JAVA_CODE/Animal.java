class Animal
{
    public void run()
    {
        System.out.println("i am runing");
    }
    public static void main(String[] arg)
    {
        System.out.println("main class");
        Animal dog=new Animal();
        dog.run();
        dog.eat();

        Animal cat =new Animal();
        cat.run();
        cat.eat();

        Bird sp =new Bird();
        sp.fly();

    }
    public void eat()
    {
        System.out.println("i am eating");
    }
}
class Bird
{
    public void fly()
    {
        System.out.println("i am flying");
    }
    
}