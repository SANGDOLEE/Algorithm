import Foundation

func solution(_ numbers:[Int], _ direction:String) -> [Int] {
     var answer = [Int]()
     if direction == "right" {
         var temp = numbers[numbers.count - 1]
         answer.append(temp)
         for i in 0..<numbers.count-1{
             answer.append(numbers[i])
         }
     } else {
        var temp = numbers[0]
       for i in 1..<numbers.count {
          answer.append(numbers[i])   
       }   
         answer.append(temp)
     }
    
    return answer 
}