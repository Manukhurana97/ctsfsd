"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(First_name, Last_name, email, age) {
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.email = email;
        this.age = age;
    }
    Employee.prototype.getFullName = function () {
        console.log(this.First_name + " " + this.Last_name);
    };
    return Employee;
}());
exports.Employee = Employee;
