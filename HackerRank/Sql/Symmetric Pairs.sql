SELECT DISTINCT f1.x, f1.y FROM functions AS f1
JOIN functions AS f2 ON f2.x = f1.y AND f1.x = f2.y
WHERE f1.x <= f1.y
GROUP BY f1.x, f1.y
HAVING COUNT(f1.x) > 1 AND COUNT(f1.y) > 1 OR f1.x != f1.y
ORDER BY f1.x ASC;