import Foundation

func solution(_ arr:[Int], _ n:Int) -> [Int] {
    
    var result = [Int]()
    
    if arr.count % 2 == 0 { // 짝수면
        for i in 0..<arr.count {
            if i%2 == 1 {
                result.append(arr[i] + n)
            } else {
                result.append(arr[i])
            }
        }
    } else { // 홀수면
        for i in 0..<arr.count {
            if i%2 == 0 {
                result.append(arr[i]+n)
            } else {
                result.append(arr[i])
            }
        }
    }
    return result
}
