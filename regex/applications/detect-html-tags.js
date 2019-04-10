function processData(input) {
    const re = /<\s*([a-z][a-z0-9]*)[^>]*>/ig;
    const tagSet = new Set();
    let match = null;
    while ((match = re.exec(input)) !== null) {
        tagSet.add(match[1]);
    }
    console.log(Array.from(tagSet).sort().join(';'));
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
