# Implementation:
# Write your MySQL query statement below
UPDATE salary
SET sex = CASE
            WHEN sex = "m" THEN "f"
            ELSE "m"
          END;

 # Results:
# Runtime: 159 ms, faster than 55.86% of MySQL online submissions for Swap Salary.
# Memory Usage: N/A