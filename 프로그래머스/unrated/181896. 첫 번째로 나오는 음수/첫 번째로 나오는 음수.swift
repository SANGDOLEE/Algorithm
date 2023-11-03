import Foundation

func solution(_ num_list:[Int]) -> Int {
    
    var result = 0
    for i in num_list {
        if i<0 {
            break
        } else {
            result += 1
        }
    }
    if result == num_list.count && num_list[result-1] > 0 {
        result = -1
    }
    return result
}