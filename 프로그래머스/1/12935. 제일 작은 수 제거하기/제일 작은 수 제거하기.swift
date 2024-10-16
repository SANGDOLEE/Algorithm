func solution(_ arr:[Int]) -> [Int] {
    
    if arr.count == 1 {
        return [-1]
    }
    
    var minValue = arr.min() ?? 0
    return arr.filter{ $0 != minValue }
    
}