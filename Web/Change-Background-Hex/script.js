//Attribute
const button = document.querySelector('#btn')
const body = document.querySelector('body')
const hexList = [0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F']
const hexvalue = document.querySelector('#hex-value')

//Functions
function changeHexValue () {
    let hex = '#'
    for (let i=0; i<6; i++){
        const index = Math.floor(Math.random()*hexList.length)
        hex += hexList[index]
    }
    hexvalue.textContent = hex
    document.body.style.backgroundColor = hex
}

//Setup-Call
document.body.style.backgroundColor = 'violet'
button.addEventListener('click', changeHexValue)