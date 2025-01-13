import Foundation

func solution(_ date1:[Int], _ date2:[Int]) -> Int {
  // 순차적으로 year, month, day를 비교
    if date1[0] < date2[0] {
        return 1
    } else if date1[0] == date2[0] {
        if date1[1] < date2[1] {
            return 1
        } else if date1[1] == date2[1] {
            return date1[2] < date2[2] ? 1 : 0
        }
    }
    return 0
}