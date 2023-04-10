package duckAdapter;

import duckAdapter.duck.Duck;
import duckAdapter.duck.MallardDuck;
import duckAdapter.turkey.Turkey;
import duckAdapter.turkey.WildTurkey;
import java.util.ArrayList;
import java.util.List;

public class duckSimulator {

    public static void main(String[] args) {
        List<Duck> duckList = new ArrayList<>();

        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        duckList.add(duck);
        duckList.add(new TurkeyAdapter(turkey)); // Turkey -(adapter)-> duck

        for(Duck d : duckList) {
            testDuck(d);
            System.out.println();
        }
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
