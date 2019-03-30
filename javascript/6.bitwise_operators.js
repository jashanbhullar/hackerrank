/*
*	Return the largest value of any a & b < k in S (where a < b).
* 	
*	n: Set S is a sequence of distinct integers from 1 to n (i.e., {1, 2, ..., n}).
*	k: An integer.
*/
function getMaxLessThanK(n, k) {
    var ans = 0;
    for(var i=1 ;i < n ;i++){
        for(var j=i+1;j<=n;j++){
            var val = i & j;
            //console.log(i,j);
            if(val > ans && val < k){
                ans = val;
            }
        }
    }
    return ans;
    
}