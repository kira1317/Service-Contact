<!DOCTYPE html>
<html lang="en"><head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>My first Service Contacts</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/bootstrap.css" rel="stylesheet">
    <link href="resources/css/my-style.css" rel="stylesheet">
    <!-- Bootstrap core JS -->
    <script type="text/javascript" src="resources/jquery-2.1.4.js"></script>
    <script type="text/javascript" src="resources/jquery-ui.js"></script>
    <script type="text/javascript" src="resources/bootstrap.min.js" ></script>
    <script type="text/javascript" src="resources/my-js.js"></script>

    <!-- Bean -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="HobbyAll" scope="request" type="java.util.List"/>
    <jsp:useBean id="HobbyContact" scope="request" type="java.util.List"/>
    <jsp:useBean id="PlaceAll" scope="request" type="java.util.List"/>
    <jsp:useBean id="PlaceContact" scope="request" type="java.util.List"/>
    <jsp:useBean id="ContactAll" scope="request" type="java.util.List"/>
    <jsp:useBean id="FriendShipAll" scope="request" type="java.util.List"/>
    <jsp:useBean id="MassegeAll" scope="request" type="java.util.List"/>

    <jsp:useBean id="contactJ" scope="request" type="core.model.ContactDto"/>
    <jsp:useBean id="hobbyJ" scope="request" type="core.model.HobbyDto"/>
    <jsp:useBean id="placeJ" scope="request" type="core.model.PlaceDto"/>
    <jsp:useBean id="friendshipJ" scope="request" type="core.model.ContactDto"/>
    <jsp:useBean id="massegeJ" scope="request" type="core.model.MassegeDto"/>




</head>

<body>

