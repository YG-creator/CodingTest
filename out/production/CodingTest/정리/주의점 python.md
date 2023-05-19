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



# 자동 import

해당 붉은 밑줄에 Alt + Enter



# 소숫점(.Nf)

```python
ans = 4.000
print(f"{ans:.2f}") # 소수 2째 자리까지
```



# 자리수(0Nd)

```python
s15 = '정수 3자리 : {0:03d}, {1:03d}'.format(12345, 12)print(s15)

# 정수 3자리 : 12345 012
```



# 문자열

```python
# 전체 바꾸기
b = a.replace('바꿀거','바꾼거')
# 왼쪽부터 n개 바꾸기
c = a.replace('바꿀거','바꾼거',횟수)
# 오른쪽부터 n개 바꾸기
d = a.replaceRight('바꿀거','바꾼거',횟수)

# 한번에 바꾸기
import re
a = "asdf"
b = re.sub('a|b','',a)

# 첫글자 = 특정문자 제거
a = 'abba'
b = re.sub('^a','',a)

# 마지막글자 = 특정문자 제거
a = 'abba'
b = re.sub('a$','',a)

# 특정문자만 제거
c = re.sub('[a-z]','',a)
# 알파벳만
a = 'There are 10 dogs'
c = [i for i in a if i.isalpha()]
c = ''.join(c)
# 숫자만 
a = '1234a'
b = list(i for i in a if i.isdigit())
b = ''.join(b)

# 특정 문자만 남기기
c = re.sub('[^a-z]','',a)

# 글자수에 맞게 바꾸기
text_mod = re.sub('^[0-9]{3}-[0-9]{4}-[0-9]{4}',"***-****-****",text)

# 연속문자 제거
import re
test = 'abbbsdfcdZZZZ11111)'
test1 = re.sub('(([a-zA-Z0-9])\\2{n,})', '', test) # 연속된 같은 문자 변환 (n+1개이상)
```



# 대소문자

```python
a = a.upper()
b = b.lower()
```



