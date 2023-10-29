import Foundation

func solution(_ my_string:String, _ letter:String) -> String {
    
    var result:String = my_string.components(separatedBy: letter).joined()
    
    return result
}
