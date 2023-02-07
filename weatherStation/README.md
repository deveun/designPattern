# Weather Monitoring
: 기상 스테이션에서 수집한 정보를 monitoring하는 디스플레이 장비들에게 제공하는 프로젝트

> 기상정보를 수잡하는 기상 스테이션   
> <--> 기상 정보를 저장하는 WeatherData 객체   
> <--> 사용자에게 현재 기상 정보를 보여주는 디스플레이 장비
---

## Observer Pattern
### Observer
* subject(주제)가 있을 때 이에 대한 구독자
* subject(주제)의 변경이 일어나면 구독자에게 소식이 전달됨 `(one-to-many)`, `push 방식`
* observer이면서 동시에 subject가 되는 경우도 있음

### 동작
1. 특정 subject에 대해 observer가 되기 위해 `subscribe` -> observer 추가
2. subject에 update 발생시 -> observers에게 `notify`

### 참고사항
* java.util에 이미 Observer, Observable.. 과 같은 클래스가 있지만. 9부터 Deprecated되었음. 
* 더 깊은 사용을 위한 java.concurrent의 클래스를 사용한 구현을 추천함.
* `push -> pull`로 바꾸면 옵저버가 원하는 상태만을  주제로부터 끌어올 수 있음.   
```java
public void update() {
    temperature = weatherData.temperature;
    humidity = weatherData.humidity;
}
```
