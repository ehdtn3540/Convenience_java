select * from conproduct;
--drop table conproduct;

CREATE TABLE CONPRODUCT(
    pID NUMBER(4) PRIMARY KEY, --상품아이디
    pNAME VARCHAR2(100), --상품이름
    pPRICE NUMBER(10), --가격
    pIMAGE1 VARCHAR2(4000), --이미지1
    pDETAIL CLOB, --상세설명
    pRDATE DATE DEFAULT SYSDATE, --등록일
    pCATEGORY VARCHAR2(100) --카테고리
);

create sequence seq_conpid  nocache nocycle;
drop sequence seq_conpid;

INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥1', 1600, '1.jpg', '상세설명1', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥2', 1700, '2.jpg', '상세설명2', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥3', 1800, '3.jpg', '상세설명3', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥4', 1100, '4.jpg', '상세설명4', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥5', 1200, '5.jpg', '상세설명5', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥6', 1300, '6.jpg', '상세설명6', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥7', 1400, '7.jpg', '상세설명7', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥8', 1500, '8.jpg', '상세설명8', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥9', 1600, '9.jpg', '상세설명9', SYSDATE, '삼각김밥');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '삼각김밥0', 1700, '0.jpg', '상세설명0', SYSDATE, '삼각김밥');

INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '컵라면1', 1700, 'r1.jpg', '상세설명1', SYSDATE, '라면');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '컵라면2', 1700, 'r2.jpg', '상세설명2', SYSDATE, '라면');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '컵라면3', 1700, 'r3.jpg', '상세설명3', SYSDATE, '라면');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '컵라면4', 1700, 'r4.jpg', '상세설명4', SYSDATE, '라면');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '컵라면5', 1700, 'r5.jpg', '상세설명5', SYSDATE, '라면');

INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '음료1', 1700, 'd1.jpg', '상세설명1', SYSDATE, '음료');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '음료2', 1700, 'd2.jpg', '상세설명2', SYSDATE, '음료');
INSERT INTO CONPRODUCT(pID, pNAME, pPRICE, pIMAGE1, pDETAIL, pRDATE, pCATEGORY) 
VALUES (seq_conpid.nextval, '음료3', 1700, 'd3.jpg', '상세설명3', SYSDATE, '음료');