func solution(_ s:String) -> Bool {
    var answer = false
    if s.count == 4 || s.count == 6 {
        
        answer = s.allSatisfy({ $0.isNumber })
    }
    return answer
}