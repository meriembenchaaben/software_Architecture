
public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(IQuacker... ducks)
    {
        for (IQuacker duck : ducks) {
            try{
                duck.quack();

            }catch(Exception e) {
                System.out.println(e.toString());
            } 
        }
    }

    private void swim(ISwimmer... ducks)
    {
        for (ISwimmer duck : ducks) {
            try{
                duck.swim();

            }catch(Exception e ) {
                System.out.println(e.toString());
            } 
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
