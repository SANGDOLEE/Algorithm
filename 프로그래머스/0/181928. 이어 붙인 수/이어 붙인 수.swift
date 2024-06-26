import Foundation

func solution(_ num_list:[Int]) -> Int {
    let even = num_list.filter { $0 % 2 == 0 }.map { String($0) }.joined()
    let odd = num_list.filter { $0 % 2 == 1 }.map { String($0) }.joined()
    
    
    var evenInt = Int(even) ?? 0 
    var oddInt = Int(odd) ?? 0 
    
    return evenInt + oddInt
}