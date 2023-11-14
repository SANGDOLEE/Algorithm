import Foundation

func solution(_ names:[String]) -> [String] {
    
    var result = [String]()
    
    var index = 0
    
    for i in names {
        if index == 0 {
            result.append(i)
        }
        index += 1
        if index == 5 {
            index = 0
        }
    }
    return result
}
