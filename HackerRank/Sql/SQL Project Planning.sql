SELECT p1.start_date, p2.end_date 
FROM (SELECT start_date, ROW_NUMBER() OVER(ORDER BY start_date ASC) AS id
FROM projects
WHERE start_date NOT IN (SELECT end_date FROM projects)) AS p1
JOIN 
(SELECT end_date, ROW_NUMBER() OVER(ORDER BY end_date ASC) AS id
FROM projects
WHERE end_date NOT IN (SELECT start_date FROM projects)) AS p2
ON p1.id = p2.id
ORDER BY p2.end_date - p1.start_date,  p1.start_date ASC;
 