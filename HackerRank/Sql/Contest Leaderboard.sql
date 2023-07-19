SELECT s.hacker_id, h.name, SUM(s.max_score) AS 'total_score' FROM hackers AS h
JOIN (SELECT hacker_id, challenge_id, MAX(score) AS 'max_score'
FROM submissions 
GROUP BY hacker_id, challenge_id) AS s ON s.hacker_id = h.hacker_id
GROUP BY h.hacker_id, h.name
HAVING total_score > 0
ORDER BY total_score DESC, h.hacker_id ASC;