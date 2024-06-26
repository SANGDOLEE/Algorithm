import Foundation

func solution(_ a:Int, _ b:Int) -> Int {
    var temp: String = String(a) + String(b)
    var num = Int(temp) ?? 0 
    var calc = 2*a*b
    
    return num > calc ? num : calc
}