import Foundation
func solution(_ array:[Int], _ n:Int) -> Int {
    var k = 0
    for i in array{
        if i == n {
            k += 1
        }
    }
    return k
}
