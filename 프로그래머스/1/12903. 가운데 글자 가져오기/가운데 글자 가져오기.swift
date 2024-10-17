func solution(_ s:String) -> String {
    var answer = ""
    var temp = Array(s)
    if temp.count % 2 == 0 {
        answer.append(temp[temp.count/2-1])
        answer.append(temp[temp.count/2])
    } else { 
        answer.append(temp[temp.count/2])
    }
    
    return answer
}