SELECT MEMBER_ID, MEMBER_NAME, GENDER, 
DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m%-%d') 
from MEMBER_PROFILE
where TLNO is not null 
and DATE_OF_BIRTH like '%-03-%' 
and GENDER = 'W'
order by GENDER;