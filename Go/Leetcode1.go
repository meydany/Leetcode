import "fmt"

func twoSum(nums []int, target int) []int {
    compliments := make(map[int]int)

    for index, element := range nums {
        compliment := target - element
        if index1, present := compliments[compliment]; present {
            return []int{index1, index}
        }else {
            compliments[element] = index
        }
    }
    return []int{}
}
