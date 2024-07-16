import Foundation

func solution(_ my_string:String) -> [String] {
    var answer: [String] = []
    var temp: [String] = my_string.components(separatedBy:" ")
    for i in temp {
        if i.count > 0 && i != " " {
            i.components(separatedBy: " ")
            answer.append(i)
        }
    }
    
    return answer
}