var markers;
var bounds;

function plotMarkers(m) {
    markers = [];
    bounds = new google.maps.LatLngBounds();

    m.forEach(function (marker) {
        var position = new google.maps.LatLng(marker.lat, marker.lng);

        markers.push(
            new google.maps.Marker({
                position: position,
                map: map,
                animation: google.maps.Animation.DROP,
            })
        );

        bounds.extend(position);
    });

    map.fitBounds(bounds);
}

$(function () {});
