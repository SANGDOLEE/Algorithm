import Foundation

func solution(_ n:Int) -> Int {
    
    var answer = 0
    for i in 1...n {
        var arr = method(i)
        if arr.count > 2 { answer += 1}
    }
    return answer
}
func method(_ k:Int) -> [Int] {
    (1...k).filter{ k % $0 == 0}
}