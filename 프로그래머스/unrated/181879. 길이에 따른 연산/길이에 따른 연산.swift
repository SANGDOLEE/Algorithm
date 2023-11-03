import Foundation

func solution(_ num_list:[Int]) -> Int {
    
    var result = 0
    
    if num_list.count > 10 {
        result = num_list.reduce(0,+)
    } else {
        result = num_list.reduce(1,*)
    }
    return result
}
