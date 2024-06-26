import Foundation

func solution(_ num_list:[Int]) -> Int {
    var sum = num_list.reduce(0, +)
    var sumMul = num_list.reduce(1, *)
    var sumPow = pow(Double(sum), 2)
    
    
    return sumMul < Int(sumPow) ? 1 : 0
}