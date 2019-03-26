# Solution182
SELECT Email FROM Persion GROUP BY Email HAVING count(Email) > 1;

# solution620
SELECT * FROM cinema WHERE mod(cinema.id, 2) = 1 AND description != 'boring' ORDER BY rating DESC;

