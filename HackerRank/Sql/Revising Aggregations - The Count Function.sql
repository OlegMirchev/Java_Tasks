SELECT COUNT(c.population) FROM city AS c
GROUP BY c.population
HAVING c.population > 100000;

