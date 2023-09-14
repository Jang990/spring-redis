-- basic
INSERT INTO student
(student_number, name, age)
VALUES
(20011010, "김민석", 10),
(20022020, "장정석", 12),
(20033030, "장민석", 10),
(20044040, "김현민", 15),
(20055050, "정민우", 10),
(20066060, "김경호", 11),
(20077070, "김민호", 20),
(20088080, "이영호", 20),
(20099090, "김상호", 20),
(20101111, "김김김", 20);

INSERT INTO student
(student_number, name, age)
VALUES
(2111111, "장장장", 33),
(2222222, "장장장", 33),
(2333333, "장장장", 33),
(2444444, "장장장", 33),
(2555555, "장장장", 33),
(2666666, "장장장", 33),
(2777777, "장장장", 33),
(2888888, "장장장", 33),
(2999999, "장장장", 33);


-- Gaja
INSERT INTO group_set
(group_id, name)
VALUES
(7, '그룹1'),
(8, '그룹2'),
(9, '그룹3');

INSERT INTO client
(client_id, x, y, name, phone_number, group_id)
VALUES
-- 그룹 7에 대한 클라이언트 데이터 (7개)
(54, 127.132607, 37.535065, '홍길동', '010-5454-5454', 7),
(55, 127.147611, 37.536394, '김영희', '010-5555-5555', 7),
(56, 127.084310, 37.516308, '이철수', '010-5656-5656', 7),
(57, 127.093958, 37.502040, '박지영', '010-5757-5757', 7),
(58, 127.124298, 37.378697, '김민수', '010-5858-5858', 7),
(59, 127.114524, 37.378697, '이나영', '010-5959-5959', 7),
(60, 126.772477, 37.670337, '김지은', '010-6060-6060', 7),
-- 그룹 8에 대한 클라이언트 데이터 (8개)
(61, 127.000348, 37.507322, '홍길동', '010-6161-6161', 8),
(62, 127.011595, 37.512156, '김영희', '010-6262-6262', 8),
(63, 127.053697, 37.514365, '이철수', '010-6363-6363', 8),
(64, 127.036891, 37.500310, '박지영', '010-6464-6464', 8),
(65, 127.137428, 37.379239, '김민수', '010-6565-6565', 8),
(66, 127.114524, 37.378697, '이나영', '010-6666-6666', 8),
(67, 126.772477, 37.670337, '김지은', '010-6767-6767', 8),
(68, 126.740572, 37.679873, '최민우', '010-6868-6868', 8),
-- 그룹 9 데이터
(69, 126.951546, 37.544237, '홍길동', '010-6969-6969', 9),
(70, 126.864087, 37.556014, '김영희', '010-7070-7070', 9),
(71, 126.933003, 37.571476, '이철수', '010-7171-7171', 9),
(72, 126.913470, 37.582384, '박지영', '010-7272-7272', 9),
(73, 127.133379, 37.275905, '김민수', '010-7373-7373', 9),
(74, 127.205479, 37.235462, '이나영', '010-7474-7474', 9),
(75, 126.772477, 37.670337, '김지은', '010-7575-7575', 9),
(76, 126.820242, 37.668157, '최민우', '010-7676-7676', 9),
(77, 126.741063, 37.680606, '김현수', '010-7777-7777', 9);