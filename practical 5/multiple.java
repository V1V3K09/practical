interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

class duck implements Walkable , Swimmable {
    public void walk()
    {
    System.out.println("duck is walking");
    }
    public void swim()
    {
    System.out.println("duck is swimming");
    }
}

class Main{
    public static void main(String[] args)
    {
    duck Duck = new duck();
    Duck.walk();
    Duck.swim();
    }
}
