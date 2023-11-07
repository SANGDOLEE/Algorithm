import Foundation

func solution(_ my_string:String, _ index_list:[Int]) -> String {
    
    var result = ""
    for i in index_list {
        var ch = my_string.index(my_string.startIndex, offsetBy: i)
        result.append(my_string[ch])
    }
    return result
}
