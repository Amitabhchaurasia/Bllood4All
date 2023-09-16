$(document).ready(function () {
    // Function to fetch donors based on the selected state, city, and blood group
    function getDonorsByLocationAndBloodGroup(state, city, bloodGroup) {
        $.ajax({
            type: "GET",
            url: `http://localhost:8082/blood/${bloodGroup}/${state}/${city}`,
            success: function (response) {
                $("#DonorTable").empty();
                if (response.length === 0) {
                    $("#DonorTable").text("No donors found for the selected criteria.");
                } else {
                    var table = $("<table>");
                    var headerRow = $("<tr>");
                    var headerColumns = ["Full Name", "Blood Group", "Mobile Number", "State", "City", "Availability Status"];
                    headerColumns.forEach(function (column) {
                        headerRow.append($("<th>").text(column));
                    });
                    table.append(headerRow);
                    response.forEach(function (donor) {
                        var donorRow = $("<tr>");
                        var donorColumns = [donor.fullName, donor.bloodGroup, donor.mobileNumber, donor.state, donor.city, donor.availabilityStatus];
                        donorColumns.forEach(function (column) {
                            donorRow.append($("<td>").text(column));
                        });
                        table.append(donorRow);
                    });
                    $("#DonorTable").append(table);
                }
            },
            error: function () {
                $("#DonorTable").text("Error fetching donor data.");
            }
        });
    }

    // Function to handle the search button click
    $("#Search").on("click", function () {
        var state = $("#state-select").val();
        var city = $("#city-select").val();
        var bloodGroup = $("#bloodGroupDropdown").val();
        getDonorsByLocationAndBloodGroup(state, city, bloodGroup);
    });
});
