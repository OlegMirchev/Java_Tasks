SELECT w.id, wp.age, w.coins_needed, w.power FROM wands AS w
JOIN wands_property AS wp ON wp.code = w.code
WHERE wp.is_evil = 0 AND w.coins_needed = (SELECT MIN(wa.coins_needed) 
FROM wands AS wa
JOIN wands_property AS wap ON wap.code = wa.code
WHERE w.power = wa.power AND wp.age = wap.age)
ORDER BY w.power DESC, wp.age DESC;
