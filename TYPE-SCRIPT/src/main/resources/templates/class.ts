class Student
{
    private rollNumber:number;
    private stdName:string;
    constructor(enrollment:number,name:string)
    {
        this.rollNumber=enrollment;
        this.stdName=name;
    }
    getName():string
    {
        return this.stdName;
    }
    getRollNumber():number
    {
        return this.rollNumber;
    }
}
let std:Student=new Student(1,"Keshav");
console.log(std.getName());
console.log(std.getRollNumber());