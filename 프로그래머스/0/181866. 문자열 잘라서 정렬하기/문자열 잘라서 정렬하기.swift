import Foundation

func solution(_ myString:String) -> [String] {
    var answer = myString.components(separatedBy: "x")
    return answer.filter { !$0.isEmpty }.sorted()
}