import Foundation

func solution(_ myString:String) -> [Int] {
    var str: [String] = myString.components(separatedBy: "x")
    var answer = [Int]()
    for i in 0..<str.count {
        answer.append(str[i].count)
    }
    return answer
}