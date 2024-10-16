func solution(_ a:Int, _ b:Int) -> Int64 {
    
    let start = min(a, b)
    let end = max(a, b)
    
    let n = end - start + 1
    let sum = n * (start + end) / 2
    return Int64(sum)
}