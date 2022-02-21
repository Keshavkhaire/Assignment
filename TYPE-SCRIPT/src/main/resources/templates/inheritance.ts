class Person{
    name : string;
    constructor(name:string){
        this.name=name;
    }
}
class CompanyEmployee extends Person{
    empCode:number;
    constructor(code:number, empName:string){
        super(empName);
        this.empCode=code;
    }
    displayName():void{
        console.log(this.empCode+", "+this.empCode);
    }
}
let newObj:CompanyEmployee=new CompanyEmployee(1,"Keshav");
newObj.displayName();