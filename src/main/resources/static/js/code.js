function getDropDownList(name, id) {
	var optionList = ["Saab", "Volvo", "BMW"];
    var combo = $("<select></select>").attr("id", id).attr("name", name);

    $.each(optionList, function (i, el) {
        combo.append("<option>" + el + "</option>");
    });

    //return combo;
    // OR
    $("#createselect").append(combo);
}

