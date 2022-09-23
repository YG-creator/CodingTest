# buffer

```python
print("".join(arr))
```



# 깊은 복사

```python
import copy  
copy.deepcopy(a)
```



# 아스키 코드

```
# 아스키코드 -> 문자
chr(x)

# 문자 -> 아스코드
ord(x)
```



# 정렬

```python
arr.sort(key=lambda x : (len(x),digit_sum(x),x))
```



# 순열

```python
from itertools import permutations
# 2개 순열
arr = permutations([1,2,3,4], 2)
```



# 조합

```python
from itertools import combinations
# 2개 조합
arr = combinations([1,2,3,4], 2)

```



# 중복순열

```python
from itertools import product
# 모든 조합
arr = product([1,2,3],'ab')

# 2개 중복순열
arr = product([1,2,3], repeat=2)
```



# 중복조합

```python
from itertools import combinations_with_replacement

# 중복조합
arr = combinations_with_replacement([1,2,3,4], 2)

```



# 2차 그래프 입력

```python
# 문자열 * n -> int[][]
graph = [list(map(int,input().rstrip())) for _ in range(n)]
```

