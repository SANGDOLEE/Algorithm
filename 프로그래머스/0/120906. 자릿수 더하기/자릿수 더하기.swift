import Foundation

func solution(_ n:Int) -> Int {
    var answer = 0 
    let text = String(n)
    let array = text.compactMap { Int(String($0)) }
    for i in array {
        answer += i
    }
    return answer
}