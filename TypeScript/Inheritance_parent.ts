export class Employee{
    constructor(
        public First_name:String,
        public Last_name:String,
        public email: String,
        public age: Number,
    ){}

    getFullName()
    {
        console.log(this.First_name+" "+this.Last_name)
    }
}


