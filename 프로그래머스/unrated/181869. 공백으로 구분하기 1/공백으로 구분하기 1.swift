import Foundation

func solution(_ my_string:String) -> [String] {
    
    var temp = [String]()
    
    temp = my_string.components(separatedBy: " ")
    
    return temp
}
