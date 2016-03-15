/**
 * Created by su on 3/14/16.
 */

$(document).ready(function () {
    $("#table").on("click", "#delete", function (e) {
        var data = {};
        data.uid = parseInt(e.target.getAttribute("uid"));
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
    });


    $("#add_student").on("click", function () {
        window.location.href = "/admin/add-student";
    });
});

