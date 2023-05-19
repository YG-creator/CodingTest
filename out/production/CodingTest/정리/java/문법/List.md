# List 와 ArrayList 차이점 

List : 인터페이스 ex) 도형

ArrayList : 클래스 ex) 정사각형

유연성을 위해서 쓸 때는 List 사용 

```java
List<자료형> list = new ArrayList<>();
list = new LinkedList<>();
```



# ArrayList vs LinkedList

ArrayList  : 인덱스에 따라 CRUD

LinkedList : 인덱스 ㄴㄴ 차례대로 CRUD

search 효율성 : ArrayList > LinkedList

삽입,삭제 효율성 : ArrayList < LinkedList



# 복사하기

```java
List<Stirng> copy = new ArrayList<>(list);
```



# 포함여부 확인

```java
list.contains(x);
```



# 리스트 배열

```java
List<int[]> list = new ArrayList[n];
```

