# Leetcode

### 771

1. Brute force  
Use s.toCharArray() to travese the string.   
First travese J then S is more efficient than first S   then J.   

```java
class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> Jset = new HashSet();
        for (char j: J.toCharArray())
            Jset.add(j);

        int ans = 0;
        for (char s: S.toCharArray())
            if (Jset.contains(s))
                ans++;
        return ans;
    }
}
```

2. Hashset
   use hash set to store S and then check with J.

```java
class Solution {
    public int numJewelsInStones(String J, String S) {
        // hash set
        Set<Character> Jset = new HashSet();
        for (char j:J.toCharArray())
            Jset.add(j);
        
        int count=0;
        for (char s:S.toCharArray())
            if(Jset.contains(s))
                count++;
        return count;
    }
}
```
