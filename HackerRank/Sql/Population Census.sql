SELECT SUM(ci.population) FROM city AS ci
JOIN country AS co ON co.code = ci.countrycode
WHERE co.continent LIKE 'Asia';