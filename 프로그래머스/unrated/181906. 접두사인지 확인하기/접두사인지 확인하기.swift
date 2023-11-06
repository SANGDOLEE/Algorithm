import Foundation

func solution(_ my_string:String, _ is_prefix:String) -> Int {
    
    var index:Int = is_prefix.count
    
    var pre = my_string.prefix(index)
    
    return (pre.elementsEqual(is_prefix)) ? 1 : 0
}
