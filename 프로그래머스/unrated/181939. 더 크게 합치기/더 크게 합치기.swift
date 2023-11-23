import Foundation

func solution(_ a:Int, _ b:Int) -> Int {
    
    var temp1 = String(a)+String(b)
    var temp2 = String(b)+String(a)
    
    if let sum1 = Int(temp1), let sum2 = Int(temp2) {
        return max(sum1, sum2)
    } else {
        return 0
    }
    
}
