var Api = (function()
{
    var pub = {},
    //Private property
    greyFloorTile = null;

    //Public property
    //pub.ingredient = "Bacon Strips";

    //Public method
    pub.getRooms = function()
    {
    	$.getJSON("api/web/room", function(data)
    	{
    		console.log(data);
    	});
    };

    //Private method
    /*
    function privateWay() {
        console.log("private method");
    }
	*/
    //Return just the public parts
    return pub;

}());