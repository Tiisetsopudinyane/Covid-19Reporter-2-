create table national(id identity primary key, 
					rdate date,
					confirmed_cases int(255),
					recovered int(255),
					deaths int(255),
					new_cases int(255),
					hospitalized int(255)
					);

create table age_general(id identity primary key,
						age_class varchar(20),
						male_cases int(255),
						male_deaths int(255),
						female_cases int(255),
						female_deaths int(255),
						total_cases int(255)
						);

create table age_regional(id identity primary key,
						region varchar(255),
						class1 varchar(255),
						class2 varchar(255),
						class3 varchar(255),
						class4 varchar(255),
						class5 varchar(255),
						class6 varchar(255),
						class7 varchar(255),
						class8 varchar(255),
						class9 varchar(255),
						class10 varchar(255)
						);

create table regional(rcode int(255) primary key, 
						rname varchar(255),
						rdate date,
						confirmed_cases int(255),
						recovered int(255),
						deaths int(255),
						hospitalized int(255),
						new_cases int(255)
						);
						
						
						
