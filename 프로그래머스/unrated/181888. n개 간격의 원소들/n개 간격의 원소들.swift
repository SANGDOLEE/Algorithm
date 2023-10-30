import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [Int] {
    
    var array:[Int] = []
    var count = 0
   
    while count < num_list.count {
        array.append(num_list[count])
        count += n
    }
    return array
}
