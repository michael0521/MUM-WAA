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
        $.ajax({
            url: "/admin/delete",
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
        var url = "/admin/edit/" + e.target.getAttribute("uid");
        window.location.href = url;
    });



    $("#add_student").on("click", function () {
        window.location.href = "/admin/add";
    });
});

