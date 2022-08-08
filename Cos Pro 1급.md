# 문제1(구현)

어느 누군가가 타임머신을 타고 과거로 가서 숫자 0이 없는 수 체계를 전파했습니다. 역사가 바뀌어 이제 사람들의 의식 속엔 0이란 숫자가 사라졌습니다. 따라서, 현재의 수 체계는 1, 2, 3, ..., 8, 9, 11, 12, ...와 같이 0이 없게 바뀌었습니다.

0을 포함하지 않은 자연수 num이 매개변수로 주어질 때, 이 수에 1을 더한 수를 return 하도록 solution 메소드를 완성해주세요.

---

#####매개변수 설명
자연수 num이 solution 메소드의 매개변수로 주어집니다.
* num은 1 이상 999,999,999,999,999,999 이하의 0을 포함하지 않는 자연수입니다.

---

#####return 값 설명
자연수 num에 1을 더한 수를 return 해주세요.

---

#####예시

| num     | return  |
| ------- | ------- |
| 9949999 | 9951111 |

#####예시 설명

9,949,999에 1을 더하면 9,950,000이지만 0은 존재하지 않으므로 9,951,111이 됩니다.



## 정답

```java
// <undefined>
// import <undefined>

class Solution {
    public long solution(long num) {
        num++;
        long digit = 1;
        while (num / digit % 10 == 0) {
            num += digit;
            digit *= 10;
        }
        return num;
    }
}
```



# 문제2(구현) 

다음과 같이 n x n 크기의 격자에 1부터 n x n까지의 수가 하나씩 있습니다.
![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC1_qysbr6.png)
이때 수가 다음과 같은 순서로 배치되어있다면 이것을 n-소용돌이 수라고 부릅니다.
![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC2_ol8snc.png)
소용돌이 수에서 1행 1열부터 n 행 n 열까지 대각선상에 존재하는 수들의 합을 구해야 합니다.
![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC3_cbcdg3.png)
위의 예에서 대각선상에 존재하는 수의 합은 15입니다.
격자의 크기 n이 주어질 때 n-소용돌이 수의 대각선상에 존재하는 	을 return 하도록 solution 메소드를 완성해주세요.

---

**매개변수 설명**

격자의 크기 n이 solution 메소드의 매개변수로 주어집니다.

* n은 1 이상 100 이하의 자연수입니다.

---

**return 값 설명**

n-소용돌이 수의 대각선상에 존재하는 수들의 합을 return 해주세요.

---

**예시**

| n    | return |
| ---- | ------ |
| 3    | 15     |
| 2    | 4      |

**예시 설명**

예시 #1
문제의 예와 같습니다.

예시 #2
![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC4_astq7q.png)
1과 3을 더하여 4가 됩니다.



## 정답

```java
// You may use import as below.
//import java.util.*;

class Solution {
    public int solution(int n) {
        // Write code here.
        int answer = 0;
        int[][] graph = new int[n][n];
        int[] pos = {0,0};
        int cnt = 1;
        graph[0][0] = 1;
        
        // 오 -> 아 -> 왼 -> 위 
        loop:
        while(true) {
        	for(int i=0;i<4;i++) {
        		if(i != 3) {
        			move(i,n-1,pos,graph);
        			cnt += n-1;
        		}
        		else {
        			move(3,n-2,pos,graph);
        			cnt += n-2;
        		}

        		if(cnt == n*n) break loop;
        	}
        	n--;
        }
        
        // n,n 다 더하기
        for(int i=0;i<graph.length;i++) {
        	answer += graph[i][i];
        }
        
        return answer;
    }
    
    private void move(int dir, int len, int[] pos, int[][] graph) {
    	int[] dx = {0,1,0,-1};
    	int[] dy = {1,0,-1,0};   	
    	int num = graph[pos[0]][pos[1]];
    	
    	for(int i=0;i<len;i++) {
    		pos[0] += dx[dir];
    		pos[1] += dy[dir];

    		graph[pos[0]][pos[1]] = ++num;
    	}
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
```



