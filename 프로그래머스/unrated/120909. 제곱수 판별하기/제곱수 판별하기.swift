import Foundation

func solution(_ n:Int) -> Int {
    
    var temp = 0
    var answer = 2
    for i in 1...n {
        temp = i * i
        if temp == n {
            answer = 1
        } else if temp > n {
            break
        }
    }
    return answer
    
}
