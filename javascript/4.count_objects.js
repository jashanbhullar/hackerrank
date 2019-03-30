/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 * 
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
    var count = 0;
    for(var ob of objects){
        if(ob.x == ob.y){
            count++;
        }
    }
    return count;
    
}