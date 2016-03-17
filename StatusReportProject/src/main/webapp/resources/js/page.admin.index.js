/**
 * Created by su on 3/14/16.
 */

$(document).ready(function () {
    $("#table").on("click", "#delete", function (e) {
        var data = {};
        data.uid = parseInt(e.target.getAttribute("uid"));
        var name = $("#csrf").attr("name");
        var value = $("#csrf").val();
        data[name] = value;
        var url = e.target.getAttribute("url")
        $.ajax({
            url: url,
            dataType: "json",
            method: "POST",
            data: data,
            //contentType: "application/json; charset=utf-8",
            success: function (data) {
                e.target.closest("tr").remove();
            },
            error: function () {
            }
        });
    }).on("click","#edit",function(e){
        var url = e.target.getAttribute("url")+"/" + e.target.getAttribute("uid");
        window.location.href = url;
    });



    $("#add_student").on("click", function (e) {

        window.location.href = e.target.getAttribute("url");
    });
});

