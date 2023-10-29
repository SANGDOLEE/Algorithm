import Foundation

func solution(_ my_string:String) -> Int {
    
    var sum = 0
    
    for i in my_string { // 한자리 자연수로만 구성
        if i.isNumber {
            sum += Int(String(i))!
        }
    }
    return sum
}