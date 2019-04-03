# Solution: 
DELETE FROM Person
WHERE Id IN
(SELECT * FROM
(SELECT a.Id FROM Person a, Person b
WHERE a.Id > b.Id AND a.Email = b.Email ) AS temp);

# Results:
# Runtime: 594 ms, faster than 79.64% of MySQL online submissions for Delete Duplicate Emails.
# Memory Usage: N/A
