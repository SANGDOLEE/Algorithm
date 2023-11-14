import Foundation

func solution(_ myString:String) -> String {
    
    var result = ""
    for char in myString {
        if let asciiValue = char.asciiValue {
            if (97..<108).contains(Int(asciiValue)){
                result.append("l")
            } else {
                result.append(char)
            }
        }else {
            print("error")
        }
    }
    return result
}
