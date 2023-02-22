-- 코드를 입력하세요
SELECT a.APNT_NO,p.PT_NAME, a.PT_NO, a.MCDP_CD,
d.DR_NAME, a.APNT_YMD
from appointment a

join patient p
on p.PT_NO = a.PT_NO

join doctor d
on d.dr_id = a.MDDR_ID

where left(a.APNT_YMD,10) = '2022-04-13'
and a.MCDP_CD = 'CS' and APNT_CNCL_YN='N'

order by a.APNT_YMD