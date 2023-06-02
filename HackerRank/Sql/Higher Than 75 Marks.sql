SELECT s.name FROM students AS s
WHERE s.marks > 75
ORDER BY right(s.name, 3), s.id ASC;

SELECT s.name FROM students AS s
WHERE s.marks > 75
ORDER BY substr(s.name, -3), s.id ASC;

SELECT s.name FROM students AS s
WHERE s.marks > 75
ORDER BY substr(s.name, length(s.name) - 2, 3), s.id ASC;