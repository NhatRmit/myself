var preScroll = window.pageYOffset;
window.onscroll = function(){
    var currScroll = window.pageYOffset;
    if(preScroll > currScroll){
        document.getElementById("navbar").style.top = "0"
    } else {
        document.getElementById("navbar").style.top = "-64px"
    }
    preScroll = currScroll;
}