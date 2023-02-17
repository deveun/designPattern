# PizzaStore
: 서브클래스의 팩토리메소드에서 Pizza 인스턴스의 생성을 담당하는 피자 주문 시뮬레이션

---

### Abstract Factory Pattern
* **객체 구성(composition)** 을 통한 구현
  1. PizzaStore 클래스에 Factory를 포함하기
      * PizzaStore 생성자에 Factory 구현체를 넣어주면, 해당 구현체에서 알맞은 Pizza 인스턴스 생성을 담당
      * 기능이 추가될 때 interface의 수정이 필요
  ```java
  public abstract class PizzaStore {
      SimplePizzaFactory factory; // composition
  
      public PizzaStore(SimplePizzaFactory factory) {
          this.factory = factory;
      }
      
      public Pizza orderPizza(String type) {
          
          Pizza pizza = factory.createPizza(type);
          pizza.making();
  
          return pizza;
      }
  ```
  2. 피자의 원재료를 지점에 따라 설정해주는 IngredientFactory
     * 추상팩토리에서 제품군(피자재료)을 생성하는 인터페이스를 제공하여 `코드와 제품 생성을 분리`


### Factory Method Pattern
* **상속**에 의한 구현
* **의존성 뒤집기 (DIP)** : `고수준`의 PizzaStore가 `저수준` 구성요소인 Pizza 구현체에 의존하지 않고 추상적인 것에 의존하도록 하자
  * 어떤 클래스의 인스턴스를 만들지 `서브클래스의 method에서` 결정
  * `생산자(Creator)` 클래스 - PizzaStore 추상클래스와 인스턴스들
  * `제품(Product)` 클래스 - Pizza 추상클래스와 인스턴스들
* 구상 생상자 클래스가 1개더라도, 제품의 생산부분과 사용부분을 분리할 수 있다는 부분에서 유용
