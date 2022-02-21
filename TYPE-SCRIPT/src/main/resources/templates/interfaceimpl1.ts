interface Iperson
{
    name:string;
    display():void;
}
interface IEmployee1
{
    empCode:number;
}
class Employee1 implements IEmployee1,Iperson
    {
    empCode:number;
    name: string;
    constructor(empcode:number, empname:string)
    {
        this.empCode=empcode;
        this.name=empname;
    }
    display():void{
        console.log(this.empCode+", "+this.name);
    }
}
let yourObj:Iperson=new Employee1(1,"keshav");
let yourObj1:IEmployee1=new Employee1(2,"Barua");
yourObj.display();
console.log(yourObj1.empCode);