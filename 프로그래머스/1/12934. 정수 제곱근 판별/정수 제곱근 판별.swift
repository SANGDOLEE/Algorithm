func solution(_ n:Int64) -> Int64 {
    for i in 1...n {
        if i*i == n {
            return Int64((i+1)*(i+1))
        }
        if n < i*i {
            return -1
        }
    }
    return 0
}