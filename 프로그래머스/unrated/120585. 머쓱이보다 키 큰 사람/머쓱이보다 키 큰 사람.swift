import Foundation

func solution(_ array:[Int], _ height:Int) -> Int {
    
    var result = 0
    
    for i in array {
        if height < i {
            result += 1
        } else {
            continue
        }
    }
    return result
}
