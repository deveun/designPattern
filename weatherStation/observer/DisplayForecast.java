package weatherStation.observer;

import weatherStation.subject.WeatherData;

public class DisplayForecast implements DisplayElement, Observer{

    private int temperature;

    public DisplayForecast(WeatherData wd) { // Display생성시에 subject의 object로 등록
        wd.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast -- temperature: " + temperature);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        // forecast를 위한 데이터 가공 로직
        this.temperature = temperature;

        display();
    }
}
