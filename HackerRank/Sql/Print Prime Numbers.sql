DELIMITER ??
CREATE PROCEDURE print_prime_numbers(numb INT)
BEGIN
   DECLARE i INT DEFAULT 1;
   DECLARE j INT DEFAULT 1;
   DECLARE count_prime INT DEFAULT 0;
   DECLARE result TEXT DEFAULT '';
   
   WHILE(i < numb) DO
      SET j = 1;
      SET count_prime = 0;
      
      WHILE(j < i) DO
         IF(i % j = 0) THEN
            SET count_prime = count_prime + 1;
		 END IF;
         SET j = j + 1;
	  END WHILE;
      
      IF(count_prime = 1) THEN
		 SET result = CONCAT(result, i, '&');
	  END IF;
      SET i = i + 1;
   END WHILE;
   
   SELECT substr(result, 1, length(result) - 1);
   END ??
   
   CALL print_prime_numbers(1000);