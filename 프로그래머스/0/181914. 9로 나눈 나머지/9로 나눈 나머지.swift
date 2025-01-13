import Foundation

func solution(_ number:String) -> Int {
    var answer = [Int]()
    let result = number.compactMap { $0.wholeNumberValue }
    for i in result {
        answer.append(Int(i))
    }
    return answer.reduce(0, +) % 9
}