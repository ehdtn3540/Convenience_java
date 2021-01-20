select * from conborder;
--drop table conborder;

CREATE TABLE CONBORDER(
    mIDX NUMBER(4), --PK
    bIDX NUMBER(4) PRIMARY KEY, --PK
    bTITLE VARCHAR2(100), --제목
    bCONTEXT VARCHAR2(100), --본문
    bDATE DATE DEFAULT SYSDATE --작성일
);

create sequence seq_conborder  nocache nocycle;
drop sequence seq_conborder;


INSERT INTO CONBORDER(mIDX, bIDX, bTITLE, bCONTEXT) 
VALUES (1, seq_conborder.nextval, '첫번째 테스트', '첫번째 테스트 본문 입니다111');
INSERT INTO CONBORDER(mIDX, bIDX, bTITLE, bCONTEXT) 
VALUES (2, seq_conborder.nextval, '두번째 테스트', '두번째 테스트 본문 입니다222');
INSERT INTO CONBORDER(mIDX, bIDX, bTITLE, bCONTEXT) 
VALUES (3, seq_conborder.nextval, '세번째 테스트', '세번째 테스트 본문 입니다333');

--SELECT * FROM CONBORDER WHERE mID = 'admin' AND mPASS = '2';