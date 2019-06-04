'use strict'
var finalFsize;
var fontsz = "0px";
var timerId = null;

function convertPigLatin(str) {
    var pigLatin = '';
    var regex = /[aeiou]/gi;
    if (str[0].match(regex)) {
        pigLatin = str + 'way';
    } else {
        var vowelIndice = str.indexOf(str.match(regex)[0]);
        pigLatin = str.substr(vowelIndice) + str.substr(0, vowelIndice) + 'ay';
    }
    document.getElementById("textarea").value = pigLatin;
}


function getComputedStyle() {
    fontsz = parseInt(fontsz) + 2 + "pt";
    document.getElementById("textarea").style.cssText = `font-size: ${fontsz}`;
    // alert(fontsz);
}

window.onload = function () {
    document.getElementById("button").onclick = function () {
        // document.getElementById("textarea").style.fontsz = "24px";
        // getComputedStyle();
        if (timerId === null) {
            timerId = setInterval(getComputedStyle, 500);
        } else {
            clearInterval(timerId);
            timerId = null;
        }
    };

    document.getElementById("checkbox").onchange = function () {
        alert("Bling has changed!");
        if (document.getElementById("checkbox").checked === true) {
            document.getElementById("textarea").style.fontWeight = "bold";
            document.getElementById("textarea").style.color = "green";
            document.getElementById("textarea").style.textDecoration = "underline";
            document.body.style.backgroundImage = "url(http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg)";

        } else {
            document.getElementById("textarea").style.fontWeight = "normal";
            document.getElementById("textarea").style.color = "black";
            document.getElementById("textarea").style.textDecoration = "none";
            document.body.style.backgroundImage = "none";

        }
    };
    document.getElementById("textarea").value = "Sample Item 1 \nSample Item 2";
    document.getElementById("textarea").style.cssText = 'font-size: 12pt';
    fontsz = document.getElementById("textarea").style.fontSize;
    document.getElementById("btnpiglatin").onclick = function () { convertPigLatin(document.getElementById("textarea").value); };
};