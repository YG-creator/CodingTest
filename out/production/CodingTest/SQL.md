# SELECT

* FROM

* WHERE

* ORDER BY

* UNION ALL

  수평적 합치기

  FROM에 쓸거면 () AS A 해줘야 됨

* LIMIT

* AS A

* IF(조건, TRUE일때값, FALSE일때값)



# WHERE

* =, !=

* 논리 연산

  AND, OR, NOT

* BETWEEN A AND B : 이상, 이하

* IN : 값 포함 여부

* LIKE

  * %문장%
  * %문장
  * 문장%



# 통계

* SUM()
* MAX()
* MIN()
* COUNT()
* DISTINCT()
* ROUND(수,마지막 자릿수) : 반올림
* CEIL() : 정수 올림만 가능
* FLOOR() : 정수 내림만 가능
* TRUNCATE(숫자, 자릿수) : 버리기



# GROUP BY

* GROUP BY 

  여러개 가능, 순서대로 적용됨

* HAVING

  그루핑 후 적용

* WHERE

  그루핑 전 적용

* 조인문

  GROUP BY 는 기준이 필요함



# JOIN

* 종류

  * A LEFT OUTER JOIN B ON A.ID = B.ID

  * A RIGHT OUTER JOIN B ON A.ID = B.ID

  * A INNER JOIN B ON A.ID = B.ID


* 주의점

  * 꼭 모두 있어야 할 데이터 기준으로 합치기

  * A를 select~where 쓰지말자

    join한 다음 where문으로 걸러주자



# String

* CONCAT()

* LOWER()

* UPPER()

* SUBSTR(STR,이상위치,이하위치)

  1부터 시작

  

# Date

* DATE_FORMAT()

  * %Y : 2024, %y : 24
  * %M : 04, %m : 
  * %D : 26, %d : 

* YEAR()

* MONTH()

* DAY()

* DATEDIFF(A,B)