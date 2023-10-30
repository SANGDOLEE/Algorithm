import Foundation

func solution(_ arr:[Int]) -> [Int] {
    
    var array:[Int] = []
    
    for i in arr {
        if i<50 && i%2 == 1 {
            array.append(i*2)
        } else if i>49 && i%2 == 0 {
            array.append(i/2)
        } else {
            array.append(i)
        }
    }
    return array
}
