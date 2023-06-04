SELECT co.continent, floor(AVG(ci.population)) FROM city AS ci
JOIN country AS co ON co.code = ci.countrycode
GROUP BY co.continent;