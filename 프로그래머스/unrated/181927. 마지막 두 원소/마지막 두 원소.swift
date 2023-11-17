import Foundation

func solution(_ num_list:[Int]) -> [Int] {
    var array = num_list

    let a = num_list[num_list.count - 1]
    let b = num_list[num_list.count - 2]

    if a > b {
        array.append(a - b)
    } else {
        array.append(a * 2)
    }

    return array
  
}
