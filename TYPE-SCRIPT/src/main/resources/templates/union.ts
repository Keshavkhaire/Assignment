let code:(string | number | boolean);
code = false;
code = 344;
code ="Tarkesh";
// code= [3,4,5,5];  // not allowed to assign the number
function checkDataType(code){
    if (typeof(code)==='number')
    {
        console.log("Code is a number");
    }
    else if(typeof(code)==='string'){
        console.log("Code is type of String");
    }
    else if(typeof(code)==='boolean'){
        console.log("Code is type of boolean");
    }
    else{
        console.log("Code is somthing else");
    }
}
 
checkDataType(2);
checkDataType("Keshav");
checkDataType(true);
checkDataType([4,5,6,7,4]);


