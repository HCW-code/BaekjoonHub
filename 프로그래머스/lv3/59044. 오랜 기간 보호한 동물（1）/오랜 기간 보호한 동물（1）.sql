-- 코드를 입력하세요
SELECT a.NAME, a.DATETIME FROM ANIMAL_INS  as a
LEFT JOIN ANIMAL_OUTS as b
ON b.ANIMAL_ID = a.ANIMAL_ID
where b.ANIMAL_ID IS NULL
ORDER BY DATETIME
LIMIT 3