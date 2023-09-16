$(document).ready(function () {
    // Load the JSON data from the separate file
    $.getJSON('state.json', function (data) {
        // Populate the state drop-down
        var stateSelect = $('#state-select');
        $.each(data.states, function (index, state) {
            stateSelect.append($('<option>').text(state.state).val(state.state));
        });

        // Handle state selection change event
        stateSelect.on('change', function () {
            var selectedState = $(this).val();
            var citySelect = $('#city-select');
            citySelect.empty(); // Clear existing options
            if (selectedState !== "") {
                var cities = data.states.find(state => state.state === selectedState).cities;
                // Populate the city drop-down based on the selected state
                $.each(cities, function (index, city) {
                    citySelect.append($('<option>').text(city).val(city));
                });
            } else {
                citySelect.append($('<option>').text('Select a City').val(''));
            }
        });
    });
});