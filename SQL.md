# SELECT

* FROM

* WHERE

  * =, !=
  * AND, OR, NOT
  * BETWEEN A AND B
  * IN
  * LIKE
    * %문장%
    * %문장
    * 문장%

* ORDER BY

* UNION ALL

  합치기

  FROM에 쓸거면 () AS A 해줘야 됨

* LIMIT

* AS A

  



# SUM, MAX, MIN

* SUM()
* MAX()
* MIN()
* COUNT()
* DISTINCT()

* ROUND(수,마지막 자릿수)



# GROUP BY

* GROUP BY 

  여러개 가능, 순서대로 적용됨

* HAVING

  그루핑 후 적용

* WHERE

  그루핑 전 적용

* 조인문

  GROUP BY 는 기준이 필요함. 그외는 *



# IS NULL

* IF(조건, TRUE일때값, FALSE일때값)



# JOIN

* A LEFT OUTER JOIN B ON A.ID = B.ID
* A RIGHT OUTER JOIN B ON A.ID = B.ID
* A INNER JOIN B ON A.ID = B.ID



join할 때 A를 select~where 쓰지말자

join한 다음 where문으로 걸러주자



# String, Date

* CONCAT()

* LOWER()

* UPPER()

* SUBSTR(STR,이상위치,이하위치)

  1부터 시작

* DATE_FORMAT()

  * %Y : 2024, %y : 24
  * %M : 04, %m : 
  * %D : 26, %d : 

* YEAR()

* MONTH()

* DAY()

* DATEDIFF(A,B)

  