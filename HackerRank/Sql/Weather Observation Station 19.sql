SELECT round(sqrt(POWER(abs(MIN(s.lat_n) - MAX(s.lat_n)), 2) + POWER(abs(MIN(s.long_w) - MAX(s.long_w)), 2)), 4) 
FROM station AS s;