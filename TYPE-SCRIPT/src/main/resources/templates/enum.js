var FruitsName;
(function (FruitsName) {
    // index numbers 
    FruitsName[FruitsName["Apple"] = 5] = "Apple";
    FruitsName["Orange"] = "Colour";
    FruitsName[FruitsName["Banana"] = 255] = "Banana";
    FruitsName[FruitsName["Watermalon"] = 256] = "Watermalon";
})(FruitsName || (FruitsName = {}));
function getWatermalon() {
    return FruitsName.Watermalon;
}
function getFruits1() {
    return 77;
}
var fruit = getWatermalon();
console.log("Fruit Name : " + fruit);
var fruit1 = getFruits1();
console.log("Fruit1 Name : " + fruit1);
console.log("Get bY value Banana : " + FruitsName.Banana);
console.log("Get bY value Orange : " + FruitsName[66]);