<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active" ><a href="#"id="home1">Home</a></li>
                <li role="presentation"><a href="#" id="hobby1">Hobby</a></li>
                <li role="presentation"><a href="#" id="place1">Place</a></li>
                <li role="presentation"><a href="#" id="friends1" >Friends</a></li>
                <li role="presentation"><a href="#" id="writeMassege" >Write a massege</a></li>

                <li role="presentation"><a href="index.jsp">Exit</a></li>
            </ul>
        </nav>
        <h3 class="text-muted" id="login">${contactJ.firstName} ${contactJ.lastName}</h3>
    </div>

    <div class="jumbotron"  id="home">
        <h3>Home</h3>
        <div class="table-responsive">
            <table class="table table-striped">
                <tbody>

                <tr>
                    <td>First name</td>
                    <td><input id="firstName" type="text" size="22" value="${contactJ.firstName}" /></td>
                </tr>

                <tr>
                    <td>Last name</td>
                    <td><input id="lastName" type="text" size="22" value="${contactJ.lastName}" /></td>
                </tr>

                <tr>
                    <td>Date bith day</td>
                    <td><input id="data" type="text" size="22" value="${contactJ.birthDate}" /></td>
                </tr>

                </tbody>
            </table>
        </div>

        <p>
            <a class="btn btn-lg btn-success" href="#" role="button" id="saveEditContact"> Save edit contact </a>
            <a class="btn btn-lg btn-warning" href="#" role="button" id="deleteContact">  Delete contact </a>
        </p>

    </div>


    <div class="jumbotron hidden" id="hobby">
        <h3>Hobby</h3>
        <div class="table-responsive">
            <table class="table table-striped">
                <tbody>
                <c:forEach items="${HobbyContact}" var="hobbyJ">
                    <tr>
                        <td>
                            <option>${hobbyJ.title}</option>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div id="Ahobby" class="form-group">
            <label for="hobbySelect">Select hobby</label>
            <select class="form-control" id="hobbySelectAll">
                <c:forEach items="${HobbyAll}" var="hobbyJ">
                    <option>${hobbyJ.title}</option>
                </c:forEach>
            </select>
        </div>

        <p>
            <a class="btn btn-lg btn-success" href="#" role="button" id="addHobby"> Add Hobby </a>
        </p>


        <div id="Dhobby" class="form-group">
            <label for="hobbySelect">Select hobby</label>
            <select class="form-control" id="hobbySelect">
                <c:forEach items="${hobbyContact}" var="hobbyJ">
                    <option>${hobbyJ.title}</option>
                </c:forEach>
            </select>
        </div>

        <p>
            <a class="btn btn-lg btn-warning" href="#" role="button" id="deleteHobby">  Delete Hobby </a>
        </p>


    </div>


    <div class="jumbotron hidden" id="place">
        <h3>Place</h3>
        <div class="table-responsive">
            <table class="table table-striped">
                <tbody>
                <c:forEach items="${PlaceContact}" var="placeJ">
                    <tr>
                        <td>
                            <option>${placeJ.title}</option>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div id="Aplace" class="form-group">
            <label for="placeSelect">Select place</label>
            <select class="form-control" id="placeSelectAll">
                <c:forEach items="${PlaceAll}" var="placeJ">
                    <option>${placeJ.title}</option>
                </c:forEach>
            </select>
        </div>

        <p>
            <a class="btn btn-lg btn-success" href="#" role="button" id="addPlace">Add Place</a>
        </p>

        <div id="Dplace" class="form-group">
            <label for="placeSelect">Select place</label>
            <select class="form-control" id="placeSelect">
                <c:forEach items="${PlaceContact}" var="placeJ">
                    <option>${placeJ.title}</option>
                </c:forEach>
            </select>
        </div>

        <p>
            <a class="btn btn-lg btn-warning" href="#" role="button" id="deletePlace">  Delete Place </a>
        </p>
    </div>

    <div class="jumbotron hidden" id="friends">
        <h3>Friends</h3>
        <div class="table-responsive">
            <table class="table table-striped">
                <tbody>
                <c:forEach items="${FriendShipAll}" var="contactJ">
                    <tr>
                        <td>
                            <option>${contactJ.firstName}</option>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <p>

        <div id="AFriend" class="form-group">
            <label for="friendSelect">Select contact</label>
            <select class="form-control" id="friendSelectAll">
                <c:forEach items="${ContactAll}" var="contactJ">
                    <option>${contactJ.firstName}</option>
                </c:forEach>
            </select>
        </div>

        <p>
            <a class="btn btn-lg btn-success" href="#" role="button" id="AddFriend">Add Friend</a>
        </p>

        <div id="DFriend" class="form-group">
            <label for="friendSelect">Select friend</label>
            <select class="form-control" id="friendSelect">
                    <c:forEach items="${FriendShipAll}" var="contactJ">
                        <option>${contactJ.firstName}</option>
                    </c:forEach>
            </select>
        </div>

        <p>
            <a class="btn btn-lg btn-warning" href="#" role="button" id="deleteFriend">  Delete Friend </a>
        </p>

    </div>

    <div class="jumbotron hidden"  id="masseges">
        <h3>Masseges</h3>
        <br>
        </br>


        <div id="ContactMassege" class="form-group">
            <label for="friendSelect">Select contact</label>
            <select class="form-control" id="contactSelectAll">
                <c:forEach items="${ContactAll}" var="contactJ">
                    <option>${contactJ.firstName}==={massegeJ.to.firstName}</option>
                </c:forEach>
            </select>
        </div>


        <div>

              <c:forEach items="${MassegeAll}" var="massegeJ">
                <option>

                  <p>
                     ${massegeJ.content}
                  </p>

                  <p>
                     ${massegeJ.dateMassege}
                  </p>

                </option>
              </c:forEach>

        </div>


        <div class="stylemassage">

            <br />
                <input id="textMassege" type="text" />
            <br />
        </div>
        <br>
        <p>
            <a class="btn btn-xl btn-primary" href="#" role="button" id="sendAMassege">Send a message</a>
        </p>
    </div>

    <footer class="footer">
        <p>© skillsup.java1.2015</p>
    </footer>

</div> <!-- /container -->





</body></html>