import Foundation

func solution(_ numLog:[Int]) -> String {
    
    var answer = ""
    
    for i in 0..<numLog.count-1 {
        var temp = numLog[i+1]
        
        var length = temp - numLog[i]
        if length == 1 {
            answer.append("w")
        } else if length == -1 {
            answer.append("s")
        } else if length == 10 {
            answer.append("d")
        } else {
            answer.append("a")
        }
        
    }
    
    return answer
}