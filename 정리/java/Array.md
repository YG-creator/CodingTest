# 포함 여부 확인

```java
int[] arr = {1,2,3};
int key = 1;
boolean answer = Arrays.stream(arr).anyMatch(i -> i == key);
```

