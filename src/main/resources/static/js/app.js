let map;

function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: -34.397, lng: 150.644 },
        zoom: 8,
    });

    // fetch("https://raw.githubusercontent.com/jayshields/google-maps-api-template/master/markers.json").then(function (
    //     response
    // ) {
    //     return response.json();
    // });
    // .then(plotMarkers);
}

let app = (function () {
    let marker;

    let setWeatherData = function (JSONdata) {
        $("#weather_data").html(JSON.stringify(JSONdata));
    };

    let setWeatherMap = function (JSONdata) {
        bounds = new google.maps.LatLngBounds();
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
                console.log(data);
                setWeatherData(data);
                setWeatherMap(data);
            },
            "json"
        );
    };

    return {
        getWeatherData: getWeatherData,
    };
})();
