# LEVEL 1 

* [신고 결과 받기](https://programmers.co.kr/learn/courses/30/lessons/92334) - 

  1. map, set 으로 구현

  신고한사람 : 신고당한 사람(중복 ㄴ) / 신고당한 사람 : 신고 당한 횟수 / k번 이상 신고당한 사람들

  2. id마다 신고당한 사람들 퇴출 된사람 수 세기

* [로또의 최고 순위와 최저 순위](https://programmers.co.kr/learn/courses/30/lessons/77484)

  1. 번호일치,  0갯수세기 구현 -> 완전탐색

  2. 최고, 최저 순위 구현 

* [신규 아이디 추천](https://programmers.co.kr/learn/courses/30/lessons/72410)

  replaceAll()

* [숫자 문자열과 영단어](https://programmers.co.kr/learn/courses/30/lessons/81301)

  replace()

* [키패드 누르기](https://programmers.co.kr/learn/courses/30/lessons/67256)
  1. 키패드 그래프화 하기
  2. 무조건 왼손 쓰는경우
  3. 무조건 오른손 쓰는 경우
  4. 거리 가까운손 쓰기 / 거리가 같으면 주로쓰는 손 사용

* [크레인 인형뽑기 게임](https://programmers.co.kr/learn/courses/30/lessons/64061)
  1. 해당 자리 맨위부터 뽑기
  2. 바구니 맨위에 거라 같으면 score += 2
     1. 비어있으면 걍 넣기
     2. 맨 위에거랑 다르면 넣기

* [단체사진 찍기](https://programmers.co.kr/learn/courses/30/lessons/1835)
  1. 8명 순열 구하기
  2. 순열 하나 씩 조건 만족하는 지 확인

* [소수 만들기](https://programmers.co.kr/learn/courses/30/lessons/12977)

  1. 숫자 3개 뽑기 - 중복ㄴ 조합
  2. 다 더한게 소수인지 판별하기 - 단일 소수 판별

* [완주하지 못한 선수](https://programmers.co.kr/learn/courses/30/lessons/42576)

  Map

  1. 참가자 map에 넣기
  2. 완주자 한명씩 확인
     1. 있으면 cnt--;
     2. cnt == 0 -> revmove

* [K번째수](https://programmers.co.kr/learn/courses/30/lessons/42748)

  Array Index

  1. a~b 번째 수 자르기
  2. 오름차순 정렬
  3. n번째 수 출력

* [모의고사](https://programmers.co.kr/learn/courses/30/lessons/42840)

  나머지 연산, 최댓값 찾기

  1. 문제 맞춘수 세기- 나머지 연산 + Array idx
  2. 가장 많이 맞춘 수 - Math.max()

* [체육복](https://programmers.co.kr/learn/courses/30/lessons/42862) v

  그리디

  1. 체육복 수 구하기
  2. 체육복 없는 경우만 앞,뒤 여벌 체육복 빌리기 - 앞부터 빌리기(그리디)
  3. 체육복 있는 학생수 세기

* [폰켓몬](https://programmers.co.kr/learn/courses/30/lessons/1845)

  Set - 종류가 가장 많게 n/2개 뽑기

  1. 폰켓몬 종류 갯수 구하기 - set
  2. 종류, n/2 중 최솟값 출력 - Math.min()

* [실패율](https://programmers.co.kr/learn/courses/30/lessons/42889)

  자료형 - doiuble

  1. 도달했지만 못깬경우의 수 구하기
  2. 깬 경우의 수 구하기
  3. 실패율 구하기 - double

# LEVEL 2

* [문자열 압축](https://programmers.co.kr/learn/courses/30/lessons/60057)
  1. 1~n/2 단위로 자르기
  2. 숫자(반복된 숫자, 1은 안해도됨)+반복된 문자 
  3. 최소길이 구하기

* [오픈채팅방](https://programmers.co.kr/learn/courses/30/lessons/42888)
  1. 신고한 사람 : 신고당한 사람 
  2. 신고당한 사람 : 신고당한 횟수 
  3. 퇴출 된 사람 list
  4. 신고한 사람 : 신고당한 사람 +  퇴출된사람 list -> 퇴출당한 사람 수 세기

* [카카오 프렌즈 컬러링북](https://programmers.co.kr/learn/courses/30/lessons/1829)
  1. 방문안하고 색 있는거
     1. bfs - 덩어리 갯수 세기, 방문처리
     2. cnt++

* [단체사진 찍기](https://programmers.co.kr/learn/courses/30/lessons/1835)
  1. 8명 순열 - 백트래킹, map, array
  2. 순열마다 조건 확인하기 - 완전탐색

* [멀쩡한 사각형 ](https://programmers.co.kr/learn/courses/30/lessons/62048) v
  1.  최대공약수 구하기
  2. w * h - (w + h - 최대공약수) 출력

* [124 나라의 숫자](https://programmers.co.kr/learn/courses/30/lessons/12899)

  10진법 -> 3진법 -> 124로 숫자 변환

* [기능개발](https://programmers.co.kr/learn/courses/30/lessons/42586)

  1. 처리시간 구하기 - Math.ceil()
  2. 전거보다 큰 경우  /  작거나 같은 경우  /  마지막거  - pq

* [더 맵게](https://programmers.co.kr/learn/courses/30/lessons/42626)

  PriorityQueue - 최솟값

  1. 첫번째 작은거 , 두번째 작은거 구하기 - pq
  2. 합치기 
  3. 최솟값이 k이상인지 확인하기 - pq

* [타겟넘버](https://programmers.co.kr/learn/courses/30/lessons/43165)

  완전탐색(dfs)

  1. +,- 둘중 하나 선택
  2. 연산 결과가 target과 같은지 확인 -> 같으면 cnt++

* [짝지어 제거하기](https://programmers.co.kr/learn/courses/30/lessons/12973)

  stack

  1. 비어있으면 add
  2. 안비어 있는경우
     1. 맨위에거랑 같으면 pop
     2. 다르면 add
  3. stack이 비어있는지 확인
     1. 비어있으면 1출력
     2. 안비어있으면 0출력

* [행렬 테두리 회전하기](https://programmers.co.kr/learn/courses/30/lessons/77485) v

  그래프 회전

  1. 그래프 만들기
  2. 반복
     1. 테두리 최솟값 구하기
     2. 테두리 회전하기 - 방향 반대로해서 구하기, 맨마지막값은 저장해놔야됨

* [메뉴 리뉴얼](https://programmers.co.kr/learn/courses/30/lessons/72411) v

  조합 + map

  1. 각 주문에서 n개 뽑기
     1. 뽑은거 map에 넣기
     2. map value최댓값 확인
        1. 최댓값이 2보다 작으면 pass 
        2. 최댓값과 같은 value를 가진 key들을 추가

* [괄호 변환](https://programmers.co.kr/learn/courses/30/lessons/60058)

  dfs + Stack

  1. 균형잡힌지 확인
  2. 올바른지 확인
  3. 조건에 맞게 출력

* [[1차] 뉴스 클러스터링](https://programmers.co.kr/learn/courses/30/lessons/17677)

  1. 다 소문자로 변환 - toLowerCase()
  2. 2글자 씩 자르기 - substring()
  3. 자른거 map에 넣기 - map(str, cnt)
  4. 둘다 공집합이면 1 출력하기 - map.isEmpty()
  5. 교집합, 합집합, 유사도 구하기 - Math.min(), Math.max()
  6. 유사도 * 63356 곱하기 - 자료형

* [거리두기 확인하기](https://programmers.co.kr/learn/courses/30/lessons/81302)

  1. P위치 list에 담기
  2. P간 거리 구하기
  3. 맨해튼 거리 2이하인거 찾기
     1. 거리가 1이면 0출력
     2. 거리가 2이면 다 막혔는지 확인
        1. 직선 
        2. 대각선
     3. 거리가 2초과면 continue

* [[카카오 인턴] 수식 최대화](https://programmers.co.kr/learn/courses/30/lessons/67257)

  순열+연산+절댓값+최댓값

  1. 연산 순서 정하기
  2. 숫자, 연산 분리하기
  3. 연산 순서대로 연산하기
  4. 연산결과 절댓값 최댓값 구하기