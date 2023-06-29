SELECT concat(o.name, '(', UPPER(substr(o.occupation, 1, 1)), ')') FROM occupations AS o
ORDER BY o.name ASC;

SELECT concat('There are a total of ', COUNT(o.occupation), ' ', lower(o.occupation), 's.') 
FROM occupations AS o
GROUP BY o.occupation
ORDER BY COUNT(o.occupation) ASC, o.occupation ASC;

