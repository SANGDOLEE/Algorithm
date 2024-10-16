func solution(_ n:Int64) -> [Int] {
    let digits = String(n).compactMap { $0.wholeNumberValue }
    
    return digits.reversed()
}