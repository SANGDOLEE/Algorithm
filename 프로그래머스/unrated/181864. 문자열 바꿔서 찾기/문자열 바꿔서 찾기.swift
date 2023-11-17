import Foundation

func solution(_ myString:String, _ pat:String) -> Int {
    
    var result = ""
    for i in myString {
        if i == "A" {
            result += "B"
        } else {
            result += "A"
        }
    }
    return result.contains(pat) ? 1 : 0
}
