/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    var a = 0;
    var b = 0;
    for(let ob of nums){
        if( ob > a){
            b = a;
            a = ob;
        }
        else if( ob > b && ob != a){
            b = ob;
        }
    }
    return b;
}