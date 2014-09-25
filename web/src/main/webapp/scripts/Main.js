var username;

$(function()
{
	addClickEventToRoomList();
	setNameInputFormBehaviour();

	Api.getRooms(function(data)
	{
		console.log(data);
		const roomList = document.getElementById("roomList");
		data.forEach(function(room)
		{
			roomList.innerHTML += "<li id=\"roomListItem-" + room.id + "\"  data-id=\""	 + room.id + "\">" + room.name + "</li>";
		});
	});
});

function addClickEventToRoomList()
{
	document.getElementById("roomList").addEventListener("click",function(e)
	{
		const roomId = $(e.target).data("id");
		joinRoom(roomId);
		console.log("User clicked room " + roomId);
	});
}

function setNameInputFormBehaviour()
{
	$("#nameSubmitForm").submit(function(event)
	{
		submitName();
		event.preventDefault();
	});
}

function submitName()
{
	username = $("#nameInput").val();
	console.log("Submit name " + username);
	$("#inputNameDiv").hide();
	$("#roomJoinDiv").show();
}

function joinRoom(roomId)
{
	Api.joinRoom(roomId, username, function()
	{
		$("#roomJoinDiv").hide();
		$("#insideRoomDiv").show();
		Api.getRoom(roomId, function(room)
		{
			updateRoom(room);
		});
	});
}

function updateRoom(room)
{
	console.log("update room");
	console.log(room);
	$("#insideRoomHeader").append(" " + room.name);
}

