import Foundation

func solution(_ numbers:[Int]) -> Double {
    var sum = 0
    for i in numbers{
        sum += i
    }
    print(sum)
    return Double(sum)/Double(numbers.count)
}
