--------------------------------------------------------
--  DDL for Table STUDENT_PHONE
--------------------------------------------------------

  CREATE TABLE "STUDENT_PHONE" 
   (	"STUDENT_ID" NUMBER(25,0), 
	"PHONE_ID" NUMBER(25,0)
   );
--------------------------------------------------------
--  DDL for Table STUDENT
--------------------------------------------------------

  CREATE TABLE "STUDENT" 
   (	"ID" NUMBER(19,0), 
	"NAME" VARCHAR2(255 CHAR)
   )  ;
--------------------------------------------------------
--  DDL for Table PHONE
--------------------------------------------------------

  CREATE TABLE "PHONE" 
   (	"ID" NUMBER(19,0), 
	"PHONE_NUM" VARCHAR2(255 CHAR), 
	"TYPE" VARCHAR2(255 CHAR)
   )  ;
   

Insert into SYSTEM.STUDENT_PHONE (STUDENT_ID,PHONE_ID) values (1,1);
Insert into SYSTEM.STUDENT_PHONE (STUDENT_ID,PHONE_ID) values (1,2);
Insert into SYSTEM.STUDENT_PHONE (STUDENT_ID,PHONE_ID) values (2,2);
Insert into SYSTEM.STUDENT_PHONE (STUDENT_ID,PHONE_ID) values (2,1);

Insert into SYSTEM.STUDENT (ID,NAME) values (1,'student1');
Insert into SYSTEM.STUDENT (ID,NAME) values (2,'student2');
Insert into SYSTEM.STUDENT (ID,NAME) values (3,'student3');

Insert into SYSTEM.PHONE (ID,PHONE_NUM,TYPE) values (1,'123','sony');
Insert into SYSTEM.PHONE (ID,PHONE_NUM,TYPE) values (2,'124','moto');
Insert into SYSTEM.PHONE (ID,PHONE_NUM,TYPE) values (3,'125','nokia');
Insert into SYSTEM.PHONE (ID,PHONE_NUM,TYPE) values (4,'126','apple');
Insert into SYSTEM.PHONE (ID,PHONE_NUM,TYPE) values (5,'127','redmi');

--------------------------------------------------------
--  Constraints for Table STUDENT_PHONE
--------------------------------------------------------
  ALTER TABLE "STUDENT_PHONE" MODIFY ("PHONE_ID" NOT NULL ENABLE);
  ALTER TABLE "STUDENT_PHONE" MODIFY ("STUDENT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STUDENT
--------------------------------------------------------
  CREATE UNIQUE INDEX "SYS_C008568" ON "STUDENT" ("ID")  ;
  ALTER TABLE "STUDENT" ADD PRIMARY KEY ("ID");
  ALTER TABLE "STUDENT" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "STUDENT" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PHONE
--------------------------------------------------------
  CREATE UNIQUE INDEX "SYS_C008565" ON "PHONE" ("ID")  ;
  ALTER TABLE "PHONE" ADD PRIMARY KEY ("ID");
  ALTER TABLE "PHONE" MODIFY ("TYPE" NOT NULL ENABLE);
  ALTER TABLE "PHONE" MODIFY ("PHONE_NUM" NOT NULL ENABLE);
  ALTER TABLE "PHONE" MODIFY ("ID" NOT NULL ENABLE);
