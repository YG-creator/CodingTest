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

* 