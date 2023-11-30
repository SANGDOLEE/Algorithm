import Foundation

func solution(_ myString:String) -> [String] {
    
    
    var temp = myString.split(separator: "x").map{String($0)}
    
    temp.sort()
    
    return temp
}
