import Foundation

func solution(_ sides:[Int]) -> Int {
    
    var array:[Int] = sides.sorted()
    
    if array[0]+array[1] > array[2] {
        return 1
    } else {
        return 2
    }
}
