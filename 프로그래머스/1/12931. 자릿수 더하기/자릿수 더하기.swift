import Foundation

func solution(_ n:Int) -> Int {
    var answer = 0
    
    for i in String(n) {
        if let digit = Int(String(i)) {
            answer += digit
        }
    }
    
    return answer
}
