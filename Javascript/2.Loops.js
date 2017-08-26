/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
       var str = "";
       for(var i=0;i<s.length;i++){
           let val = s[i];
           if(val =='a' || val =='b' || val =='e' || val =='i' || val =='o' || val =='u' )
               console.log(val);
           else
               str += val;
       }
       for(var i=0;i<str.length;i++){
           console.log(str[i]);
       }
}