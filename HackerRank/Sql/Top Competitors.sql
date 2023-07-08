SELECT h.hacker_id, h.name
FROM hackers AS h
JOIN submissions AS s ON s.hacker_id = h.hacker_id
JOIN challenges AS c ON c.challenge_id = s.challenge_id
JOIN difficulty AS d ON d.difficulty_level = c.difficulty_level
WHERE s.score = d.score
GROUP BY s.hacker_id, h.name
HAVING COUNT(*) > 1
ORDER BY COUNT(*) DESC, s.hacker_id ASC;

