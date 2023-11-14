import Foundation

func solution(_ my_string:String, _ is_suffix:String) -> Int {
    
    var length: Int = is_suffix.count
    
    var temp:String = String(my_string.suffix(length))

    
    
    return (temp == is_suffix) ? 1 : 0
}
