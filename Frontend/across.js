$(document).ready(function () {
    // Function to fetch donors based on the selected blood group
    function getDonorsByBloodGroup(bloodGroup) {
        $.ajax({
            type: "GET",
            url: "http://localhost:8082/blood/" + bloodGroup,
            success: function (response) {
                if(response.length===0){
                    $("#DonorTable").text("NO Donor Found!");
                }else{
                    $("#DonorTable").empty();
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
                alert("Error fetching donor data.");
            }
        });
    }
    $("#searchBtn").on("click", function () {
        var selectedBloodGroup = $("#bloodGroupDropdown").val();
        getDonorsByBloodGroup(selectedBloodGroup);
    });
});