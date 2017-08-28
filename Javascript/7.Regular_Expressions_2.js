function regexVar() {
    /*
     * Declare a RegExp object variable named 're'
     * It must match a string that starts with 'Mr.', 'Mrs.', 'Ms.', 'Dr.', or 'Er.', 
     * followed by one or more letters.
     */
    var re = /^[MDE](rs|r|s|)\.[a-zA-Z]*$/g;
    
    /*
     * Do not remove the return statement
     */
    return re;
}