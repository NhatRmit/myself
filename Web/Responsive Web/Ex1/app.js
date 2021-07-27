var pre = window.pageYOffset;
window.onscroll = function () {
    var curr = window.pageYOffset;
    if(pre > curr) {
        document.getElementById('navbar').style.top = "0"
    } else {
        document.getElementById('navbar').style.top = "-1000px"
    } pre = curr;
}