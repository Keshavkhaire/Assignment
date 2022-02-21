
interface IEmployee{​​​​​    empCode:number;

    empName:string;

    //salray:(number) => number;

    getEmpName(number):string;  // abstract function
  }​​​​​

let obj:IEmployee ={​​​​​empCode:1,

                    empName:"keshav",

                    getEmpName(number):string{​​​​​return "keshav";}​​​​​}​​​​​;

console.log(obj.getEmpName);

console.log(obj);

console.log(obj.empCode);

console.log(obj.empName);

