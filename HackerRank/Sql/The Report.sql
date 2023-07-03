SELECT IF(g.grade < 8, NULL, s.name), g.grade, s.marks
FROM students AS s
JOIN grades AS g
WHERE s.marks BETWEEN g.min_mark AND g.max_mark
ORDER BY g.grade DESC, s.name ASC;
