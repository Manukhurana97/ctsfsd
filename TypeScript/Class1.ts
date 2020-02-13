class Rectangle
{
    len: number;
    hght: number;

    constructor(l, h) {
        this.len = l;
        this.hght = h;
    }

    // @ts-ignore
    getArea(): Number{
        let area = this.len*this.hght;
        return area;
    }

    getparam(): any{
        return 2*(Number(this.len)*Number(this.hght));
    }
}

var obj = new Rectangle(10, 200);

var area = obj.getArea();
console.log(area);

var area1= obj.getparam();
console.log(area1);