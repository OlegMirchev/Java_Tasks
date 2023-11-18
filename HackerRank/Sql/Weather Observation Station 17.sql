SELECT round(s.long_w, 4) FROM station AS s
WHERE s.lat_n = (SELECT MIN(st.lat_n) FROM station AS st
WHERE st.lat_n > 38.7780);
 
