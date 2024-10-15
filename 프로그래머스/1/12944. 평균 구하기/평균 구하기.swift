func solution(_ arr:[Int]) -> Double {
    var answer: Double = Double(arr.reduce(0, +)) / Double(arr.count)
    return answer
}