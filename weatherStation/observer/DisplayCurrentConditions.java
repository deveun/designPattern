package weatherStation.observer;

import weatherStation.subject.WeatherData;

public class DisplayCurrentConditions implements DisplayElement, Observer{

    private int temperature;
    private int humidity;

    public DisplayCurrentConditions(WeatherData wd) { // Display생성시에 subject의 object로 등록
        wd.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition -- temperature: " + temperature
            + ", humidity: " + humidity);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        // currentConditions를 위한 데이터 가공 로직
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }
}
