function processData(input) {
    const subwords = [];

    const tmp = input.split('\n').reverse();
    for (let i = 0; i < tmp.length; i++) {
        //Break if line is a number
        if (!isNaN(tmp[i])) {
            break;
        }
        subwords.push(tmp[i]);
    }

    subwords.reverse().forEach(subword => {
        let thisRegExp = new RegExp('\\w+' + subword + '\\w+', 'gm');
        console.log(input.match(thisRegExp) ? input.match(thisRegExp).length : 0);
    });
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
