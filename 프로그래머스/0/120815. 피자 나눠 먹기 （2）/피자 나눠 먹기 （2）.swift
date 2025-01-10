import Foundation

func solution(_ n:Int) -> Int {
    return lcm(6, n) / 6
}

// 최대공약수
func gcd(_ a: Int,_ b: Int) -> Int {
    if b == 0 { return a }
    return gcd(b, a%b)
}

// 최소공배수
func lcm(_ a: Int,_ b: Int) -> Int {
    return a*b / gcd(a,b)
}