import Foundation

func solution(_ s:String) -> Bool
{
    var lowercasedString = s.lowercased()

    var p_count = lowercasedString.filter{ $0 == "p"}.count
    var y_count = lowercasedString.filter{ $0 == "y"}.count   

    
    return p_count == 0 && y_count == 0 ? true : p_count == y_count ? true : false
}