// 929. Unique Email Addresses - Easy

// Initial thoughts: 
// Use a hashmap to store all the unique strings and then iterate through the 
// ashmap again to find the number of unique combinations of local name and 
// domain names.

// Implementation:

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0 ; i < emails.length; i++) {
            String[] splitted = emails[i].split("@");
            splitted[0] = splitted[0].split("\\+")[0].replace(".", "");
            if (!map.containsKey(splitted[0])) {
                map.put(splitted[0], new ArrayList<String>());
                map.get(splitted[0]).add(splitted[1]);
            } else {
                if (!map.get(splitted[0]).contains(splitted[1])) {
                    map.get(splitted[0]).add(splitted[1]);
                }
            }
        }
        Iterator<String> iter = map.keySet().iterator();
        int count = 0;
        while (iter.hasNext()) {
            count = count + map.get(iter.next()).size();
        }
        return count;
    }
}

// Afterthoughts:
// The way I used the hashmap seemed really inefficient, having to get the 
// eyset and then use an iterator to go through the whole hashmap again. Maybe 
// it would have been better to use an entry set instead to directly get the 
// list.

// Results:
// Runtime: 23 ms, faster than 69.82% of Java online submissions for Unique 
// Email Addresses.
// Memory Usage: 39.8 MB, less than 48.75% of Java online submissions for 
// Unique Email Addresses.