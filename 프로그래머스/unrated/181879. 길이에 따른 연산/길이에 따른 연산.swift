import Foundation

func solution(_ num_list:[Int]) -> Int {
    
    var result = 1
    
    if num_list.count > 10 {
        result = num_list.reduce(0,+)
    } else {
        for i in num_list {
            result = result * i
        }
    }
    return result
}
