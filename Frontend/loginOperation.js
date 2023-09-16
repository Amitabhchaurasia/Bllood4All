$(document).ready(function(){
    $("#availability").submit(function(event) {
        event.preventDefault();

        const userID = getUrlParameter('userID');
        const initialAvailabilityStatus = $("#initialAvailabilityStatus").val(); // Get the initial status from the hidden input
        const availabilityStatus = $(".AvailabilityStatusDropdown").val(); // Get the selected value from the dropdown

        // Making the AJAX call to update availability status
        $.ajax({
            url: `http://localhost:8083/update/${userID}/${availabilityStatus}`,
            type: "PUT",
            success: function(response) {
                // If the request is successful, handle the response here
                alert(response);
                
            },
            error: function(error) {
                console.error(error);
            }
        });
    });
    function getUrlParameter(name) {
        const urlParams = new URLSearchParams(window.location.search);
        return urlParams.get(name);
    }
})