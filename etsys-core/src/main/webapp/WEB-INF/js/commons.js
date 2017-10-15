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
	},
	
	serializeByForm : function(data, type, stuId, courseId, testId) {
		var content = "[";
		$(data).each(function() {
			var jsonUnit = SerializeToJson.formToJson($(this).serialize());
			content += jsonUnit + ",";
		});
		content = content.substr(0, content.length - 1);
		content += "]";
		var json = {};
		json.tpId = 0;
		json.tpType = type;
		json.tpState = 2;
		json.stuId = stuId;
		json.courseId = courseId;
		json.testId = testId;
		json.tpContent = content;
		json = JSON.stringify(json);
		return json;
	}
	
};