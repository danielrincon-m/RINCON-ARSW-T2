let map;

function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: 4.6097, lng: -74.0817 },
        zoom: 9,
    });
}

let app = (function () {
    let marker;

    let firstRowData = function (data) {
        let html = "<tr>";
        html += "<td>" + data.id + "</td>";
        html += "<td>" + data.name + "</td>";
        html += "<td>" + data.timezone + "</td>";
        html += "<td>" + data.visibility + "</td>";
        html += "<td>" + data.coord.lat + "</td>";
        html += "<td>" + data.coord.lon + "</td>";
        html += "</tr>";
        return html;
    };

    let secondRowData = function (data) {
        let html = "<tr>";
        html += "<td>" + data.main.humidity + "</td>";
        html += "<td>" + data.main.temp + "</td>";
        html += "<td>" + data.main.temp_min + "</td>";
        html += "<td>" + data.main.temp_max + "</td>";
        html += "<td>" + data.main.feels_like + "</td>";
        html += "</tr>";
        return html;
    };

    let thirdRowData = function (data) {
        let html = "<tr>";
        html += "<td>" + data.sys.country + "</td>";
        html += "<td>" + data.sys.sunrise + "</td>";
        html += "<td>" + data.sys.sunset + "</td>";
        html += "<td>" + data.wind.speed + "</td>";
        html += "<td>" + data.weather[0].main + "</td>";
        html += "<td>" + data.weather[0].description + "</td>";
        html += "</tr>";
        return html;
    };

    let setWeatherData = function (data) {
        $("#table_1").find("tbody").html(firstRowData(data));
        $("#table_2").find("tbody").html(secondRowData(data));
        $("#table_3").find("tbody").html(thirdRowData(data));
        $("#tables-container").css("display", "block");
    };

    let setWeatherMap = function (JSONdata) {
        let position = new google.maps.LatLng(JSONdata.coord.lat, JSONdata.coord.lon);
        if (marker) {
            marker.setMap(null);
        }

        marker = new google.maps.Marker({
            position: position,
            map: map,
            animation: google.maps.Animation.DROP,
        });
        marker.setMap(map);

        map.setCenter(position);
    };

    let getWeatherData = function (data) {
        $.get(
            "/get/weather/" + data.location,
            data,
            function (data, textStatus, jqXHR) {
                setWeatherData(data);
                setWeatherMap(data);
            },
            "json"
        ).fail(function (data) {
            alert("Ha ocurrido un error al procesar la solicitud.");
        });
    };

    return {
        getWeatherData: getWeatherData,
    };
})();
