public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(1000);
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        f.simulateOneDay(22);
        System.out.println(f.getCurrentFood());
    }
}
