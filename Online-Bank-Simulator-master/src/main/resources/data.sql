INSERT INTO `onlinebanking`.`role` (`role_id`, `name`) VALUES (1,'ROLE_USER');

-- to increase the account_balance

UPDATE `onlinebanking`.`primary_account` SET `account_balance`='289383.00' WHERE `id`='1';

UPDATE `onlinebanking`.`savings_account` SET `account_balance`='2000' WHERE `id`='1';

