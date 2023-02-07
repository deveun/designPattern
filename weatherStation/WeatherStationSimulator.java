package weatherStation;

import java.util.random.RandomGenerator;
import weatherStation.observer.DisplayCurrentConditions;
import weatherStation.observer.DisplayForecast;
import weatherStation.observer.DisplayStatistics;
import weatherStation.subject.WeatherData;

public class WeatherStationSimulator {

    public static void initDisplay(WeatherData wd) {
        // 각각의 Display를 생성
        // 생성자에서 WeatherData(subject)에 해당 Display를 observer로 등록
        // -> wd.registerObserver(this)
        DisplayStatistics displayStatistics = new DisplayStatistics(wd);
        DisplayCurrentConditions displayCurrentConditions = new DisplayCurrentConditions(wd);
        DisplayForecast displayForecast = new DisplayForecast(wd);
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        initDisplay(weatherData);

        // 새로운 Display 추가되면 람다를 통해서도 구현할 수 있다.
        weatherData.registerObserver((temperature, humidity, pressure) -> {
            // Observer의 update 내부에서 수행할 logic을 정의

            System.out.println("New Display -- temperature: " + temperature
                + ", humidity: " + humidity
                + ", pressure: " + pressure);
        });

        // WeatherStation 기상정보 측정 update
        RandomGenerator gen = RandomGenerator.getDefault();
        int temperature = gen.nextInt(100);
        int humidity = gen.nextInt(100);
        int pressure = gen.nextInt(100);

        weatherData.measurementsChanged(temperature, humidity, pressure); // 내부에서 observers에게 notify
    }
}
