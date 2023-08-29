SELECT DISTINCT s.city FROM station AS s
WHERE s.city NOT LIKE '%a' AND s.city NOT LIKE '%e' AND s.city NOT LIKE '%i' AND 
s.city NOT LIKE '%o' AND s.city NOT LIKE '%u';