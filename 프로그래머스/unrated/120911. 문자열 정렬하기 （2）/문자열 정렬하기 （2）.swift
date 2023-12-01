import Foundation

func solution(_ my_string:String) -> String {
    var temp = my_string.lowercased()
    var arr = Array(temp).sorted()
    
    return String(arr)
}