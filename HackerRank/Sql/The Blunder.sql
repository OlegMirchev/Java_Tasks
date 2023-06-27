SELECT floor((AVG(e.salary)) - AVG(replace(e.salary, 0, '')))
FROM employees AS e;
