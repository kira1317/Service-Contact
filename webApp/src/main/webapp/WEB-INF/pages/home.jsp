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
        <h3 class="text-muted" id="login">Login</h3>
    </div>

    <div class="jumbotron"  id="home">
        <h3>Home</h3>
        <div class="table-responsive">
            <table class="table table-striped">
                <tbody>

                <tr>
                    <td>First name</td>
                    <td><input id="firstName" type="text" size="22" /></td>
                </tr>

                <tr>
                    <td>Last name</td>
                    <td><input id="lastName" type="text" size="22" /></td>
                </tr>

                <tr>
                    <td>Date bith day</td>
                    <td>
                        <input id="day" type="text" size="2" />/
                        <input id="month" type="text" size="2" />/
                        <input id="year" type="text" size="2"  />
                    </td>
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

                <tr><td>*****</td></tr>

                <tr><td>*****</td></tr>

                <tr><td>*****</td></tr>

                </tbody>
            </table>
        </div>

        </br>
        <br>
        <select id="Ahobby">
            <option></option>
        </select>

        </br>
        <br>
        <p>
            <a class="btn btn-lg btn-success" href="#" role="button" id="addHobby"> Add Hobby </a>
        </p>
        </br>
        <br>

        <select id="Dhobby">
            <option></option>
        </select>
        </br>
        <br>

        <p>
            <a class="btn btn-lg btn-warning" href="#" role="button" id="deleteHobby">  Delete Hobby </a>
        </p>


    </div>


    <div class="jumbotron hidden" id="place">
        <h3>Place</h3>
        <div class="table-responsive">
            <table class="table table-striped">
                <tbody>

                <tr><td>*****</td> </tr>

                <tr><td>*****</td></tr>

                <tr><td>*****</td></tr>

                </tbody>
            </table>
        </div>
        <br>
        <br>
        <select id="Aplace">
            <option></option>
        </select>
        </br>
        <br>

        <p>
            <a class="btn btn-lg btn-success" href="#" role="button" id="addPlace"> Add Place</a>
        </p>

        </br>
        <br>
        <select id="Dplace">
            <option></option>
        </select>

        </br>
        <br>

        <p>
            <a class="btn btn-lg btn-warning" href="#" role="button" id="deletePlace">  Delete Place </a>
        </p>
    </div>

    <div class="jumbotron hidden" id="friends">
        <h3>Friends</h3>
        <div class="table-responsive">
            <table class="table table-striped">
                <tbody>

                <tr>

                    <td>*****</td>
                </tr>

                <tr>

                    <td>*****</td>
                </tr>

                <tr>

                    <td>*****</td>
                </tr>

                </tbody>
            </table>
        </div>

        <br>
        <p>

            <select id="AFriend">
                <option></option>
            </select>
            </br>
            <br>

        <p>
            <a class="btn btn-lg btn-success" href="#" role="button" id="AddFriend"> Add Friend</a>
        </p>

        <br>
        <select id="DFriend">
            <option></option>
        </select>

        </br>
        <br>

        <p>
            <a class="btn btn-lg btn-warning" href="#" role="button" id="deleteFriend">  Delete Friend </a>
        </p>

    </div>

    <div class="jumbotron hidden"  id="masseges">
        <h3>Masseges</h3>
        <h4>Contact</h4>

        <select id="Select1">
            <option></option>
        </select>

        <br />
        <br />
        <div class="stylemassage">
            History masseges<br />
            <input id="textMassege" type="text" />
            <br />
        </div>
        <p>
            <a class="btn btn-xs btn-primary" href="#" role="button" id="sendAMassege">Send a message</a>
        </p>
    </div>

    <footer class="footer">
        <p>© skillsup.java1.2015</p>
    </footer>

</div> <!-- /container -->





</body></html>