import Foundation

func solution(_ age:Int) -> String {
    
    var alpha = ["a","b","c","d","e","f","g","h","i","j"]
    
    var answer = ""
    
    var arr = Array(String(age).compactMap{ Int(String($0))})
    for i in arr {
        answer.append(alpha[i])
    }
    
    return answer
}
