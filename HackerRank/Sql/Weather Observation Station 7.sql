SELECT DISTINCT s.city FROM station AS s
WHERE s.city LIKE '%a' OR s.city LIKE '%e' OR s.city LIKE '%i' 
OR s.city LIKE '%o' OR s.city LIKE '%u';

SELECT DISTINCT s.city FROM station AS s 
WHERE lower(SUBSTR(s.city, length(s.city), length(s.city))) 
IN ('a','e','i','o','u');



