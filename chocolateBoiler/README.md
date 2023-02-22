# ChocolateBoiler
: 여러 로직에서 하나의 초콜렛 보일러 인스턴스만 사용하여 (singleton) 
fill, boil, drain의 작업을 수행하는 프로젝트

---

### Singleton Pattern
* 인스턴스를 하나만 만들어야 하는 클래스
* 생성자를 `private`로 정의 & `getInstance` 정적 메소드를 시용
* (장) 필요할 때만 생성하기 때문에 전역변수로 선언하는 것보다 유리
* (단) 하나의 클래스가 인스턴스의 `관리` / `사용`의 두가지 책임을 가지게 됨
* (단) 리플렉션, 직렬화, 역직렬화에서는 적용이 어려움

---

### Multithread 환경에서의 문제점
* **getInstance()가 동시에 실행된다면!**

**[방법1]** 메소드 동기화
* `synchronized` getInstance() {...}
* 메소드를 호출할 떄마다 다른 thread에서 대기가 발생하여 `성능저하`

**[방법2]** 처음부터 인스턴스를 만들기
* 전역변수처럼 초기부터 인스턴스를 생성함
```java
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {}
    
    public static Singleton getInstance() {
        return instance;
    }
}
```

**[방법3]** DCL (Double-Checked Locking)
* 인스턴스가 생성되지 않았을 때만 동기화
* volatile 사용 - 하나의 스레드에서 값이 바뀌면 내용을 바로 반영 (`원자성 보장`)
```java
public class Singleton {
    private volatile static Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singletin.class) {
                if (instance == null) {
                    instance = new Singletin();
                }
            }
        }
        return instance;
    }
}
```

**[방법4]** Enum 사용
* [EnumChocolateBoiler](EnumChocolateBoiler.java)
