function add(a: Number, b:Number) {
    // @ts-ignore
    console.log(a+b);
};

let output = (x: Number, y: Number)=>
{
    add(x, y)
};

output(10, 20);

//------------------------------------------------

interface Dim {
    a1: number,
    b1: number
}

function draw(dim:Dim) {
    console.log(dim)

    console.log(dim.a1+dim.b1)
}

draw({
    a1:100, b1:200
});


//------------------------------------------------

