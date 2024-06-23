import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    var temp: [Int] = []
    for i in numbers {
        temp.append(i*2)
    }
    return temp
}