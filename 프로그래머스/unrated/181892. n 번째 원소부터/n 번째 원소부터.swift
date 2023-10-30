import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [Int] {
    
    var count = num_list.count
    
    var array:[Int] = []
    
    for i in n...count{
        array.append(num_list[i-1])
    }
    return array
}
