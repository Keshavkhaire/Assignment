var PrintMedia;
(function (PrintMedia) {
    PrintMedia[PrintMedia["Newspaper"] = 1] = "Newspaper";
    PrintMedia[PrintMedia["Newsletter"] = getPrintMediaCode('Newsletter')] = "Newsletter";
    PrintMedia[PrintMedia["Magazine"] = 3] = "Magazine";
    PrintMedia[PrintMedia["Book"] = 10] = "Book";
})(PrintMedia || (PrintMedia = {}));
function getPrintMediaCode(mediaName) {
    if (mediaName === 'newsletter') {
        return 5;
    }
}
PrintMedia.Newsletter; //return 5
PrintMedia.Magazine; // return 15
