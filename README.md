# Bllood4All
<h1 align="center" style="font-size: 36px;">About This Project</h1>
<h1 align="center">This Project Is Divided Into Two Parts</h1>

<center>
    <table border="1" align="center" width="150%">
        <thead>
            <tr>
                <th>Frontend</th>
                <th>Backend</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><img src="https://cdn2.iconfinder.com/data/icons/seo-web-2-3/128/Vigor_Html5-Html-Website-code-semantic-web-language-1024.png" width="150"></td>
                <td><img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" width="150"></td>
            </tr>
            <!-- Add more rows here if needed -->
        </tbody>
    </table>
</center>

<table align="center" >
  <tr>
    <th>Frontend</th>
  </tr>
  <tr>
    <td>
    <h3>For Fotend HTML, CSS, JAVASCRIPT, and for data processing AJAX was used.
    You Can Replace Fronted With You`s<h3>
    <h3>Here are the APIs you can use on the local machine with the same backend.</h3>
    <ul>
<li>http://localhost:8082/blood/${bloodGroup}/${state}/${city}--for finding blood using bloodGroup,state and city</li>
<li>http://localhost:8082/blood/${bloodGroup}--finding blood donor using blood group only</li>
<li>http://localhost:8083/login/${userID}/${password}--for login, so users can change there status of available</li>
<li>http://localhost:8083/login/${userID}--after login to fetch the data of the user.</li>
<li>http://localhost:8083/update/${userID}/${availabilityStatus}--to change the status of the available</li>
<li>http://localhost:8081/blood--to add new donors or new users (sign up)</li>

</ul>
    </td>
  </tr>

</table>

<table>
<tr>
<th>Backend</th>
</tr>

<tr>
<td>
<h3>Backend Dived into MICROSERVICES<h3>
    <h3>bloodDataInput--This Sevice is for adding new user , or donor , it have only one mapping for one api</h3>
    <ul>
<li>http://localhost:8081/blood--and to check what parameters it takes, visit bloodDonor.java file ,path of the file is src/main/java/bloodDataInput</li>
</ul>
<br>
<h3>BloodDonorList--This service is for listing all donors, based on the call</h3>
    <h3>It has two mapping for two API</h3>
    <ul>
<li>http://localhost:8082/blood/${bloodGroup}--it will provide the donor list by the blood group</li>
</ul>
</td>
<tr>
</table>
