SELECT 
    B.TITLE, 
    B.BOARD_ID, 
    R.REPLY_ID, 
    R.WRITER_ID, 
    R.CONTENTS, 
    DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
    from USED_GOODS_BOARD B
        join USED_GOODS_REPLY R
            on B.BOARD_ID = R.BOARD_ID
    where B.CREATED_DATE like '2022-10-%'
    order by R.CREATED_DATE, B.TITLE;
            