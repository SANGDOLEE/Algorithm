import Foundation

func solution(_ array:[Int], _ n:Int) -> Int {
    
    var result = 0
    
    for i in array {
        if i == n {
            result += 1
        }
        else {
            continue
        }
    }
    
    
    return result
}
