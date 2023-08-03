class Galaxy {
    protected String name;
    protected double mass; 
    protected double age; 

    public Galaxy(String name, double mass, double age) {
        this.name = name;
        this.mass = mass;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Mass: " + mass + " solar masses");
        System.out.println("Age: " + age + " billion years");
    }
}


class Earth extends Galaxy {
    private double radius; 
    private boolean hasLife;

    public Earth(String name, double mass, double age, double radius, boolean hasLife) {
        super(name, mass, age);
        this.radius = radius;
        this.hasLife = hasLife;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius + " km");
        System.out.println("Has Life: " + hasLife);
    }

    public void describeAtmosphere() {
        System.out.println("Earth has a diverse atmosphere supporting various life forms.");
    }
}


public class inheritance {
    public static void main(String[] args) {
        Earth e = new Earth("Earth", 12.4, 34, 23, true);
        e.displayInfo();
    }
}
