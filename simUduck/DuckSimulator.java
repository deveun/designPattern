package simUduck;

import simUduck.model.Duck;
import simUduck.model.species.DecoyDuck;
import simUduck.model.species.MallardDuck;
import simUduck.model.species.RubberDuck;

public class DuckSimulator {

    public static void main(String[] args) {
        // Mallard Duck
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println();

        // Decoy Duck
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        System.out.println();

        // Rubber Duck
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
