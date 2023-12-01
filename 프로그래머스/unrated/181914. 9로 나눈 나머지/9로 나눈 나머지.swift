import Foundation

func solution(_ number:String) -> Int {
    
    var temp = Int(number)
    var arr = Array(String(number).compactMap{Int(String($0))})
    return arr.reduce(0, +) % 9
}