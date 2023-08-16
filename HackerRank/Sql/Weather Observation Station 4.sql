SELECT s.city, length(s.city) FROM station AS s
ORDER BY s.city, length(s.city) ASC LIMIT 1;

SELECT s.city, length(s.city) FROM station AS s
ORDER BY s.city, length(s.city) DESC LIMIT 1;


