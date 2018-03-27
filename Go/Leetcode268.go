func missingNumber(nums []int) int {
    l := len(nums)
    totalSum := (l* (l+1))/2

    innerSum := 0
    for _, element := range nums {
        innerSum += element
    }

    return totalSum - innerSum
}
