import Foundation

func solution(_ order:Int) -> Int {
    var arr = Array(String(order).compactMap{Int(String($0))})
    var answer = 0
    for i in arr {
        if i != 0 && i%3==0 {
            answer += 1
        }
    }
    return answer
}
