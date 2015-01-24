
class Machine
    {
    private String name;
    private int code;

    //what constructor are used for is to initialization of object setting it up
    public Machine()
        {
        this("Arnie", 0);
        System.out.println("Constructor Running!!");

        }

    public Machine(String name)
        {
        this(name, 0);
        System.out.println("Second Constructor Running !!");
        this.name = name;
        }

    public Machine(String name, int code)
        {
        System.out.println("Third Constructor Running !!!");
        this.name = name;
        this.code = code;
        }
    }

public class Application
    {
    public static void main(String[] args)
        {
        Machine machine1 = new Machine();
     //   Machine machine2 = new Machine("Bertie");
     //   Machine machine3 = new Machine("Chalky", 7);
        }
    }
