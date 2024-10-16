func solution(_ x:Int) -> Bool {
    var temp = String(x).compactMap{ $0.wholeNumberValue }.reduce(0, +)
    
    return x % temp == 0
}