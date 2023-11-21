import Foundation

func solution(_ arr1:[Int], _ arr2:[Int]) -> Int {
    
    var result = 0
    if arr1.count != arr2.count {
        result = arr1.count > arr2.count ? 1 : -1
    } else {
        
        var sum_arr1 = arr1.reduce(0,+)
        var sum_arr2 = arr2.reduce(0,+)
        
        result = sum_arr1 == sum_arr2 ? 0 : sum_arr1 > sum_arr2 ? 1 : -1
    }
    return result
}
