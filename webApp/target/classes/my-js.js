$(document).ready(function () {


    function clearNavSelection() {
        $('.nav ul li').removeClass("active");

        $('#home').addClass("hidden");
        $('#place').addClass("hidden");
        $('#hobby').addClass("hidden");
        $('#friends').addClass("hidden");
        $('#masseges').addClass("hidden");

        $("#home1").parent('li').removeClass("active");
        $("#place1").parent('li').removeClass("active");
        $("#hobby1").parent('li').removeClass("active");
        $("#friends1").parent('li').removeClass("active");
        $("#writeMassege").parent('li').removeClass("active");

    };


    $("#home1").click(function () {
        clearNavSelection();
        $("#home1").parent('li').addClass("active");
        $('#home').removeClass("hidden");




    });


    $("#place1").click(function () {
        clearNavSelection();
        $("#place1").parent('li').addClass("active");
        $('#place').removeClass("hidden");
    });


    $("#hobby1").click(function () {
        clearNavSelection();
        $("#hobby1").parent('li').addClass("active");
        $('#hobby').removeClass("hidden");
    });


    $("#friends1").click(function () {
        clearNavSelection();
        $("#friends1").parent('li').addClass("active");
        $('#friends').removeClass("hidden");
    });


    $("#writeMassege").click(function () {
        clearNavSelection();
        $("#writeMassege").parent('li').addClass("active");
        $("#masseges").removeClass("hidden");

    });



    $('#saveEditContact').click(function () {

        var firstName = $('#firstName').text();
        var lastName = $('#lastName').text();
        var day = $('#day').val();
        var month = $('#month').val();
        var year = $('#year').val();


        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"firstName": "' + firstName + '", "lastName": "' + lastName + '", "dateBithDay": "' + day + '.' + month + '.' + year + '"}',


            error: function (data) {
                alert('error' + data);
            },

            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }



            }

        });

    });



    $('#deleteContact').click(function () {

        var login = $('#login').text();


        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"login": "' + login + '"}',

            error: function (data) {
                alert('error' + data);
            },


            dataFilter: function () {
                alert('dataFilter');
            },

            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }



            }

        });




    });




    $('#addHobby').click(function () {

        var addHobby = $('#Ahobby').text();

        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"hobby": "' + addHobby + '"}',

            error: function (data) {
                alert('error' + data);
            },


            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }



            }

        });

    });




    $('#deleteHobby').click(function () {

        var deleteHobby = $('#Dhobby').text();



        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"hobby": "' + deleteHobby + '"}',

            error: function (data) {
                alert('error' + data);
            },

            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }



            }
        });

    });



    $('#addPlace').click(function () {

        var addplace = $('#Aplace').text();

        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"place": "' + addplace + '"}',

            error: function (data) {
                alert('error' + data);
            },

            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }

            }

        });

    });





    $('#deletePlace').click(function () {

        var deletePlace = $('#DPlace').text();


        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"Place": "' + deletePlace + '"}',

            error: function (data) {
                alert('error' + data);
            },

            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }

            },

        });

    });



    $('#AddFriend').click(function () {

        var addFriend = $('#AFriend').text();

        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"Friend": "' + addFriend + '"}',

            error: function (data) {
                alert('error' + data);
            },

            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }

            },

        });

    });


    $('#deleteFriend').click(function () {

        var deleteFriend = $('#DFriend').text();

        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"Friend": "' + deleteFriend + '"}',

            error: function (data) {
                alert('error' + data);
            },

            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }

            }

        });

    });



    $('#sendAMassege').click(function () {

        var textMassege = $('#textMassege').text();

        $.ajax({
            type: "POST",
            url: '/clientOrder',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"Massege": "' + textMassege + '"}',

            error: function (data) {
                alert('error' + data);
            },

            success: function (data) {
                alert('success');

                if (data.status === 'OK') {
                    updateStatus(data.barStatus);
                    displayClientOrderSuccess();
                }

                else {
                    displayError(data.errorMessage);
                }

            }

        });

    });


});


