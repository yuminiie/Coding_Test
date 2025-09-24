SELECT BOOK.CATEGORY , sum(bs.SALES) TOTAL_SALES 
from BOOK
    join BOOK_SALES bs
        on BOOK.BOOK_ID = bs.BOOK_ID
    where SALES_DATE like '2022-01-%'
    group by BOOK.CATEGORY
    order by BOOK.CATEGORY;