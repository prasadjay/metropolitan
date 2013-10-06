
insert into Generator values('Generator1','GSW355M', '45', '61.58', '208', '3', '60', '975.21','YES' );
insert into Generator values('Generator2','GSL42D', '39.43', '41.42', '400', '3', '50', '59.79','YES' );
insert into Generator values('Generator3','G5L65D', '23', '63.21', '400', '3', '50', '91.24','YES' );
insert into Generator values('Generator4','GBW10P', '110', '10.75', '480', '3', '60', '14.31','YES' );
insert into Generator values('Generator5','GSW560V', '160', '556.37', '400', '3', '60', '95.21','YES' );
insert into Generator values('Generator6','GSW10P', '10', '100', '210', '3', '50', '15.05','YES' );
insert into Generator values('Generator7','GSF202D', '85', '125', '485', '3', '60', '30.85','YES' );
insert into Generator values('Generator8','DBWS415Y', '200', '150', '391', '3', '50', '24.54','YES' );
insert into Generator values('Generator9','GSA67665K', '240', '280', '400', '3', '60', '22.01','YES' );


insert into engineGen values('Engine1', 'MTV', '6R1-600-GT05', '60', 'Diesel', '50' , '10' , '3000' , 'Turbo', 'Generator1');
insert into engineGen values('Engine2', 'Deutz', 'BF4M2011', '50', 'Diesel', '10' , '3000' , '5000', 'Turbo', 'Generator2');
insert into engineGen values('Engine3', 'Deutz', 'BF4M2011C', '50', 'Diesel','10' , '3000' , '2000',  'Turbo', 'Generator3');
insert into engineGen values('Engine4', 'Perkins', '403D-11G', '60', 'Diesel', '10' , '3000' , '3000', 'Turbo', 'Generator4');
insert into engineGen values('Engine5', 'Volvo', 'TAD1641GE', '60', 'Diesel', '10' , '3000' , '4000', 'Turbo', 'Generator5');
insert into engineGen values('Engine6', 'Perkins', '403D-11G', '50','Diesel', '10' , '3000' , '5000', 'Turbo', 'Generator6');
insert into engineGen values('Engine7', 'Deutz', 'F3L2011D', '60','Diesel', '10' , '3000' , '6000', 'Turbo', 'Generator7');
insert into engineGen values('Engine8', 'Yanmar', '3TNV88-BGP', '50', 'Diesel','10' , '3000' , '15000',  'Turbo', 'Generator8');
insert into engineGen values('Engine9', 'Volvo', 'FAT6854DF-GH', '60', 'Diesel','10' , '3000' , '9000',  'Turbo', 'Generator9');


insert into Alternator values('Alternator1', 'Yanmar', 'Eco-3','H', 'YES', '4', 'NO', 'Generator1' );
insert into Alternator values('Alternator2', 'Yanmar', 'Eco-4','A', 'YES', '4', 'NO', 'Generator2' );
insert into Alternator values('Alternator3', 'Yanmar', 'Eco-5','S', 'YES', '4', 'NO', 'Generator3' );
insert into Alternator values('Alternator4', 'Yanmar', 'Eco-6','B', 'YES', '4', 'NO', 'Generator4' );
insert into Alternator values('Alternator5', 'Yanmar', 'Eco-7','A', 'YES', '4', 'NO', 'Generator5' );
insert into Alternator values('Alternator6', 'Yanmar', 'Eco-8','E', 'YES', '4', 'NO', 'Generator6' );
insert into Alternator values('Alternator7', 'Yanmar', 'Eco-9','H', 'YES', '4', 'NO', 'Generator7' );
insert into Alternator values('Alternator8', 'Yanmar', 'Eco-1','V', 'YES', '4', 'NO', 'Generator8' );
insert into Alternator values('Alternator9', 'Yanmar', 'Eco-2','H', 'YES', '4', 'NO', 'Generator9' );


insert into dimension values('Dimension1', '3950', '2175', '3740', '5000', 'Generator1');
insert into dimension values('Dimension2', '2005', '1308', '824', '5000', 'Generator2');
insert into dimension values('Dimension3', '2294', '1007', '981', '5000', 'Generator3');
insert into dimension values('Dimension4', '1646', '885', '385', '5000', 'Generator4');
insert into dimension values('Dimension5', '4400', '1560', '4495', '5000', 'Generator5');
insert into dimension values('Dimension6', '1805', '889', '745', '5000', 'Generator6');
insert into dimension values('Dimension7', '1400', '1700', '510', '5000', 'Generator7');
insert into dimension values('Dimension8', '1500', '1250', '800', '5000', 'Generator8');
insert into dimension values('Dimension9', '1800', '1552', '1120', '5000', 'Generator9');




