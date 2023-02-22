-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.ANIMAL_TYPE, a.NAME FROM ANIMAL_INS as a
JOIN ANIMAL_OUTS as b
ON a.ANIMAL_ID = b.ANIMAL_ID
WHERE a.SEX_UPON_INTAKE != b.SEX_UPON_OUTCOME
ORDER BY ANIMAL_ID