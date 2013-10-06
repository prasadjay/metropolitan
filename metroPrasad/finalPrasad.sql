create table generator
(
gID varchar(20) PRIMARY KEY,
gName varchar(50),
frequency varchar(10),
voltage varchar(10),
phaseCurrent varchar(10),
sPower varchar(10),
pPower varchar(10),
maxCurrent varchar(10),
gAvailability varchar(10)
);

create table engineGen
(
eID varchar(20) PRIMARY KEY,
brand varchar(50),
model varchar(50),
version varchar(50),
fuel varchar(10),
tankSize varchar(10),
consumption varchar(20),
displacement varchar(20),
aspiration varchar(20),
geneID varchar(10) REFERENCES generator(gID)
);

create table dimension
(
dID varchar(20) PRIMARY KEY,
length varchar(10),
width varchar(10),
height varchar(10),
dryWeight varchar(10),
genID varchar(10) REFERENCES generator(gID)
);

create table alternator
(
aID varchar(20) PRIMARY KEY,
brand varchar(50),
model varchar(50),
class varchar(10),
ipProtection varchar(10),
poles varchar(10),
voltageTolarence varchar(10),
genID varchar(10) REFERENCES generator(gID)
);





-- projectss.....................................................................................


create table project
(
pID varchar(50) PRIMARY KEY,
pName varchar(150),
pSdate date,
pGdate date,
pGsupplier varchar(50),
pStatus varchar(50),
pAvailability varchar(50),
pEndDate varchar(20)
);



create table project
(
pID varchar(50) PRIMARY KEY,
pName varchar(150),
pSdate date,
pGdate date,
pGsupplier varchar(50),
pStatus varchar(50),
pAvailability varchar(50),
pEndDate date
);

create table item
(
iID varchar(50) PRIMARY KEY,
iName varchar(150),
iGdate date,
iSupplier varchar(50),
iQtyA varchar(50),
iQtyR varchar(50),
pStatus varchar(50),
iPID varchar(50) references project(pID)
);

create table supplier
(
sID varchar(50) PRIMARY KEY,
sName varchar(150),
sOtherName varchar(50),
sMobile varchar(50),
sOffice varchar(50),
sEmail varchar(50),
sAddress varchar(50)
);
