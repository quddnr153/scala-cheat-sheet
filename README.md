# scala-cheat-sheet

## Scala with OOP

- 스칼라는 순수한 형태의 객체지향 언어이다
- 모든 값이 객체이며, 모든 연산은 메소드 호출이다

아래 예를 보자.

```scala
object Example {
  println(1 + 2)
}
```

위에서 ```+``` 연산자는 Int 클래스가 정의한 + 라는 이름의 메소드를 호출한 것이다.

```scala
object Example {
  println(1.+(2))
}
```

## Scala with FP

- 스칼라는 완전한 함수형 언어이다

---
함수형???

1. 함수는 first class 이다
2. 메소드에는 side effect 가 없어야 한다 (프로그램은 입력 값을 출력 값으로 변환해야 하며, 데이터를 그자리에서 변경하지 말아야 한다 - referentially transparent)

***referentially transparent (참조 투명성)*** 에 대한 예로 Java ```String``` 객체 의 ```replace``` method 가 있다

