import Foundation

func solution(_ num_str:String) -> Int {
    
    // 문자열을 정수로 변환하여 배열에 저장
    let numArray = num_str.compactMap { Int(String($0)) }

    // 배열의 합을 구함
    let sum = numArray.reduce(0, +)

    return sum
}
