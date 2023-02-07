# SimUDuck
: 여러가지 특성의 오리 시뮬레이션 게임 프로젝트

### [1번구현] 상속 ------ :x:
- `Duck을 상속`하는 MallardDuck, RedheadDuck, RubberDuck.. 을 만들고 Dock의 메서드에 행동을 정의   
(단점) SubClass의 특징을 살펴가며 모든 메소드를 오버라이딩 해줘야함 -> 중복 코드 발생   
(단점) SuperClass의 수정 시에 원치 않는 SubClass 의 변경이 생길 수 있음

### [2번구현] 인터페이스 ------ :x:
- Duck의 특성 Flyable, Quackable.. 을 `Interface`로 선언하고, 이를 `Implement`하는 클래스에서 기능을 구현   
(단점) 모든 메소드의 오버라이딩이 필요함

### [3번구현] 전략패턴 ------ :white_check_mark:
- 행동을 Interface로 선언하고, 행동에 대한 구체적인 내용은 별도의 클래스에 구현 `('변화'하는 부분만 '캡슐화')`
- 구성 (Composition)

---
### Strategy Pattern
> Duck 클래스가 행동을 담당하는 Behavior를 가지는 관계 (Composition: A에는 B가 있다)   
> 구체적인 행동은 Behavior 인터페이스를 구현한 클래스에 정의됨.
