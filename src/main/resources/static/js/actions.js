$(function () {
    $("#pais_form").submit(function (e) {
        e.preventDefault();
        let data = {
            location: $("#location").val(),
        };
        app.getWeatherData(data);
    });

    if (document.querySelectorAll("#map").length > 0) {
        if (document.querySelector("html").lang) lang = document.querySelector("html").lang;
        else lang = "en";

        var js_file = document.createElement("script");
        js_file.type = "text/javascript";
        js_file.src =
            "https://maps.googleapis.com/maps/api/js?key=AIzaSyB5QHC-NWkIz-vXKqciWKLeGkFzdYnUrbE&callback=initMap&language=" +
            lang;

        document.getElementsByTagName("head")[0].appendChild(js_file);
    }
});
