class A
{
    void showA()
    {
        System.out.println("a class method");
    }
    public static void main(String[] arg)
    {
        A ob1 =new A();
        ob1.showA();

        B obj2 = new B();
        obj2.showB();
    }
}
class B extends A
{
    void showB()
    {
        System.out.println("b class method");
    }
    
}