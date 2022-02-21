enum PrintMedia 
{
	Newspaper =1,
	Newsletter = getPrintMediaCode('Newsletter'),
	Magazine= Newspaper*3,
	Book=10
}

function getPrintMediaCode(mediaName: string):number {
    if (mediaName === 'newsletter')
    {
	 return 5;
	 
}
}
PrintMedia.Newsletter;  //return 5
PrintMedia.Magazine;   // return 15
