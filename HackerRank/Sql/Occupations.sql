SELECT 
MAX(if(o.occupation LIKE 'Doctor', o.name, NULL)) AS 'Dotor',
MAX(if(o.occupation LIKE 'Professor', o.name, NULL)) AS 'Professor',
MAX(if(o.occupation LIKE 'Singer', o.name, NULL)) AS 'Singer',
MAX(if(o.occupation LIKE 'Actor', o.name, NULL)) AS 'Actor'
FROM (SELECT *, ROW_NUMBER() OVER(PARTITION BY occupation ORDER BY name) AS oc
FROM occupations) AS o
GROUP BY oc;