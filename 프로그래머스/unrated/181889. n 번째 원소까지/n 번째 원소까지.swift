import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [Int] {
    
    return Array(num_list.prefix(n))
}
/*
import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [Int] {
    
    return [Int](num_list.prefix(n))
}

*/