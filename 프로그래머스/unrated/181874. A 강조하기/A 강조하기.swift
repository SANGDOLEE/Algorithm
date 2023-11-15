import Foundation

func solution(_ myString:String) -> String {
    
    var result = myString.lowercased()
    return result.replacingOccurrences(of: "a", with: "A")
}
