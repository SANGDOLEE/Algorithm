import Foundation

func solution(_ n:Int) -> Int {
    var answer = 0
    var y = n
    for i in 1...n {
        if n % i == 0 {
            answer += 1
        }
    }
    return answer
}