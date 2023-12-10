SELECT round(s.lat_n, 4) FROM station AS s
WHERE 
(SELECT COUNT(lat_n) FROM station WHERE lat_n < s.lat_n) =
(SELECT COUNT(lat_n) FROM station WHERE lat_n > s.lat_n);
