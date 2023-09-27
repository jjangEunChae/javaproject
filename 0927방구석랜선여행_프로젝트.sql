create database project;

use project;

create table `payment`(
	`name` VARCHAR(10) NOT NULL,
    `phone` VARCHAR(11) NOT NULL,
    `card_num` VARCHAR(16) NOT NULL,
    `cvc` VARCHAR(3) NOT NULL,
    `card_pw` VARCHAR(20) NOT NULL
);

select * from payment;

insert into payment(name, phone, card_num, cvc, card_pw)
values('이름', '전화번호', '카드번호', 'cvc', '결제 비밀번호');

show tables;

# test
insert into payment(name, phone, card_num, cvc, card_pw)
values('장은채', '01012341234', '1234123456785678', '123', '1234');

-- # test : 설정한 글자크기 넘어가면 등록이 안됨
-- insert into payment(name, phone, card_num, cvc, card_pw)
-- values('장은채', '0101234123411', '123412345678567811', '1231', '1234');


-- # 개인정보 마스킹하여 저장하는 코드(개조중..)
-- select project, replace(phone,(phone,2),'**') from data limit 11;
-- select payment, phone, substring(phone,1,3),replace(phone,right(phone,2),'**') from data where phone LIKE '01%';
-- select project, replace(phone,substring(phone,5,2),'**') from data limit 11;
-- select payment, replace(phone,right(phone,2),'**');

