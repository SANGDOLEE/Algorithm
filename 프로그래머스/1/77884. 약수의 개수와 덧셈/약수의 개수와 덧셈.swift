import Foundation

func solution(_ left:Int, _ right:Int) -> Int {
    var sum = 0
    for i in left...right { 
        var length = getDivisors(of: i)
        if length.count % 2 == 0 {
            sum += i
        } else { 
            sum -= i
        }
    }
    
    return sum
}

func getDivisors(of number: Int) -> [Int] {
    var divisors: [Int] = []
    for i in 1...number {
        if number % i == 0 {
            divisors.append(i)
        }
    }
    return divisors
}