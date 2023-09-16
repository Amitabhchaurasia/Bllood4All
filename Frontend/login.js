$(document).ready(function() {
    // Attach event handler to the form submit
    $("#loginForm").submit(function(event) {
        event.preventDefault();

        // Get the values from the form
        const userID = $("#userID").val();
        const password = $("#password").val();

        // Construct the URL for the AJAX request
        const url = `http://localhost:8083/login/${userID}/${password}`;

        // Send the AJAX request
        $.ajax({
            url: url,
            type: "GET",
            success: function(response) {
                if (response === true) {
                    window.location.href = `loginOperation.html?userID=${userID}`;

                } else {
                    $("#result").text("User Not Found Or May Password is Wrong"); // Corrected selector
                }
            },
            error: function(xhr, status, error) {
                alert("Error: " + error);
            }
        });
    });
});