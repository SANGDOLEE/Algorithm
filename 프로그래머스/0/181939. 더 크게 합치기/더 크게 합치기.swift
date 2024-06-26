import Foundation

func solution(_ a:Int, _ b:Int) -> Int {
    var numA = Int(String(a)+String(b))! 
    var numB = Int(String(b)+String(a))!

    return numA > numB ? numA : numB
}