# 문제 3(구현)

체스에서 나이트(knight)는 아래 그림과 같이 동그라미로 표시된 8개의 방향중 한 곳으로 한 번에 이동이 가능합니다.

![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight.png)

단, 나이트는 체스판 밖으로는 이동할 수 없습니다.

체스판의 각 칸의 위치는 다음과 같이 표기합니다.
![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight2.png)
예를 들어, A번줄과 1번줄이 겹치는 부분은 'A1'이라고 합니다.

나이트의 위치 pos가 매개변수로 주어질 때, 나이트를 한 번 움직여서 이동할 수 있는 칸은 몇개인지 return 하도록 solution 메소드를 완성해주세요.

---

#####매개변수 설명
나이트의 위치 pos가 solution 메소드의 매개변수로 주어집니다.
* pos는 A부터 H까지의 대문자 알파벳 하나와 1 이상 8이하의 정수 하나로 이루어진 두 글자 문자열입니다.
* 잘못된 위치가 주어지는 경우는 없습니다.

---

#####return 값 설명
나이트를 한 번 움직여서 이동할 수 있는 칸의 개수를 return 해주세요.

---
#####예시

| pos  | return |
| ---- | ------ |
| "A7" | 3      |

#####예시 설명
나이트가 A7 위치에 있으면 아래 그림과 같이 왼쪽으로는 이동하지 못하고, 오른쪽으로는 맨 위를 제외한 나머지 세 칸으로 이동 가능합니다. 
![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight3.png)
따라서, 3을 return 하면 됩니다.



## 정답

```java
// You may use import as below.
//import java.util.*;

class Solution {
    public int solution(String pos) {
        // Write code here.
        int answer = 0;
        
        // 영어 -> 좌표화
        int row = (int)(pos.charAt(0)-'A');
        int col = Character.getNumericValue(pos.charAt(1))-1;
        
        // 8방향 이동
        // 범위 안이면 ++
        int[] dx = {1,1,-1,-1,2,2,-2,-2};
        int[] dy = {2,-2,2,-1,1,-1,1,-1};
        for(int i=0;i<8;i++) {
        	int nx = row + dx[i];
        	int ny = col + dy[i];
        	
        	if(nx < 0 || nx >= 8 || ny < 0 || ny >= 8) continue;
        	answer++;
        }
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
```





# 문제4(빈칸 넣기)

오름차순으로 정렬되어있는 두 배열 arrA, arrB를 하나의 배열로 합치려 합니다. 단, 합친 후의 배열도 오름차순으로 정렬되어 있어야 합니다.

예를 들어 arrA = [-2, 3, 5, 9], arrB = [0, 1, 5]인 경우 두 배열을 오름차순으로 정렬된 하나의 배열로 합치면 [-2, 0, 1, 3, 5, 5, 9]가 됩니다.

오름차순으로 정렬된 두 배열 arrA와 arrB가 주어졌을 때, 두 배열을 오름차순으로 정렬된 하나의 배열로 합쳐서 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

---

**매개변수 설명**

오름차순으로 정렬된 두 배열 arrA와 arrB가 solution 메소드의 매개변수로 주어집니다.

* arrA의 길이는 1 이상 200,000 이하입니다.
* arrA의 원소는 -1,000,000 이상 1,000,000 이하의 정수입니다.
* arrB의 길이는 1 이상 200,000 이하입니다.
* arrB의 원소는 -1,000,000 이상 1,000,000 이하의 정수입니다.

---

**return 값 설명**

두 배열 arrA, arrB를 오름차순으로 정렬된 하나의 배열로 합쳐서 return 해주세요.

---

**예시**

| arrA          | arrB      | return                 |
| ------------- | --------- | ---------------------- |
| [-2, 3, 5, 9] | [0, 1, 5] | [-2, 0, 1, 3, 5, 5, 9] |



## 정답

