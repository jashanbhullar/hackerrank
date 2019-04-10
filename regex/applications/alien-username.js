function processData(input) {
    const [n, ...inputs] = input.split('\n');
    const regex = /^[_\.][0-9]+[a-zA-Z]*[\_]?$/gm;
    for (const input of inputs) {
        console.log(input.match(regex) ? 'VALID' : 'INVALID');
    }
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
