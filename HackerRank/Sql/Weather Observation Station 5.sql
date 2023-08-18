SELECT s.city, length(s.city) FROM station AS s
ORDER BY length(s.city), s.city LIMIT 1;

SELECT s.city, length(s.city) FROM station AS s
ORDER BY length(s.city) DESC, s.city LIMIT 1;



