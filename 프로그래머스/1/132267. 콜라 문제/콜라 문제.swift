import Foundation

func solution(_ a:Int, _ b:Int, _ n:Int) -> Int {
    var nowbottle = n
    var count = 0
    
    while nowbottle >= a{
        count += (nowbottle / a) * b
        nowbottle = nowbottle - (nowbottle / a * a) + ((nowbottle / a) * b)
    }
    return count
}