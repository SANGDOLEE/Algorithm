import Foundation

func solution(_ hp:Int) -> Int {
    var highAnt = hp / 5
    var midAnt = (hp%5) / 3
    var lowAnt = ((hp%5)%3)
    return highAnt + midAnt + lowAnt 
}