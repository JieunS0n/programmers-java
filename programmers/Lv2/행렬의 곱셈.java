class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1Width = arr1.length;
        int arr1Height = arr1[0].length;
        int arr2Width = arr2.length;
        int arr2Height = arr2[0].length;
        
        int[][] answer = new int[arr1Width][arr2Height];
        
        for(int i=0; i<arr1Width; i++)
        {
            for(int j=0; j<arr2Height; j++)
            {   
                for(int k=0; k<arr1Height; k++)
                {
                    answer[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return answer;
    }
}
