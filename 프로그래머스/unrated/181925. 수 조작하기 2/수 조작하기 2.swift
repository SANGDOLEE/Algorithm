import Foundation

func solution(_ numLog:[Int]) -> String {
    
    var answer = ""
    
    for i in 1..<numLog.count {
        
        var temp = numLog[i] - numLog[i-1]
        
        if temp == 1 {
            answer.append("w")
        } else if temp == -1 {
            answer.append("s")
        } else if temp == 10 {
            answer.append("d")
        } else {
            answer.append("a")
        }
    }
    
    return answer
}
