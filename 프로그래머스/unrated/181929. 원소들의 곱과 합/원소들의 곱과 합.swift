import Foundation

func solution(_ num_list:[Int]) -> Int {
    
    var multi = num_list.reduce(1, *)
    var sum = num_list.reduce(0,+)
    
    return (multi < sum * sum) ? 1 : 0
}
