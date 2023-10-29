SELECT round(SUM(s.lat_n), 4) FROM station AS s
WHERE s.lat_n > 38.7880 AND s.lat_n < 137.2345;