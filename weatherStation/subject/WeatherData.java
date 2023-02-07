package weatherStation.subject;

import java.util.ArrayList;
import java.util.List;
import weatherStation.observer.Observer;

public class WeatherData implements Subject {

    private int temperature;
    private int humidity;
    private int pressure;
    private final List<Observer> observers;

    public void measurementsChanged(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        //AS-IS
        // 기상스테이션의 값을 새로 받을 때마다 호출됨
        // --> 디스플레이스를 업데이트하는 메소드를 호출함

        // display1.update()
        // display2.update()
        // display3.update()
        // .... 각 디스플레이를 업데이트 -> 각각 구현에 맞춰서 코딩한게 됨

        //TO-BE
        notifyObservers();
    }

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) { // observers를 순회하며 update 호출
            o.update(temperature, humidity, pressure);
        }
    }
}
