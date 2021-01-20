select * from conmember;
--drop table conmember;

CREATE TABLE CONMEMBER(
    mIDX NUMBER(4) PRIMARY KEY, --PK
    mID VARCHAR2(100), --아이디
    mPASS VARCHAR2(100), --비밀번호
    mNAME VARCHAR2(100), --이름
    mDATE DATE DEFAULT SYSDATE --가입일
);

create sequence seq_conmidx  nocache nocycle;
drop sequence seq_conmidx;


INSERT INTO CONMEMBER(mIDX, mID, mPASS, mNAME) 
VALUES (seq_conmidx.nextval, 'admin', '1', 'admin');
INSERT INTO CONMEMBER(mIDX, mID, mPASS, mNAME) 
VALUES (seq_conmidx.nextval, '1', '1', '홍길동1');
INSERT INTO CONMEMBER(mIDX, mID, mPASS, mNAME) 
VALUES (seq_conmidx.nextval, '2', '2', '홍길동2');

SELECT * FROM CONMEMBER WHERE mID = 'admin' AND mPASS = '2';