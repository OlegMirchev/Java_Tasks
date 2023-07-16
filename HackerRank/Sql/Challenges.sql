SELECT h.hacker_id, h.name, COUNT(c.challenge_id) total_challenges
FROM hackers AS h
JOIN challenges AS c ON c.hacker_id = h.hacker_id
GROUP BY c.hacker_id, h.name
HAVING total_challenges = (SELECT COUNT(c1.challenge_id) FROM challenges AS c1
GROUP BY c1.hacker_id
ORDER BY COUNT(*) DESC LIMIT 1)
OR total_challenges NOT IN (SELECT COUNT(c2.challenge_id) FROM challenges AS c2
GROUP BY c2.hacker_id
HAVING c2.hacker_id <> c.hacker_id)
ORDER BY total_challenges DESC, c.hacker_id;
