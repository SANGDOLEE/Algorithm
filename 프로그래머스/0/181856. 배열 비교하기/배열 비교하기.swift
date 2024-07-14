import Foundation

func solution(_ arr1:[Int], _ arr2:[Int]) -> Int {
    
   if arr1.count == arr2.count {
       var temp1 = arr1.reduce(0, +)
       var temp2 = arr2.reduce(0, +)
       return temp1 == temp2 ? 0 : temp1 > temp2 ? 1 : -1
   } else {
       return arr1.count > arr2.count ? 1 : -1
   }
}