/*
 * Complete the Rectangle function
 */
function Rectangle(a, b) {
    var area = a * b;
    var perimeter = 2*(a + b);
    var rec = {
        'length' : a,
        'width': b,
        'area' : area,
        'perimeter': perimeter
    }
    return rec;
}