```java
import java.util.*;

class Solution {
    public int[] solution(int[] arrA, int[] arrB) {
        int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
        while(arrA_idx<arrA_len && arrB_idx<arrB_len){	// 빈칸
            if(arrA[arrA_idx] < arrB[arrB_idx])
                answer[answer_idx++] = arrA[arrA_idx++];
            else
                answer[answer_idx++] = arrB[arrB_idx++];
        }
        while(arrA_idx < arrA_len)	// 빈칸
            answer[answer_idx++] = arrA[arrA_idx++];
        while(arrB_idx < arrB_len)	// 빈칸
            answer[answer_idx++] = arrB[arrB_idx++];
        return answer;
    }
    
    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.solution(arrA, arrB);
 
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}
```



# 문제5(수정하기)
1번부터 N번까지 후보에 대해서 투표를 진행했습니다. 예를 들어 투표 결과가 [1, 5, 4, 3, 2, 5, 2, 5, 5, 4]라면 순서대로 [1번, 5번, 4번, 3번, 2번, 5번, 2번, 5번, 5번, 4번] 후보에 투표했음을 나타냅니다. 이때, 가장 많은 표를 받은 후보의 번호를 구하려고 합니다.

주어진 solution 메소드는 후보의 수 N과 투표를 진행한 결과가 담긴 배열 votes가 매개변수로 주어졌을 때, 가장 많은 표를 받은 후보의 번호를 return 하는 메소드입니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

---
#####매개변수 설명
후보의 수 N과 투표 결과가 들어있는 배열 votes가 solution 메소드의 매개변수로 주어집니다.
* N은 1 이상 10 이하의 자연수입니다.
* votes의 길이는 1 이상 100 이하입니다.
* votes의 원소는 1 이상 N이하의 자연수입니다.

---
#####return 값 설명
가장 많은 표를 받은 후보의 번호를 배열에 담아 return 해주세요
* 만약 가장 많은 표를 받은 후보가 2개 이상이라면, 그 후보들의 번호를 모두 배열에 담아 오름차순 정렬하여 return 해주세요.

---
#####예시

| N    | votes                 | return |
| ---- | --------------------- | ------ |
| 5    | [1,5,4,3,2,5,2,5,5,4] | [5]    |
| 4    | [1,3,2,3,2]           | [2,3]  |

#####예시 설명
예시 #1
1번부터 5번까지 5개의 후보가 있으며, 투표 결과는 [1, 5, 4, 3, 2, 5, 2, 5, 5, 4]입니다. 각 후보의 득표수는 다음과 같습니다.

* 1번 후보가 1표
* 2번 후보가 2표
* 3번 후보가 1표
* 4번 후보가 2표
* 5번 후보가 4표

이 경우 5번 후보가 4표로 가장 많은 표를 얻었습니다.

예시 #2
1번 후보가 1표, 2번 후보가 2표, 3번 후보가 2표씩 받았습니다. 2번과 3번 후보가 공동으로 가장 많은 표를 받았기 때문에 [2, 3]을 오름차순 정렬하여 return 하면 됩니다.



## 정답

```java
import java.util.*;

class Solution {
    public int[] solution(int N, int[] votes) {
        int voteCounter[] = new int[11];
        for (int i = 0; i < votes.length; i++) {
            voteCounter[votes[i]] += 1;
        }
        int maxVal = 0;
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (maxVal < voteCounter[i]) {
                maxVal = voteCounter[i];
                cnt = 1;
            }
            else if(maxVal == voteCounter[i]){
                cnt += 1;
            }
        }
        int answer[] = new int[cnt];	
        for (int i = 0, idx = 0; i < N; i++){	// 수정
            if (voteCounter[i] == maxVal) {
                answer[idx] = i;
                idx += 1;
            }
        }
        return answer;
    }
    
    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N1 = 5;
        int[] votes1 = {1,5,4,3,2,5,2,5,5,4};
        int[] ret1 = sol.solution(N1, votes1);
 
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret1) + " .");
        

        int N2 = 4;
        int[] votes2 = {1, 3, 2, 3, 2};
        int[] ret2 = sol.solution(N2, votes2);
 
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret2) + " .");
    }
}
```



