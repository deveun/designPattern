package weatherStation.observer;

import weatherStation.subject.WeatherData;

public class DisplayStatistics implements DisplayElement, Observer{

    private int temperature;
    private int humidity;
    private int pressure;

    public DisplayStatistics(WeatherData wd) { // Display생성시에 subject의 object로 등록
        wd.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics -- temperature: " + temperature
            + ", humidity: " + humidity
            + ", pressure: " + pressure);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        // statistics를 위한 데이터 가공 로직
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
