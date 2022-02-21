 interface KeyValueProcessor
 {  // functional interface   
  (key: number, value:string):void;
 };
function  addKeyValue(key:number, value:string):void
{
    console.log(key+", "+value);
}
function  updateKeyValue(key:number, value:string):void
{
    console.log(key+", "+value);
}
let myobj:KeyValueProcessor = addKeyValue;
myobj(1,"keshav");
let myobj1:KeyValueProcessor = updateKeyValue;
myobj(2,"keshav");