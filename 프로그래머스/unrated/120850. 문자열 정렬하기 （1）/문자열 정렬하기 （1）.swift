import Foundation

func solution(_ my_string:String) -> [Int] {
    
    var arr = Array(my_string)
    
    var answer = [Int]()
    
    for i in arr {
        if let digit = Int(String(i)) {
            answer.append(digit)
        }
    }
    answer.sort()
    return answer
}
