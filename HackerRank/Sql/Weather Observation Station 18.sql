SELECT round(abs(MIN(s.lat_n) - MAX(s.long_w)) + 
abs(MIN(s.long_w) - MAX(s.lat_n)), 4) 
FROM station AS s;

 
