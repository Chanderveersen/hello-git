class Animal
{
public int breed;
public int color;
public void speak()
{
System.out.println("languages");
}
}
class Dog extends Animal
{
public void speak()
{
System.out.println("bhau");
}
}
class Cat extends Animal
{
public void speak()
{
System.out.println("meow");
}
}
class assignment_5_2
{
public static void main(String args[])
{
Animal a=new Animal();
a.speak();
a=new Dog();
a.speak();
a=new Cat();
a.speak();
}
}