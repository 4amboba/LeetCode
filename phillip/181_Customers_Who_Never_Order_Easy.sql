# Solution:
SELECT Name as Customers
FROM Customers
WHERE Id != ALL (SELECT CustomerId FROM Orders);

# Results:
# Runtime: 250 ms, faster than 81.00% of MySQL online submissions for Customers Who Never Order.
# Memory Usage: N/A