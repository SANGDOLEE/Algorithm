import Foundation

func solution(_ num_list:[Int], _ n:Int) -> Int {
    
    if let num = num_list.firstIndex(of: n) {
        return 1
    } else {
        return 0
    }
    
}