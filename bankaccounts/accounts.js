(function () {
    "use strict";
    let accountInfoList = [];

    let create = (function () {
        let createAcct = function () {
            let accttype = document.getElementById("accountName").value;
            let deposit = document.getElementById("deposit").value;
            let getaccttype = function () { return accttype; };
            let getdeposit = function () { return deposit; };
            return {
                getaccttype: getaccttype,
                getdeposit: getdeposit
            };
        };
        return function () {
            accountInfoList.push(createAcct());
            displaytext();
        };
    })();


    let displaytext = function () {
        let acctstr = "";
        for (let acct of accountInfoList) {
            acctstr += `Account: ${acct.getaccttype()}  Balance: ${acct.getdeposit()} \n`;
        }
        document.getElementById("textarea").value = acctstr;
    };
    window.onload = function () {
        document.getElementById("createaccbtn").onclick = create;
    };
})();