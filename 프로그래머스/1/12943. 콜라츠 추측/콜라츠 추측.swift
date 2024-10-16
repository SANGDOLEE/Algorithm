func solution(_ num:Int) -> Int {
    var count = 0
    var temp = num
    while(temp != 1){
        count += 1
        if temp % 2 == 0 { temp = temp/2}
        else { temp = temp*3 + 1}
        
        if count == 500 {
            return -1
        }
    }
    return count
}