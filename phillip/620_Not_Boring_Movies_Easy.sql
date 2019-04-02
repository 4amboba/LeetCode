# Solution:
SELECT *
FROM cinema
WHERE (id % 2 != 0) AND (description != "boring")
ORDER BY rating DESC;

# Results:
# Runtime: 138 ms, faster than 48.10% of MySQL online submissions for Not Boring Movies.
# Memory Usage: N/A