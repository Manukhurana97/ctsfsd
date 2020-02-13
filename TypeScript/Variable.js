// Let vs VS
//declare
var a;
var b;
var c;
var d;
var e = [1, "a", true];
var f = [1, 2, 3];
var aa = "abc";
var color;
(function (color) {
    color[color["Red"] = 0] = "Red";
    color[color["Green"] = 1] = "Green";
    color[color["Yellow"] = 2] = "Yellow";
    color[color["Blue"] = 3] = "Blue";
})(color || (color = {}));
console.log(e, f, color.Blue);
// initialization
a = 10;
function hello() {
    for (var i = 0; i < 5; i++) {
        console.log(i);
    }
    console.log("outside " + i);
}
// call
hello();
