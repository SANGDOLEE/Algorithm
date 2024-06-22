import Foundation

func solution(_ n:Int) -> [Int] {
    var array: [Int] = []
    for i in 0...n {
        if i%2 == 1 {
            array.append(i)
        }
    }
    return array
}