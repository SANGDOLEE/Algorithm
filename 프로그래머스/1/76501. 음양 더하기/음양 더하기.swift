import Foundation

func solution(_ absolutes:[Int], _ signs:[Bool]) -> Int {
    var sum = 0
    for (index, isPositive) in signs.enumerated() {
        if isPositive {
            sum += absolutes[index]
        } else {
            sum -= absolutes[index]
        }
    }
    return sum
}