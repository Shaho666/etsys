var SerializeToJson = {
	// 将从form中通过$('#form').serialize()获取的值转成json
	formToJson : function(data) {
		
		data = data.replace(/&/g, "\",\"");
		data = data.replace(/=/g, "\":\"");
		data = "{\"" + data + "\"}";
		
		var json = decodeURIComponent(data, true);
		return json;
	},
	
	JsonStringToJson : function(data) {
		var json = decodeURIComponent(data, true);
		return json;
	}
	
};