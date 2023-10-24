import Foundation

func solution(_ strlist:[String]) -> [Int] {
    
    var array : [Int] = []
    
    for i in strlist {
        array.append(i.count)
    }
    return array
}
