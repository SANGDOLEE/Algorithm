import Foundation

func solution(_ age:Int) -> String {
    var str = "abcdefghij"
    var arrayStr = Array(str)
    
    var temp = String(age)
    
    var answer = "" 
    for i in temp {
        if let index = Int(String(i)) {
        answer.append(arrayStr[index])
        }
    }
    return answer
}