var Api = (function()
{
    var pub = {},
    //Private property
    greyFloorTile = null;

    //Public property
    //pub.ingredient = "Bacon Strips";

    //Public method
    pub.getRooms = function(callback)
    {
    	$.getJSON("api/web/room", function(data)
    	{
    		callback(data);
    	});
    };

	pub.joinRoom = function(roomId, username, callback)
	{
		console.log("player " + username + " joining room " + roomId);
		$.post("api/web/room/" + roomId + "/player", username, function(data)
		{
			console.log("Success");
			console.log(data);
			callback();
		});
	};

	pub.getRoom = function(roomId, callback)
	{
		$.getJSON("api/web/room/" + roomId, function(data)
		{
			callback(data);
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