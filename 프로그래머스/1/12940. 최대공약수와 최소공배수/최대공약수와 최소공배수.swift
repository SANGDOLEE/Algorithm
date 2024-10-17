func solution(_ n:Int, _ m:Int) -> [Int] {
    var x = gcd(n, m)
    var y = min(n, m)
    return [x, y]
}

func gcd(_ a: Int,_ b: Int) -> Int {
    if b == 0 { return a }
    return gcd(b, a%b)
}

func min(_ a: Int,_ b: Int) -> Int {
    return a*b / gcd(a,b)
}