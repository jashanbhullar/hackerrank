/*
 * Determine the original side lengths and return an array:
 * - The first element is the length of the shorter side
 * - The second element is the length of the longer side
 * 
 * Parameter(s):
 * literals: The tagged template literal's array of strings.
 * expressions: The tagged template literal's array of expression values (i.e., [area, perimeter]).
 */
function sides(literals, ...expressions) {
    var A = expressions[0];
    var P = expressions[1];
    var s = [];
    s[0] = (P - Math.sqrt((P*P - 16*A)))/4;
    s[1] = (P + Math.sqrt((P*P - 16*A)))/4;
    return s;
    
}