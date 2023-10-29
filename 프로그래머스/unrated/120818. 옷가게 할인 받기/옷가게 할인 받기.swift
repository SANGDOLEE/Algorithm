import Foundation

func solution(_ price:Int) -> Int {
    
    var discount:Double = 0.0
    
    if price < 100000 {
        return price
    } else if price >= 500000 {
        discount = Double(price) * 0.2
    } else if price >= 300000 {
        discount = Double(price) * 0.1
    } else if price >= 100000 {
        discount = Double(price) * 0.05
    }
    return Int(Double(price) - discount)
}