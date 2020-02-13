// Let vs VS

//declare
let a;

let b: Number;
let c: String;
let d: any;
let e: any[] = [1, "a", true];
let f: Number[] = [1, 2, 3];

const aa = "abc";

enum color {Red,Green, Yellow, Blue}

console.log(e, f, color.Blue);


// initialization
a = 10;


function hello() {
    for (var i = 0; i < 5; i++) {
        console.log(i)
    }
    console.log("outside " + i);
}

// call
hello();
