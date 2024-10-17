func solution(_ n:Int) -> String {
    var length = n/2
    var subak = String(repeating: "수박", count: length)
    
    return n%2 == 0 ? subak : subak + "수"
}