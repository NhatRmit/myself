//Attributes
const button = document.querySelector('button')
const body = document.querySelector('body')
const colors = ['red', 'green', 'blue', 'yellow', 'pink', 'purple']


//Functions
function changeBackground() {
    const colorsList = parseInt(Math.random()*colors.length)
    document.body.style.backgroundColor = colors[colorsList]
}

//Setup & Call Functions
document.body.style.backgroundColor = 'violet'
button.addEventListener ('click', changeBackground)