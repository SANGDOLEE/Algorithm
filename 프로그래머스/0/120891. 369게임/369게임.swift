import Foundation

func solution(_ order:Int) -> Int {
    
    var num = order
    var numArray: [Int] = []

    while num > 0 {
      numArray.insert(num % 10, at: 0)  // 나머지를 앞에 추가
      num /= 10  // 10으로 나누어 다음 자릿수로 이동
    }
    
    var answer = 0
    for i in numArray {
        if i == 3 || i == 6 || i == 9 {
            answer += 1
        }
    }
    
    return answer
}