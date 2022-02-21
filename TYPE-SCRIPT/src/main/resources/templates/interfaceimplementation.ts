
interface IEmployee
   {​​​​​

    empCode:number;

    empName:string;

    getsalray:(number) => number;

    getEmpName(number):string;  // abstract function

}​​​​​

let obj:IEmployee ={​​​​​empCode:1,

                    empName:"keshav",

                    getsalray(num):number
                    {​​​​​

                        return 100;

                    }​​​​​,

                    getEmpName(number):string{​​​​​

                        return "keshav";

                        }​​​​​

                    }​​​​​;

console.log(obj.getEmpName(1));

console.log(obj);

console.log(obj.empCode);

console.log(obj.empName);


class Employee implements IEmployee
 {​​​​​

    empCode: number;

    empName: string;

    constructor(empCode: number, empName: string)
 {​​​​​

        this.empCode = empCode;   
  }​​​​​

    getsalray(num): number
 {​​​​​
  return 100;
 }​​​​​

    getEmpName(number): string
 {​​​​​

        return "keshav";
 }​​​​​

}​​​​​

