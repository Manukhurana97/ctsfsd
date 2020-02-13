var Rectangle = /** @class */ (function () {
    function Rectangle(l, h) {
        this.len = l;
        this.hght = h;
    }
    // @ts-ignore
    Rectangle.prototype.getArea = function () {
        var area = this.len * this.hght;
        return area;
    };
    Rectangle.prototype.getparam = function () {
        return 2 * (Number(this.len) * Number(this.hght));
    };
    return Rectangle;
}());
var obj = new Rectangle(10, 200);
var area = obj.getArea();
console.log(area);
var area1 = obj.getparam();
console.log(area1);
