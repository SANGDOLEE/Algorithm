import Foundation

func solution(_ num_list:[Int]) -> [Int] {
   var arrays = num_list
    
    // 옵셔널 바인딩을 사용하여 안전하게 값 추출
    if let last = num_list.last {
        let secondLast = num_list[num_list.count - 2]
        let temp = last > secondLast ? last - secondLast : last * 2
        arrays.append(temp)
    }
    
    return arrays
}