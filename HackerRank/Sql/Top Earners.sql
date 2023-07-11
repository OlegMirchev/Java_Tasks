SELECT MAX(e.salary * e.months), COUNT(e.name)
FROM employee AS e
WHERE e.salary * e.months = (SELECT MAX(e.salary * e.months) FROM employee AS e);
