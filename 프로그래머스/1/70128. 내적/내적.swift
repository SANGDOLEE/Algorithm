import Foundation

func solution(_ a:[Int], _ b:[Int]) -> Int {
    var sum = 0
    for (index, i) in a.enumerated() {
        sum += a[index]*b[index] 
    }
    return sum
}