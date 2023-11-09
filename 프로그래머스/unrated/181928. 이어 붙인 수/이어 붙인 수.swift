import Foundation

func solution(_ num_list:[Int]) -> Int {
    
    var odd = ""
    var even = ""
    
    for i in num_list{
        if i%2 == 0 {
            even += String(i)
        } else {
            odd += String(i)
        }
    }
    var result: Int = 0
    
    if let evenSum = Int(even), let oddSum = Int(odd) {
        result = evenSum + oddSum
    }
    return result
}
