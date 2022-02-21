enum FruitsName{
    // index numbers 
    Apple=5, Orange='Colour', Banana=0xff, Watermalon
}
 
function getWatermalon(): FruitsName{
    return FruitsName.Watermalon;
}
function getFruits1(): FruitsName{
    return 77;
}
let fruit: FruitsName= getWatermalon();
console.log("Fruit Name : "+fruit);
let fruit1: FruitsName= getFruits1();
console.log("Fruit1 Name : "+fruit1);
console.log("Get bY value Banana : "+FruitsName.Banana);
console.log("Get bY value Orange : "+FruitsName[66]);