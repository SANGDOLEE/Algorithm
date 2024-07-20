import Foundation

func solution(_ strArr:[String]) -> [String] {
    
    var index = 1
    var result:[String] = []
    for i in strArr {
        var temp = index % 2 == 0 ? i.uppercased() : i.lowercased() 
        result.append(temp)
        index += 1
    }
    return result
}