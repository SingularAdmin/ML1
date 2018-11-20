CREATE TABLE `users` (
	`username` VARCHAR(50) NOT NULL,
	`password` VARCHAR(50) NOT NULL,
	`name` VARCHAR(50) NOT NULL,
	`surname` VARCHAR(50) NOT NULL,
	`id_num` VARCHAR(20) NOT NULL,
	`date_of_birth` VARCHAR(10) NOT NULL,
	`sex` VARCHAR(10) NOT NULL,
	`phone_num` BIGINT(15) NOT NULL,
	`email` VARCHAR(50) NOT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;