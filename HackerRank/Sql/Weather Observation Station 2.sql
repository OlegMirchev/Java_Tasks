SELECT round(SUM(s.lat_n), 2), round(SUM(s.long_w), 2) 
FROM station AS s;