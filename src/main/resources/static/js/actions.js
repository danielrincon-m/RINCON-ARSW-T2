$(function () {
    $("#pais_form").submit(function (e) {
        e.preventDefault();
        let data = JSON.stringify($("#pais_form").serializeArray()[0]);
        app.getWeatherData(data);
    });
});