# 문제6(수정하기)

두 학생 A와 B는 계단 게임을 하였습니다.
계단 게임의 규칙은 아래와 같습니다.

~~~
1. 계단 제일 아래에서 게임을 시작합니다. (0번째 칸)
2. 가위바위보를 합니다.
3. 이기면 계단 세 칸을 올라가고, 지면 한 칸을 내려가고, 비기면 제자리에 있습니다.
4. 계단 제일 아래에서 지면 제자리에 있습니다.
5. 2~4 과정을 열 번 반복합니다.
~~~

A와 B가 계단 게임을 완료한 후에, A가 계단 위 몇 번째 칸에 있는지 파악하려고 합니다.

A와 B가 낸 가위바위보 기록이 순서대로 들어있는 배열 recordA와 recordB가 매개변수로 주어질 때, 게임을 마친 후의 A의 위치를 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

---

#####매개변수 설명
A와 B가 낸 가위바위보 기록이 순서대로 들어있는 배열 recordA와 recordB가 매개변수로 주어집니다.
* recordA와 recordB의 원소는 0, 1, 2중 하나이고 순서대로 가위, 바위, 보를 의미합니다.
* recordA와 recordB의 길이는 10입니다.

---

#####return 값 설명
solution 메소드는 계단 게임을 마친 후에 A가 계단 위 몇 번째 칸에 위치하는지를 return 합니다.

* 계단 제일 아래 칸은 0번째 칸입니다.

---

#####예시

| recordA               | recordB               | return |
| --------------------- | --------------------- | ------ |
| [2,0,0,0,0,0,1,1,0,0] | [0,0,0,0,2,2,0,2,2,2] | 14     |

#####예시 설명

|         |      |      |      |      |      |      |      |      |      |      |
| ------- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| recordA | 보   | 가위 | 가위 | 가위 | 가위 | 가위 | 바위 | 바위 | 가위 | 가위 |
| recordB | 가위 | 가위 | 가위 | 가위 | 보   | 보   | 가위 | 보   | 보   | 보   |
| result  | 0    | 0    | 0    | 0    | +3   | +6   | +9   | +8   | +11  | +14  |



## 정답

```java
class Solution{
    public int func(int record){
        if(record == 0) return 1;
        else if(record == 1) return 2;
        return 0;
    }

    public int solution(int[] recordA, int[] recordB){
        int cnt = 0;
        for(int i = 0; i < recordA.length; i++){
            if(recordA[i] == recordB[i])
                continue;
            else if(recordA[i] == func(recordB[i]))
                cnt = cnt + 3;
            else
                cnt = Math.max(0, cnt - 1);	// 수정
        }
        return cnt;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        int ret = sol.solution(recordA, recordB);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
```



# 문제7(수정하기)

지난 연속된 n일 동안의 주식 가격이 순서대로 들어있는 배열이 있습니다. 이때, 다음 규칙에 따라 주식을 사고 팔았을 때의 최대 수익을 구하려 합니다.

* n일 동안 주식을 단 한 번 살 수 있습니다.
* n일 동안 주식을 단 한 번 팔 수 있습니다.
* 주식을 산 날에 바로 팔 수는 없으며, 최소 하루가 지나야 팔 수 있습니다.
* 적어도 한 번은 주식을 사야하며, 한 번은 팔아야 합니다.

주식을 팔 때는 반드시 이전에 주식을 샀어야 하며, 최대 수익은 양수가 아닐 수도 있습니다.

연속된 n 일 동안의 주식 가격이 순서대로 들어있는 배열 prices가 매개변수로 주어질 때, 주식을 규칙에 맞게 한 번만 사고팔았을 때 얻을 수 있는 최대 수익을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 코드가 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정해주세요.

---
#####매개변수 설명
연속된 n 일 동안의 주식 가격이 순서대로 들어있는 배열 prices가 solution 메소드의 매개변수로 주어집니다.
* prices의 길이는 2 이상 1,000,000 이하입니다.
* prices의 각 원소는 1 이상 1,000 이하의 자연수입니다.

