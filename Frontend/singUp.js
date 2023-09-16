
        $(document).ready(function() {
            // Function to handle the form submission
            $("#insertData").click(function(event) {
                event.preventDefault(); // Prevent the form from submitting normally

                // Get form data
                var name = $("#Name").val();
                var availability = $("#availabelStatus").find(':selected').val();
                var bloodGroup = $("#bloodGroupDropdown").find(':selected').val();
                var userId = $("#UserId").val();
                var password = $("#Password").val();
                var mobileNumber = $("#MobileNumber").val();
                var state = document.getElementById("state-select").value;
                var city = document.getElementById("city-select").value;

                // Create the data object to be sent to the server
                var formData = {
                    fullName: name,
                    availabilityStatus: availability,
                    bloodGroup: bloodGroup,
                    userId: userId,
                    password: password,
                    mobileNumber: mobileNumber,
                    state: state,
                    city: city
                };

                // Send the AJAX request to the server
                $.ajax({
                    type: "POST",
                    url: "http://localhost:8081/blood", 
                    data: JSON.stringify(formData),
                    contentType: "application/json",
                    success: function(response) {
                        // Handle the response from the server, if needed
                        if(response==="1"){
                            alert("Data already exists with the same User ID, Name, and Mobile Number.");
                        }else if(response==="2"){
                            alert("User ID already exists,choose another User ID");
                        }else if(response==="3"){
                            alert("Data already exists with the same Name and Mobile Number,Change Name or Mobile Number");
                        }else{
                        window.location.href = `login.html`;
                        alert("Account Created Sucessfully !!");
                        }
                        
                    },
                    error: function(error) {
                        // Handle any errors that occurred during the AJAX request
                        alert("Error something in backend data:",error);
                    }
                });
            });
        });
   