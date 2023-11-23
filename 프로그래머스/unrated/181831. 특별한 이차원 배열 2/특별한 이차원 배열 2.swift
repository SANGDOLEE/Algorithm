import Foundation

func solution(_ arr:[[Int]]) -> Int {
    
    var numRows = arr.count
    var numCols = arr[0].count
    
    for i in 0..<numRows {
        for j in 0..<numCols {
            if arr[i][j] != arr [j][i] {
                return 0
            }
        }
    }
    return 1
}
