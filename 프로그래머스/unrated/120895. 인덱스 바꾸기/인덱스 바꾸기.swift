import Foundation

func solution(_ my_string:String, _ num1:Int, _ num2:Int) -> String {
    
    var a = my_string.index(my_string.startIndex, offsetBy: num1)
    var b = my_string.index(my_string.startIndex, offsetBy: num2)
    
    var answer = my_string
    
    let ch1 = my_string[a]
    let ch2 = my_string[b]
    
    answer.replaceSubrange(a...a, with: String(ch2))
    answer.replaceSubrange(b...b, with: String(ch1))
    return answer
}