---
#####return 값 설명
주식을 규칙에 맞게 한 번만 사고팔았을 때 얻을 수 있는 최대 수익을 return 해주세요.

---

**예시**

| prices  | return |
| ------- | ------ |
| [1,2,3] | 2      |
| [3,1]   | -2     |

**예시 설명**

예시 #1
연속된 3일의 주가가 차례로 [1, 2, 3] 이며, 첫째 날에 주식을 사서 셋째 날에 팔면 수익은 2이고, 이때가 최대입니다.

예시 #2
문제에서 설명한 것처럼 무조건 한 번은 매수하고, 한 번은 매도해야 합니다. 첫째 날에 매수하여 둘째 날에 매도하는 방법밖에 없기 때문에 수익은 -2, 즉 2만큼 손실을 보게 됩니다.



## 정답

```java
class Solution{
    int solution(int[] prices){
        int INF = 1000000001;
        int tmp = INF;
        int answer = -INF;
        for(int price : prices){
            if(tmp != INF)
                answer = Math.max(answer, price - tmp);	// 수정
            tmp = Math.min(tmp, price);
        }
        return answer;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
```



# 문제8(빈칸 넣기)
배달음식 전문점 운영을 위해 다음과 같이 DeliveryStore 인터페이스와  PizzaStore, Food 클래스를 작성했습니다.

![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180316_deli_java1.png)

* DeliveryStore :
  * DeliveryStore는 배달 음식점의 인터페이스입니다.
  * 배달 음식점은 setOrderList와 getTotalPrice 메소드를 구현해야 합니다.
  * setOrderList 메소드는 주문 메뉴의 리스트를 매개변수로 받아 저장합니다.
  * getTotalPrice 메소드는 주문받은 음식 가격의 총합을 return 합니다.

* Food : 
  * Food는 음식을 나타내는 클래스입니다.
  * 음식은 이름(name)과 가격(price)으로 구성되어있습니다.

* PizzaStore
  * PizzaStore는 피자 배달 전문점을 나타내는 클래스이며 DeliveryStore 인터페이스를 구현합니다.
  * menuList는 피자 배달 전문점에서 주문 할 수 있는 음식의 리스트를 저장합니다.
  * orderList는 주문 받은 음식들의 이름을 저장합니다.
  * setOrderList 메소드는 주문 메뉴를 받아 orderList에 저장합니다.
  * getTotalPrice 메소드는 orderList에 들어있는 음식 가격의 총합을 return 합니다.

주문 메뉴가 들어있는 배열 orderList가 매개변수로 주어질 때, 주문한 메뉴의 전체 가격을 return 하도록 solution 메소드를 작성하려고 합니다. 위의 클래스 구조를 참고하여 주어진 코드의 빈칸을 적절히 채워 전체 코드를 완성해주세요.

---

**매개변수 설명**

주문 메뉴가 들어있는 배열 orderList가 solution 메소드의 매개변수로 주어집니다.

* orderList의 길이는 1 이상 5이하입니댜.
* orderList에는 주문하려는 메뉴의 이름들이 문자열 형태로 들어있습니다.
  * orderList에는 같은 메뉴의 이름이 중복해서 들어있지 않습니다.
* 메뉴의 이름과 가격은 PizzaStore의 생성자에서 초기화해줍니다.

---

**return 값 설명**

주문한 메뉴의 전체 가격을 return 해주세요.

----

**예시**

| orderList                           | return |
| ----------------------------------- | ------ |
| ["Cheese", "Pineapple", "Meatball"] | 51600  |



## 정답

