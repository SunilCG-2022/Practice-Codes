//Manipulating css
//$("h1").css("color","blue");

//Manipulating texts
//$("button").text("Don't click me");
//$("button").html("<em>Ok</em>");

//Manipulating attributes
//console.log($("img").attr(src));

//$("a[href='http://www.google.com/']").attr('href', 'https://www.youtube.com');

//Eventlistener
// $("button").click(function() {
//     $("h1").css("color","red");
// });

//changing h1 by typing the keyboard
$(document).keypress(function(event){
    $("h1").text(event.key);
});

//Animaitons for slide
$("button").on("click",function() {
   // $("h1").slideToggle();
    //opacity animate
    $("h1").animate({opacity:0.5});
});