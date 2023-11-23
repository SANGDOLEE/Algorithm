import Foundation

func solution(_ a:Int, _ b:Int) -> Int {
    var sum = Int(String(a)+String(b))!
    
    return sum > 2*a*b ? sum : 2*a*b
}
