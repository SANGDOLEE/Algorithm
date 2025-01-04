import Foundation

func solution(_ n:Int) -> Int {
    for i in 1...n {
        var sum = i*i
        if sum > n {
            return 2
        } else if sum == n {
            return 1
        } else {
            continue
        }
    }
    return 0
}