```java
import java.util.ArrayList;
import java.util.Iterator;

//DeliveryStore interface, Food and PizzaStore class are written as Inner Class. Read the code below and fill in the blank.
class Solution {
    interface DeliveryStore{
        public void setOrderList(String[] orderList);
        public int getTotalPrice();
    }
    
    class Food{
        public String name;
        public int price;
        public Food(String name, int price){
            this.name = name;
            this.price = price;
        }
    }
    
    class PizzaStore implements DeliveryStore {	// 추가
        private ArrayList<Food> menuList;
        private ArrayList<String> orderList;
        
        public PizzaStore(){
            //init menuList
            menuList = new ArrayList<Food>();
            String[] menuNames = {"Cheese", "Potato", "Shrimp", "Pineapple", "Meatball"};
            int[] menuPrices = {11100, 12600, 13300, 21000, 19500};
            for(int i = 0; i < 5; i++)
                menuList.add(new Food(menuNames[i], menuPrices[i]));
            
            //init orderList
            orderList = new ArrayList<String>();
        }
        
        public void setOrderList(String[] orderList){	// 추가
            for(int i = 0; i < orderList.length; i++)
                this.orderList.add(orderList[i]);
        }
        
        public int getTotalPrice(){		// 추가
            int totalPrice = 0;
            Iterator<String> iter = orderList.iterator();
            while (iter.hasNext()) {
                String order = iter.next();
                for(int i = 0; i < menuList.size(); i++)
                    if(order.equals(menuList.get(i).name))
                        totalPrice += menuList.get(i).price;
            }
            return totalPrice;
        }
    }
    
    public int solution(String[] orderList) {
        DeliveryStore deliveryStore = new PizzaStore();
        
        deliveryStore.setOrderList(orderList);
        int totalPrice = deliveryStore.getTotalPrice();
        
        return totalPrice;
    }
    
    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] orderList = {"Cheese", "Pineapple", "Meatball"};
        int ret = sol.solution(orderList);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
```







# 문제9(빈칸 넣기)

해밍 거리(Hamming distance)란 같은 길이를 가진 두 개의 문자열에서 같은 위치에 있지만 서로 다른 문자의 개수를 뜻합니다. 예를 들어 두 2진수 문자열이 "10010"과 "110"이라면, 먼저 두 문자열의 자릿수를 맞추기 위해 "110"의 앞에 0 두개를 채워 "00110"으로 만들어 줍니다. 두 2진수 문자열은 첫 번째와 세 번째 문자가 서로 다르므로 해밍 거리는 2입니다.

* `1`0`0`1 0
* `0`0`1`1 0

두 2진수 문자열 binaryA, binaryB의 해밍 거리를 구하려 합니다. 이를 위해 다음과 같이 간단히 프로그램 구조를 작성했습니다

~~~
1단계. 길이가 더 긴 2진수 문자열의 길이를 구합니다.
2단계. 첫 번째 2진수 문자열의 길이가 더 짧다면 문자열의 앞에 0을 채워넣어 길이를 맞춰줍니다.
3단계. 두 번째 2진수 문자열의 길이가 더 짧다면 문자열의 앞에 0을 채워넣어 길이를 맞춰줍니다.
4단계. 길이가 같은 두 2진수 문자열의 해밍 거리를 구합니다.
~~~

두 2진수 문자열 binaryA와 binaryB가 매개변수로 주어질 때, 두 2진수의 해밍 거리를 return 하도록 solution 메소드를 작성했습니다. 이때, 위 구조를 참고하여 중복되는 부분은 func_a라는 메소드로 작성했습니다. 코드가 올바르게 동작할 수 있도록 빈칸을 알맞게 채워 전체 코드를 완성해주세요.

---

**매개변수 설명**

두 2진수 문자열 binaryA와 binaryB가 solution 메소드의 매개변수로 주어집니다.

* binaryA의 길이는 1 이상 10 이하입니다.
* binaryA는 0 또는 1로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
* binaryB의 길이는 1 이상 10 이하입니다.
* binaryB는 0 또는 1로만 이루어진 문자열이며, 0으로 시작하지 않습니다.

---

**return 값 설명**

두 2진수 문자열의 해밍 거리를 return 해주세요.

---

**예시**

| binaryA | binaryB | return |
| ------- | ------- | ------ |
| "10010" | "110"   | 2      |

