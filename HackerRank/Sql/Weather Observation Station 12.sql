SELECT DISTINCT s.city FROM station AS s
WHERE lower(substr(s.city, 1, 1)) NOT IN ('a','e','i','o','u')
AND substr(s.city, length(s.city), length(s.city)) 
NOT IN ('a','e','i','o','u');