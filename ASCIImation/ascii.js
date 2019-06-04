
window.onload =  function(){
    let displayElem = document.getElementById("display");
    let startbtnElem = document.getElementById("startbtn");
    let stopbtnElem = document.getElementById("stopbtn");
    let animationsElem = document.getElementById("animation");
    let sizeElem = document.getElementById("size");
    let speedElem = document.getElementById("speed");
    startbtnElem.onclick = start;
    stopbtnElem.onclick = stop;
    speedElem.onclick = turbo;
}

function animationselector(){
    let choose = document.getElementById("animation").value;
    if(choose == "EXERCISE") return EXERCISE;
    else if(choose == "JUGGLER") return JUGGLER;
    else if(choose == "BIKE") return BIKE;
    else if(choose == "DIVE") return DIVE;
}

document.addEventListener('input', function (event) {
    if (event.target.id !== 'animation') return;
    else if (event.target.value === 'BLANK') { document.getElementById("display").value = "";}
	else if (event.target.value === 'EXERCISE') {document.getElementById("display").value = EXERCISE;}
	else if (event.target.value === 'JUGGLER') {document.getElementById("display").value = JUGGLER;}
	else if (event.target.value === 'BIKE') {document.getElementById("display").value = BIKE;}
    else if (event.target.value === 'DIVE') {document.getElementById("display").value = DIVE;}
}, false);


document.addEventListener('input', function (event) {
    if (event.target.id !== 'speed') return;
    if (event.target.checked) {
        control.delay = 50;
        control.stop();
        start();
    }
    else{
        control.delay = 250;
        control.stop();
        start();
	}
}, false);


document.addEventListener('input', function (event) {
    if (event.target.id !== 'size') return;
    if (event.target.value === '7pt') {document.getElementById("display").style.fontSize = "7px";}
    if (event.target.value === '10pt') {document.getElementById("display").style.fontSize = "10pt";}
	if (event.target.value === '12pt') {document.getElementById("display").style.fontSize = "12pt";}
	if (event.target.value === '16pt') {document.getElementById("display").style.fontSize = "16pt";}
	if (event.target.value === '24pt') {document.getElementById("display").style.fontSize = "24pt";}
    if (event.target.value === '32pt') {document.getElementById("display").style.fontSize = "32pt";}
}, false);


function start(){  
    document.getElementById("startbtn").disabled = true;
    document.getElementById("animation").disabled = true;
    document.getElementById("stopbtn").disabled = false;
    let animationArray =  animationselector().split("=====\n");
    let i = 0;
    function animator(){
        if(i < animationArray.length){
        document.getElementById("display").value = animationArray[i];
        i++;
        } else{
            i = 0;
            document.getElementById("display").value = animationArray[i];
        }
    }
    control.play(animator);
}

var control = {
    'playing' : false,
    'delay' : 250,
    'play' : function(a) { play =  setInterval(a, control.delay); control.playing = true;},
    'stop' : function(){ clearInterval(play); control.playing = false;}
}

function stop(){
    document.getElementById("startbtn").disabled = false;
    document.getElementById("animation").disabled = false;
    document.getElementById("stopbtn").disabled = true;
    control.stop();
    document.getElementById("display").value = animationselector();
}
