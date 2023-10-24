import Foundation

func solution(_ num_list:[Int]) -> [Int] {
    
    var array: [Int] = []
    
    var x = 0
    var y = 0
    
    for i in num_list {
        if i%2==0 {
            x += 1
        } else {
            y+=1
            
        }
    }
    array.append(x)
    array.append(y)
    
    return array
}
