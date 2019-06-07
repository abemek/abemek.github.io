(function(){
    "use strict";
$(function(){
    
    let end = false;
    let won = false;
    let wrongMove = false;
    $("#maze").find( "div.boundary" ).mouseover(function() {
        if(!end && !won){
        $("#maze").find( "div.boundary" ).addClass("youlose");
        $("#status").text("You Lose! Click S to play again.");
        end = true;}
    });
    $( "#start" ).click(function() {
        $( "div.boundary" ).removeClass("youlose");
        $("#status").text("Click S to start again.");
        end = false;
        won = false;
        wrongMove = false;    
    });
    $( "#end" ).mouseover(function() {
        if(!end && !wrongMove){
        $("#status").text("You Won! Click S to play again.");
        won = true;}
    });
    $("#maze").mouseleave(function(){
        wrongMove = true;});
    $("#start").mouseover(function(){
        wrongMove = false;});
});})();
