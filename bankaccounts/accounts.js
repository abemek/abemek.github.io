(function () {
    "use strict"
    var accountInfoList = [];

    var create = (function () {
        var createAcct = function () {
            var accttype = document.getElementById("accountName").value;
            var deposit = document.getElementById("deposit").value;
            var getaccttype = function () { return accttype };
            var getdeposit = function () { return deposit };
            return {
                getaccttype: getaccttype,
                getdeposit: getdeposit
            }
        };
        return function () {
            accountInfoList.push(createAcct());
            displaytext();
        };
    })();


    var displaytext = function () {
        var acctstr = "";
        for (let acct of accountInfoList) {
            acctstr += `Account: ${acct.getaccttype()}  Balance: ${acct.getdeposit()} \n`;
        }
        console.log(acctstr);
        document.getElementById("textarea").value = acctstr;
    };
    window.onload = function () {
        document.getElementById("createaccbtn").onclick = create;
    }
})();