**예시 설명**

두 2진수의 자릿수는 각각 5와 3입니다. 자릿수를 맞추기 위해 "110" 앞에 0 두 개를 채워주면 "00110"이 됩니다. 이제 두 2진수 문자열의 해밍 거리를 구하면 다음과 같습니다.

* `1`0`0`1 0
* `0`0`1`1 0

위와 같이 첫 번째와 세 번째 문자가 서로 다르므로, 해밍 거리는 2가 됩니다.



## 정답

```java
class Solution {
    public String func_a(String str, int len){
        String padZero = "";
        int padSize = len - str.length();	// 추가
        for(int i = 0; i < padSize; i++)
            padZero += "0";
        return padZero + str;
    }
    
    public int solution(String binaryA, String binaryB) {
        int maxLength = Math.max(binaryA.length(), binaryB.length());
        binaryA = func_a(binaryA, maxLength);
        binaryB = func_a(binaryB, maxLength);
        
        int hammingDistance = 0;
        for(int i = 0; i < maxLength; i++)
            if(binaryA.charAt(i) != binaryB.charAt(i))	// 추가
                hammingDistance += 1;
        return hammingDistance;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String binaryA = "10010";
        String binaryB = "110";
        int ret = sol.solution(binaryA, binaryB);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
```





# 문제10(빈칸 넣기)
문자열 형태의 식을 계산하려 합니다. 식은 2개의 자연수와 1개의 연산자('+', '-', '*' 중 하나)로 이루어져 있습니다. 예를 들어 주어진 식이 "123+12"라면 이를 계산한 결과는 135입니다.

문자열로 이루어진 식을 계산하기 위해 다음과 같이 간단히 프로그램 구조를 작성했습니다.

~~~
1단계. 주어진 식에서 연산자의 위치를 찾습니다.
2단계. 연산자의 앞과 뒤에 있는 문자열을 각각 숫자로 변환합니다.
3단계. 주어진 연산자에 맞게 연산을 수행합니다.
~~~

문자열 형태의 식 expression이 매개변수로 주어질 때, 식을 계산한 결과를 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

---

**매개변수 설명**

문자열 형태의 식 expression이 solution 메소드의 매개변수로 주어집니다.
* expression은 연산자 1개와 숫자 2개가 결합한 형태입니다.
  * 연산자는 '+', '-', '*'만 사용됩니다.
  * 숫자는 1 이상 10,000 이하의 자연수입니다.

---

**return 값 설명**

expression을 계산한 결과를 return 해주세요.
* 계산 결과는 문자열로 변환하지 않아도 됩니다.

---

**예시**

| expression | return |
| ---------- | ------ |
| "123+12"   | 135    |

**예시 설명**

'+'를 기준으로 앞의 숫자는 123이고 뒤의 숫자는 12이므로 두 숫자를 더하면 135가 됩니다.



## 정답

```java
class Solution {
    class Pair{
        public int firstNum;
        public int secondNum;
    }
    
    public int func_a(int numA, int numB, char exp){
        if (exp == '+')
            return numA + numB;
        else if (exp == '-')
            return numA - numB;
        else
            return numA * numB;
    }
    
    public int func_b(String exp){
        for(int i = 0; i < exp.length(); i++){
            char e = exp.charAt(i);
            if(e == '+' || e == '-' || e == '*')
                return i;
        }
        return -1;
    }
    public Pair func_c(String exp, int idx){
        Pair ret = new Pair();
        ret.firstNum = Integer.parseInt(exp.substring(0, idx));
        ret.secondNum = Integer.parseInt(exp.substring(idx + 1));
        return ret;
    }
    
    public int solution(String expression) {
        int expIndex = func_b(expression);	// 추가
        Pair numbers = func_c(expression,expIndex);	// 추가
        int result = func_a(numbers.firstNum,numbers.secondNum,expression.charAt(expIndex));	// 추가
        return result;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String expression = "123+12";
        int ret = sol.solution(expression);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
```

