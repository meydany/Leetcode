import (
    "math"
)

func lengthOfLongestSubstring(s string) int {
    var c int = 0
    l := make(map[byte]int)
    j := 0
    for i :=0; i < len(s); i++ {
        _, exists := l[s[i]]
        if exists {
            n := l[s[i]] + 1
            if n >= j + 1 {
                j = n
            }
            delete(l, s[i])
        }
        c1 := i-j + 1
        if c1 > c {
            c = c1
        }
        l[s[i]] = i
    }
    return c
}
