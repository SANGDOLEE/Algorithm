import Foundation

func solution(_ arr1:[Int], _ arr2:[Int]) -> Int {
    
    var result = 0
    if arr1.count != arr2.count {
        result = arr1.count > arr2.count ? 1 : -1
    } else {
        
        var sum_arr1 = arr1.reduce(0,+)
        var sum_arr2 = arr2.reduce(0,+)
        
        if sum_arr1 > sum_arr2 {
            result = 1
        } else if sum_arr1 < sum_arr2 {
            result = -1
        } else {
            result = 0
        }
    }
    return result
}
