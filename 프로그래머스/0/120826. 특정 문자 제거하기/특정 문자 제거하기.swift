import Foundation

func solution(_ my_string:String, _ letter:String) -> String {
    
    let arr = Array(my_string)
    var answer = "" 
    
    for i in arr {
        if String(i) == letter {
            continue
        } else {
            answer.append(i)
        }
    }
    return answer
}