-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d'),
IF(OUT_DATE IS NULL, '출고미정', IF(DATE_FORMAT(OUT_DATE, '%Y-%m-%d') > '2022-05-01', '출고대기', '출고완료'))
as '출고여부' from FOOD_ORDER
ORDER BY ORDER_ID