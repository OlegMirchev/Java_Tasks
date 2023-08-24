SELECT DISTINCT s.city FROM station AS s
WHERE lower(SUBSTR(s.city, 1, 1)) IN ('a','e','i','o','u') AND
lower(SUBSTR(s.city, length(s.city), length(s.city))) 
IN ('a','e','i','o','u');