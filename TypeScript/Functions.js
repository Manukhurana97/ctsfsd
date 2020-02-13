function add(a, b) {
    // @ts-ignore
    console.log(a + b);
}
;
var output = function (x, y) {
    add(x, y);
};
output(10, 20);
function draw(dim) {
    console.log(dim);
    console.log(dim.a1 + dim.b1);
}
draw({
    a1: 100, b1: 200
});
//------------------------------------------------
