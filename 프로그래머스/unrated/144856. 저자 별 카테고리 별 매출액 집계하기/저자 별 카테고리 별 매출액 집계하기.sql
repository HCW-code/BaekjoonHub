-- 코드를 입력하세요
SELECT a.AUTHOR_ID, b.AUTHOR_NAME, a.CATEGORY, SUM(c.SALES * a.PRICE) as TOTAL_SALES FROM BOOK as a
JOIN AUTHOR as b
on a.AUTHOR_ID = b.AUTHOR_ID
JOIN BOOK_SALES as c
on a.BOOK_ID = c.BOOK_ID
WHERE DATE_FORMAT(c.SALES_DATE, '%Y-%m') = '2022-01'
GROUP BY AUTHOR_NAME, CATEGORY
ORDER BY AUTHOR_ID, CATEGORY DESC