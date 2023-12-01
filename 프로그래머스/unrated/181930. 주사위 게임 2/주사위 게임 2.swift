import Foundation

func solution(_ a:Int, _ b:Int, _ c:Int) -> Int {
    
    if a != b && b != c && a != c {
        return one(a,b,c)
    } else if a == b && b == c {
        return three(a,b,c)
    } else {
        return two(a,b,c)
    }
    return 0
}

func one(_ a: Int, _ b: Int, _ c : Int) -> Int {
    return a+b+c
}
func two(_ a: Int, _ b: Int, _ c : Int) -> Int {
    return one(a,b,c) * (a*a+b*b+c*c)
}
func three(_ a: Int, _ b: Int, _ c : Int) -> Int {
    return (a+b+c)*(a*a+b*b+c*c) * (a*a*a + b*b*b + c*c*c)
}